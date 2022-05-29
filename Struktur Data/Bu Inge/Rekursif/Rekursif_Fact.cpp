#include <iostream>
using namespace std;

int Rekursif_Faktorial(int Deret) {

    if (Deret == 0 || Deret == 1)
    {
        return 1;
    }
    else
    {
        return (Deret * Rekursif_Faktorial(Deret - 1));
    }
    

}

int main()
{
    
    int deret = 0;
    int Hasil = 0;

    cout << "Program Rekursif Faktorial !" << endl << endl;
    
    cout << "Masukkan faktorial deret ke berapa ? \n";
    cin >> deret;

    Hasil = Rekursif_Faktorial(deret);

    cout << "Hasilnnya, Faktorial ke-" << deret << " : " << Hasil;

    return 0;
}
