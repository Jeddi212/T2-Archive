#include <iostream>
using namespace std;

int Ffibonacci(int n){
    
    int hasil;
    
    if (n == 0)
    {
        hasil = 0;
    }
    else if (n == 1)
    {
        hasil = 1;
    }
    else
    {
        hasil = Ffibonacci(n-1) + Ffibonacci(n-2);
    }

    return hasil;

}

int main() {

    int Hasil;
    int x;

    cout << "Deret Fibonacci ke : ";
    cin >> x;
    cout << endl;

    Hasil = Ffibonacci(x);

    cout << "Hasilnya : " << Hasil;

    return 0;
}
