#include <iostream>
using namespace std;

void TOH(int nCakram, string start, string mid, string finish){
    
    if (nCakram == 1)
    {
        cout << "Pindahkan lempengan ke 1 dari tiang " << start << " ke tiang " << finish << endl;
    }
    else
    {
        TOH(nCakram-1, start, finish, mid);
        cout << "Pindahkan lempengan ke " << nCakram << " dari tiang " << start << " ke tiang " << finish << endl;
        TOH(nCakram-1, mid, start, finish);
    }
    
}

int main() {
    
    string t1 = "A";
    string t2 = "B";
    string t3 = "C";
    int n;

    cout << "Masukkan jumlah lempengan : ";
    cin >> n;
    cout << endl;

    TOH(n, t1, t2, t3);

    return 0;
}