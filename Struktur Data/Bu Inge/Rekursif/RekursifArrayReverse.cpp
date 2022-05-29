#include <iostream>
using namespace std;

void RekursifArrayReverse(int *Array, int awal, int akhir){

    int temp;

    if (awal < akhir)
    {
        temp = Array[awal];
        Array[awal] = Array[akhir];
        Array[akhir] = temp;
        RekursifArrayReverse(Array, awal + 1, akhir - 1);
    }

}

int main()
{
    
    const int maxArr = 5;
    int array[maxArr] = {1, 2, 3, 4, 5};
    cout << "\nProgram Rekursif Array Reverse !" << endl;
    cout << "Array Mula-Mula : [ ";
    for (auto &&dataNumber : array)
    {
        cout << dataNumber << " ";
    }
    cout << "]";
    
    RekursifArrayReverse(array, 0, maxArr - 1);

    cout << "\nArray Sekarang : [ ";
    for (auto &&dataNumber : array)
    {
        cout << dataNumber << " ";
    }
    cout << "]";


    return 0;

}
