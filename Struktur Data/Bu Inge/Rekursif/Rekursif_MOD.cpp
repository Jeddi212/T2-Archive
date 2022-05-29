#include <iostream>
using namespace std;

int RekursifMOD(int number, int divider) {

    if (number < divider)
    {
        return number;
    }
    else
    {
        return RekursifMOD(number - divider, divider);
    }
    

}


int main()
{
    
    int Hasil = 0;
    int Pembilang, Penyebut;

    cout << "Program Rekursif MOD !" << endl << endl;

    cout << "Masukkan angka pembilang : ";
    cin >> Pembilang;

    cout << "Masukkan angka penyebut : ";
    cin >> Penyebut;

    Hasil = RekursifMOD(Pembilang, Penyebut);

    cout << "Hasil " << Pembilang << " MOD " << Penyebut << " : ";
    cout << Hasil;

    return 0;
}
