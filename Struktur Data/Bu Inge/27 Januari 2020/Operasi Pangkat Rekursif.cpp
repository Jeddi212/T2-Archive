#include <iostream>
using namespace std;

int Fpangkat(int angka, int n){
    
    int pangkat;
    
    if (n == 0)
    {
        pangkat = 1;
    }
    else
    {
        pangkat = angka*(Fpangkat(angka, n-1));
    }

    return pangkat;

}

int main() {

    int Hasil;
    int x, y;

    cout << "Masukkan angka : ";
    cin >> x;
    cout << endl;

    cout << "Masukkan Pangkat : ";
    cin >> y;
    cout << endl;

    Hasil = Fpangkat(x, y);

    cout << "Hasilnya : " << Hasil;
    return 0;
}