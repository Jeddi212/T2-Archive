//* Nama : Jedediah Fanuel
//* Nim  : 1119023

#include <iostream>
using namespace std;

//!Deklarasi Struct (NODE)
struct Node {
    int Nim;
    string Nama;
    Node *Next;
};

//!Deklarasi Pointer
Node *Head = NULL;
Node *Tail = NULL;


void MENU(int &input) {
    
    cout << "Silahkan Pilih Menu (Pilih Angka): " << endl;
    cout << "1. Add First" << endl;
    cout << "2. Add Last" << endl;
    cout << "3. Add After" << endl;
    cout << "4. Delete Node" << endl;
    cout << "5. Print List" << endl;
    cout << "6. EXIT PROGRAM" << endl;
    cout << "Pilihan Anda (angka) : ";
    cin >> input;
    
}

void Add_First(int nim, string nama) {

    Node *p = new Node();
    p->Nim = nim;
    p->Nama = nama;

    if (Head == NULL)
    { //*Kosong
        
        Tail = p;
        Head = p;
        Tail->Next = p; // Tail->Next = Head	

    }
    else
    { //*Isi
        
        p->Next = Head;
        Head = p;
        Tail->Next = p; //Tail->Next = Head

    }
    // Tail->Next = p;

}

void Add_Last(int nim, string nama) {

    Node *p = new Node();
    p->Nim = nim;
    p->Nama = nama;

    if (Head == NULL)
    { //*Kosong
        
        Tail = p;
        Head = p;
        Tail->Next = p; //Tail->Next = Head

    }
    else
    { //*Isi
        
        Tail->Next = p;
        p->Next = Head;
        Tail = p;

    }

}

void Add_After(int nim, string nama) {

    Node *p = new Node();
    p->Nim = nim;
    p->Nama = nama;

    Node *q = new Node();
    q = Head;

    int cari;
    cout << "Selipkan data setelah NIM ?" << endl;
    cin >> cari;
    cout << endl;

    bool found = false;
    do {

        if (q->Nim == cari)
        {
            
            found = true;

        }
        else
        {
            
            q = q->Next;

        }

    } while (q != Head && !found);
    
    if (found)
    {

        p->Next = q->Next;
        q->Next = p;
        
        if (q == Tail)
        {
            
            Tail = p;

        }

    }
    else
    {
        
        cout << "NIM tidak ditemukan !\n" << endl;

    }

}

void Delete_Node(int Cari_NIM) {

    Node *saver = new Node();
    saver = Head;

    Node *hapus = new Node();
    hapus = Head;

    bool found = false;
    do {

        if (hapus->Nim == Cari_NIM)
        {
            
            found = true;

        }
        else
        {
            
            saver = hapus;
            hapus = hapus->Next;

        }
        
    } while (hapus != Head && !found);

    if (found)
    {
        
        if (hapus == Head && hapus == Tail)
        {
            
            Head = NULL;
            Tail = NULL;
            //delete hapus;

        }
        else if (hapus == Head)
        {
            
            Head = Head->Next;
            Tail->Next = Head;
            //delete hapus;

        }
        else if (hapus == Tail)
        {
            
            Tail = saver;
            Tail->Next = Head;
            //delete hapus;

        }
        else
        {

            saver->Next = hapus->Next;
            //delete hapus;

        }

        delete hapus;
        
    }
    else
    {
        
        cout << "NIM tidak ditemukan !!!\n";
        cout << endl;

    }
    
}

void Print_List(Node *print) {
    
    cout << endl;
    cout << "List Sekarang : " << endl;

    do
    {

        cout << "Nim  : " << print->Nim << endl;
        cout << "Nama : " << print->Nama << endl;
        cout << endl;
        print = print->Next;

    } while (print != Head);
    
}

int main()
{
    
    bool found = true;

    int inputMenu = 0;
    
    int inputDelete = 0;
    int nimDelete;
    
    int simpen_Nim = 0;
    string simpen_Nama = "We Love Bu Inge";

    while (found)
    {
        
        MENU(inputMenu);

        switch (inputMenu)
        {
        case 1: //TODO Add First
            
            cout << "\nMASUKKAN NIM (pastikan angka) : ";
            cin >> simpen_Nim;
            cout << "MASUKKAN NAMA (Tanpa Spasi) : ";
            cin >> simpen_Nama;
            cout << endl;
            Add_First(simpen_Nim, simpen_Nama);

            break;
        
        case 2: //TODO Add Last
            
            cout << "\nMASUKKAN NIM (pastikan angka) : ";
            cin >> simpen_Nim;
            cout << "MASUKKAN NAMA (Tanpa Spasi) : ";
            cin >> simpen_Nama;
            cout << endl;
            Add_Last(simpen_Nim, simpen_Nama);

            break;

        case 3: //TODO Add After
            
            if (Head != NULL)
            {
                
                cout << "\nMASUKKAN NIM (pastikan angka) : ";
                cin >> simpen_Nim;
                cout << "MASUKKAN NAMA (Tanpa Spasi) : ";
                cin >> simpen_Nama;
                cout << endl;
                Add_After(simpen_Nim, simpen_Nama);

            }
            else
            {
                
                cout << "\nList Kosong\n\n";

            }

            break;

        case 4: //TODO Delete Node

            if (Head != NULL)
            {
                
                cout << "Input NIM yang ingin dihapus datanya : ";
                cin >> nimDelete;

                cout << endl << "Apakah anda yakin, data ini akan dihapus selamanya?\n";
                cout << "1. Iya\n";
                cout << "2. Tidak\n";
                cout << "Pilihan : ";
                cin >> inputDelete;
                cout << endl;
                
                switch (inputDelete)
                {
                case 1: //TODO confirm delete Node

                    Delete_Node(nimDelete);
                    break;

                default: //TODO cancel delete Node
                    
                    cout << "\nPenghapusan List Dibatalkan" << endl;
                    cout << endl;
                    break;

                }

            }
            else
            {
                
                cout << "\nList Kosong\n\n";

            }

            break;

        case 5: //TODO Print List

            if (Head != NULL)
            {
                
                Print_List(Head);

            }
            else
            {
                
                cout << "\nList Kosong\n\n";

            }
            
            break;

        case 6:
            
            cout << "\nTerima Kasih";
            cout << endl;
            found = false;

            break;

        default:
            
            cout << "\nInput anda tidak valid !!!\n\n";
            break;

        }

    }

    //We Love Bu Inge 4 Ever
    return 0;

}
