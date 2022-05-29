//* Nim  : 1119023
//* Nama : Jedediah Fanuel

#include <iostream>
using namespace std;

struct BST {

    int Data;
    int Count;
    BST *Left;
    BST *Right;

};

// Deklarasi Pointer
BST *root = NULL;

void MENU(int &input) {
    
    cout << "Silahkan Pilih Menu (Pilih Angka): " << endl;
    cout << "1. Insert Tree" << endl;
    cout << "2. Serach Tree" << endl;
    cout << "3. EXIT PROGRAM" << endl;
    cout << "--> ";
    cin >> input;
    
}

void bst_insert(int data, BST *P) {

    if (P == NULL)
    {
        BST *temp = new BST();
        temp->Data = data;
        temp->Count = 1;
        temp->Left = NULL;
        temp->Right = NULL;
        P = temp;
        cout << "Berhasil input root ";

    }
    else
    {

        if (data < P->Data) {
            bst_insert(data, P->Left);
        } else if (data > P->Data) {
            bst_insert(data, P->Right);
        } else {
            P->Count += 1;
            cout << "Data sudah ada, jumlah data ditambahkan\n";
        }
        
    }
}

void bst_search(BST *root, int dicari, bool &ditemukan, int &jum) {

    BST *Q = new BST();
    Q = root;
    ditemukan = false;

    while (Q != NULL && !ditemukan)
    {
        if (dicari < Q->Data)
        {
            Q = Q->Left;
        }
        else if (dicari > Q->Data)
        {
            Q = Q->Right;
        }
        else
        {
            ditemukan = true;
            jum = Q->Count;
        }
        
    }

}


int main()
{
    int masukkan_user = 0;
    int n = 0;
    int jumlah = 0;
    bool exit = false;
    bool ketemu = false;

    cout << "\nProgram Binary Search Tree\n";
    while (!exit)
    {
        MENU(masukkan_user);
        switch (masukkan_user)
        {
        case 1:
            cout << "Masukkan Data : ";
            cin >> n;
            bst_insert(n, root);
            cout << "Input data berhasil\n\n";
            break;
        case 2:
            cout << "Masukkan Data yang dicari : ";
            cin >> n;
            bst_search(root, n, ketemu, jumlah);
            if (ketemu)
            {
                cout << "Data " << n << " ditemukan, jumlah : " << jumlah << endl << endl;
            }
            else
            {
                cout << "Data " << n << " tidak ditemukan\n\n";
            }
            break;
        case 3:
            cout << "Terima Kasih";
            exit = true;
            break;
        default:
            cout << "Invalid Input\n\n";
            break;
        }
        
    }
    
    return 0;
}