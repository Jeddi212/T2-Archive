#include <iostream>
using namespace std;

// Rekursif Bakter, setiap jam
// Jumlah bakteri akan bertambah 3 kali lipat

int RekursifBakteri(int jumlah, int waktu){
    if (waktu == 0)
    {
        return jumlah;
    }
    else
    {
        return (3 * RekursifBakteri(jumlah, (waktu - 1)));
    }
    
}

int main()
{
    
    //*Deklarasi
    int bakteri = 0;
    int waktu = 0;

    //*Code Pembuka
    cout << "Program Menghitung Jumlah Bakteri." << endl;
    
    cout << "Masukkan Jumlah Bakteri : ";
    cin >> bakteri;

    cout << "Masukkan Jumlah Waktu : ";
    cin >> waktu;

    cout << "Jumlah Bakter sekarang : " << RekursifBakteri(bakteri, waktu);

    return 0;
}

