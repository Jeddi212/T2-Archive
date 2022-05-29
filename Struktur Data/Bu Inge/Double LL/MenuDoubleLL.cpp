//*Nama : Jedediah Fanuel
//*Nim  : 1119023

/*
    MENU DOUBLE LINKED LIST :
    1. Add First
    2. Add Last
    3. Add After
    4. Delete One
    5. Print Forward
    6. Print Backward
*/

#include <iostream>
using namespace std;

//!Deklarasi Struct (NODE)
struct Node {
    int Nim;
    string Nama;
    Node *Prev;
    Node *Next;
};

//!Deklarasi Pointer
Node *printForward = NULL;
Node *printBackward = NULL;

void MENU(int &input) {
    
    cout << "Silahkan Pilih Menu (Pilih Angka): " << endl;
    cout << "1. Add First" << endl;
    cout << "2. Add Last" << endl;
    cout << "3. Add After" << endl;
    cout << "4. Delete Node" << endl;
    cout << "5. Print Forward" << endl;
    cout << "6. Print Backward" << endl;
    cout << "7. EXIT PROGRAM" << endl;
    cout << "Pilihan Anda (angka) : ";
    cin >> input;
    
}

//TODO Procedure untuk Output dari depan
void print_Forward(Node *printForward) {

    cout << "\nList Sekarang Ascending: " << endl;
    
    while (printForward != NULL) {
        cout << "Nim  : " << printForward->Nim << endl;
        cout << "Nama : " << printForward->Nama << endl;
        cout << endl;
        printForward = printForward->Next;
    }
    
}

//TODO Procedure untuk Output dari belakang
void print_Backward(Node *printBackward) {

    cout << "\nList Sekarang Descending: " << endl;
    
    while (printBackward != NULL) {
        cout << "Nim  : " << printBackward->Nim << endl;
        cout << "Nama : " << printBackward->Nama << endl;
        cout << endl;
        printBackward = printBackward->Prev;
    }
    
}

//TODO Procedur untuk Add First NODE
void add_First(int NIM, string NAMA) {
    
    Node *p = new Node();
    p->Nim = NIM;
    p->Nama = NAMA;

    p->Next = printForward;
    p->Prev = NULL;

    if (printForward == NULL)
    {
        printForward = p;
        printBackward = p;
    }
    else
    {
        printForward->Prev = p;
        printForward = p;
    }
    
}

//TODO Procedur untuk Add Last NODE
void add_Last(int NIM, string NAMA) {
    
    Node *p = new Node();
    p->Nim = NIM;
    p->Nama = NAMA;

    p->Next = NULL;
    p->Prev = printBackward;

    if (printBackward == NULL)
    {
        printForward = p;
        printBackward = p;
    }
    else
    {
        printBackward->Next = p;
        printBackward = p;
    }
    
}

//TODO Procedur untuk Add After NODE
void add_After(int NIM, string NAMA) {
    
    Node *q = new Node();
    Node *p = new Node();
    p->Nim = NIM;
    p->Nama = NAMA;
    
    int MASUKKAN;
    cout << "Node dimasukkan setelah Nim ?" << endl;
    cin >> MASUKKAN;
    cout << endl;

    q = printForward;
    bool found = false;

    while (q != NULL && !found) 
    {
        if (q->Nim == MASUKKAN)
        {
            found = true;
        }
        else
        {
            q = q->Next;
        }
        
    }

    if (found)
    {
        p->Next = q->Next;
        p->Prev = q;
        q->Next = p;

        if (q == printBackward)
        {
            printBackward = p;
        }
        else
        {
            p->Next->Prev = p;
        }
        
    }
    
}

//TODO Delete Double Linked List
void delete_List(int MASUKKAN) {

    Node *hapus = new Node();

    hapus = printForward;
    bool found = false;

    while (hapus != NULL && !found) 
    {
        if (hapus->Nim == MASUKKAN)
        {
            found = true;
        }
        else
        {
            hapus = hapus->Next;
        }
        
    }

    if (found)
    {
        
        if (hapus == printForward && hapus == printBackward)
        {
            
            printForward = NULL;
            printBackward = NULL;
            //delete hapus;

        }
        else if (hapus == printForward)
        {
            
            printForward = printForward->Next; //printForward = hapus->Next
            printForward->Prev = NULL;
            //delete hapus;

        }
        else if (hapus == printBackward)
        {
            
            printBackward = printBackward->Prev; //printBackward = hapus->Prev
            printBackward->Next = NULL;
            //delete hapus;

        }
        else
        {

            hapus->Prev->Next = hapus->Next;
            hapus->Next->Prev = hapus->Prev;
            //delete hapus;

        }

        delete hapus;
        
    }
    else
    {
        
        cout << "\nNIM tidak ditemukan !!!\n";

    }
    
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
            add_First(simpen_Nim, simpen_Nama);
            print_Forward(printForward);
            break;
        
        case 2: //TODO Add Last
            
            cout << "\nMASUKKAN NIM (pastikan angka) : ";
            cin >> simpen_Nim;
            cout << "MASUKKAN NAMA (Tanpa Spasi) : ";
            cin >> simpen_Nama;
            add_Last(simpen_Nim, simpen_Nama);
            print_Forward(printForward);
            break;

        case 3: //TODO Add After
            
            cout << "\nMASUKKAN NIM (pastikan angka) : ";
            cin >> simpen_Nim;
            cout << "MASUKKAN NAMA (Tanpa Spasi) : ";
            cin >> simpen_Nama;
            add_After(simpen_Nim, simpen_Nama);
            print_Forward(printForward);
            break;

        case 4: //TODO Delete Node
            
            cout << "Input NIM yang ingin dihapus datanya : ";
            cin >> nimDelete;

            cout << endl << "Apakah anda yakin, data ini akan dihapus selamanya?\n";
            cout << "1. Iya\n";
            cout << "2. Tidak\n";
            cout << "Pilihan : ";
            cin >> inputDelete;
            
            switch (inputDelete)
            {
            case 1: //TODO confirm delete Node

                delete_List(nimDelete);
                break;

            default: //TODO cancel delete Node
                
                cout << "\nPenghapusan List Dibatalkan\n";
                break;

            }

            print_Forward(printForward);

            break;

        case 5: //TODO Print Forward

            if (printForward != NULL)
            {
                
                print_Forward(printForward);

            }
            else
            {
                
                cout << "\nList Kosong\n\n";

            }
            
            break;

        case 6: //TODO Print Backward

            if (printBackward != NULL)
            {
                
                print_Backward(printBackward);

            }
            else
            {
                
                cout << "\nList Kosong\n\n";
                
            }
            
            break;
        
        case 7:
            
            cout << "\nTerima Kasih";
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
