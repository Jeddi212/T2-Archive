#include <iostream>
using namespace std;

bool SearchArrayRekursifGoingUP(int *Array, int dicari, int bawah, int atas){
    
    if (bawah == atas)
    {
        
        return dicari == Array[bawah];

    }
    else
    {
        
        return (dicari == Array[bawah]) or SearchArrayRekursifGoingUP(Array, dicari, bawah + 1, atas);

    }
    
}

bool rekursifSearchGoingUp(int *Array, int dicari, int bawah, int atas){

    if (bawah <= atas)
    {

        if (dicari == Array[bawah])
        {
            return true;
        }
        else
        {
            return rekursifSearchGoingUp(Array, dicari, bawah + 1, atas);
        }
    
    }
    else
    {
        
        return false;

    }
        

}

int main()
{
    
    //*Deklarasi
    int ArrayNum[15] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    int atas;
    int bawah;
    int search;
    bool Hasil = true;

    cout << "Program Search angka pada array [Rekursif]." << endl;

    cout << "Masukkan Angka yang dicari : ";
    cin >> search;

    cout << "\nPastikan bawah < atas" << endl;

    cout << "Masukkan batas bawah : ";
    cin >> bawah;

    cout << "\nMasukkan batas atas : ";
    cin >> atas;

    Hasil = SearchArrayRekursifGoingUP(ArrayNum, search, bawah, atas);

    cout << endl;

    if (Hasil) //* Hasil == True
    {
        cout << "Data ditemukan !";
    }
    else //* Hasil != True
    {
        cout << "Data tidak ditemukan !";
    }

    return 0;
}
