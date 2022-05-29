#include <iostream>
using namespace std;

int RekursifDIV(int number, int divider) {

    if (number < divider)
    {
        return 0;
    }
    else
    {
        return (1 + (RekursifDIV(number - divider, divider)));
    }
    

}


int main()
{
    
    int Hasil = 0;
    int Pembilang, Penyebut;

    cout << "Program Rekursif DIV !" << endl << endl;

    cout << "Masukkan angka pembilang : ";
    cin >> Pembilang;

    cout << "Masukkan angka penyebut : ";
    cin >> Penyebut;

    Hasil = RekursifDIV(Pembilang, Penyebut);

    cout << "Hasil " << Pembilang << " DIV " << Penyebut << " : ";
    cout << Hasil;

    return 0;
}
