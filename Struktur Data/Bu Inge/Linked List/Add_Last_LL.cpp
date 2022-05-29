/*
Nama : Jedediah Fanuel
Nim  : 1119023
*/
#include <iostream>
using namespace std;

//!Deklarasi Struct (NODE)
struct Node {
    string Nama;
    int Usia;
    struct Node *Next;
};

//TODO Produce untuk Output
void print_list(Node * n) {
    while (n != NULL) {
        cout << endl;
        cout << "Nama : " << n->Nama << endl;
        cout << "Usia : " << n->Usia << endl;
        n = n->Next;
    }
}

int main() {

    //!Deklarasi Pointer
    Node *Head = NULL;
    Node *Second = NULL;
    Node *Third = NULL;

    //!Deklarasi Variable Input
    string simpen_Nama;
    int simpen_Usia;

    //Inisialisasi
    Head = new Node();
    Second = new Node();
    Third = new Node();

    //*Input Manual Data Node
    Head->Nama = "Jeddi";
    Head->Usia = 18;
    Head->Next = Second;

    Second->Nama = "Fanuel";
    Second->Usia = 17;
    Second->Next = Third;

    Third->Nama = "Jeddi-Fan";
    Third->Usia = 20;
    Third->Next = NULL;

    //TODO Print Data Awal
    cout << "Linked List Awal";
    print_list(Head);
    cout << endl;

    //*INPUT DATA BARU
    cout << "MASUKKAN NAMA (Tanpa Spasi)(atau 'KELUAR'): ";
    cin >> simpen_Nama;

    //TODO pengulangan Penambahan Node dari Belakang
    while (simpen_Nama != "KELUAR" && simpen_Nama != "keluar" && simpen_Nama != "Keluar")
    {
        cout << "MASUKKAN USIA (pastikan angka) : ";
        cin >> simpen_Usia;

        //!Deklarasi Pointer Temp
        Node *Temp = new Node();
        Temp->Nama = simpen_Nama; //!inisialisasi Struck Node Temp
        Temp->Usia = simpen_Usia; //!inisialisasi Struck Node Temp

        if (Head == NULL) //?Alias Linked List Masih Kosong
        {
            //?Node Temp->Next diganti valuenya dengan NULL sesuai value Head sebelumnya
            //?Agar nantinya 'NULL' pada Node Temp->Next sebagai penutup
            Temp->Next = Head;
            Head = Temp; //?Pointer Head yang tadinya 'NULL', 
                         //?diganti alamatnya dengan alamat Node pada pointer Temp
            
        } 
        else //?Alias Linked List Sudah Terisi
        {
            //!Deklarasi pointer untuk pengecekan 
            //!Pointer lain apakah NULL ?
            //!Pointer langsung diarahkan ke Node pertama
            Node *pointer_Checker = Head;
            while (pointer_Checker->Next != NULL) //?Pengulangan hingga ketemu Node->Next == NULL
            {
                pointer_Checker = pointer_Checker->Next;
            }

            //?Jika sudah ketemu Node Terakhir
            Temp->Next = pointer_Checker->Next; //*Pemindahan value NULL ke Node Temp->Next
            pointer_Checker->Next = Temp; //*Pemasangan Node Temp di akhir list
        }
        
        //TODO input untuk penambahan Node Baru
        cout << "MASUKKAN NAMA (Tanpa Spasi)(atau 'KELUAR'): ";
        cin >> simpen_Nama;
        
    }

    //TODO Print List dengan data yang sudah ditambahkan
    cout << "\nIsi Linked List Sekarang : ";
    print_list(Head);
    cout << endl;

    return 0;
}