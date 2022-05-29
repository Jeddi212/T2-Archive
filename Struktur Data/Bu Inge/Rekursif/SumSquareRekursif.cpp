#include <iostream>
using namespace std;

int RekursifSumSquareGoingUP(int start, int finish){

    if (start == finish)
    {
        return start * start;
    }
    else
    {
        return (start * start) + RekursifSumSquareGoingUP(start + 1, finish);
    }
    

}

int main()
{
    
    int awal = 0;
    int akhir = 0;

    cout << "Program Sum Square (Faktorial Persegi)." << endl;
    
    cout << "Masukkan batas bawah : ";
    cin >> awal;

    cout << "\nMasukkan batas atas : ";
    cin >> akhir;

    int Hasil = RekursifSumSquareGoingUP(awal, akhir);

    cout << "Hasil SumSquare : " << Hasil;

    return 0;
}
