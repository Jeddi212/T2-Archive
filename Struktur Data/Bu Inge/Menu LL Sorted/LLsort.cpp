//*Nama : Jedediah Fanuel
//*Nim  : 1119023

/*
    1. Add Sort Full Version
    2. Search
    3. Delete linked list
    4. Print list setiap ada perubahan
*/

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

//TODO Procedure untuk Output
void print_list(Node * n) {

    cout << "\nList Sekarang : " << endl;
    
    while (n != NULL) {
        cout << "Nim  : " << n->Nim << endl;
        cout << "Nama : " << n->Nama << endl;
        cout << endl;
        n = n->Next;
    }
    
}

void MENU(int &input){
    
    cout << "Silahkan Pilih Menu (Pilih Angka): " << endl;
    cout << "1. Add Node" << endl;
    cout << "2. Search Node" << endl;
    cout << "3. Delete All List" << endl;
    cout << "3. Delete Position" << endl;
    cout << "5. Print list" << endl;
    cout << "6. EXIT PROGRAM" << endl;
    cout << "Pilihan Anda (angka) : ";
    cin >> input;
    
}

void addSort(int NIM, string NAMA){

    Node *p = new Node();
    p->Nim = NIM;
    p->Nama = NAMA;

    if (Head == NULL)
    {
        p->Next = NULL;
        Head = p;
    } 
    else if (Head->Nim > p->Nim)
    {
        p->Next = Head;
        Head = p;
    }
    else
    {
        //Deklrarasi
        Node *temp = new Node();
        temp = Head;
        bool found = false;

        //Jika masuk ke while, maka Add MID
        while (!found && temp->Next != NULL)
        {
            if (temp->Next->Nim > p->Nim)
            {
                found = true;
            }
            else
            {
                temp = temp->Next;
            }
            
        }
        
        //Jika langsung ke sini maka Add LAST
        p->Next = temp->Next; //me-NULL-kan node p->Next
        temp->Next = p; //temp->Next di isi dengan Node pada alamat p
        
    }
    print_list(Head);
    
}

void searchList(int input){

    bool found = false;

    Node *p = new Node();
    p = Head;

    do
    {
        
        if (p->Nim == input)
        {
            
            found = true;
            cout << "\nNim  : " << p->Nim << endl;
            cout << "Nama : " << p->Nama << endl;
            cout << endl;

        }
        else
        {
            
            p = p->Next;

        }

    } while (!found && p != NULL);

    if (!found && p != NULL)
    {
        cout << "\nNIM tidak ditemukan ! \n\n";
    }
    
}

void deleteList(){
    
    Node *hapus = new Node();
    Node *selanjutnya = new Node();

    hapus = Head;

    while (hapus->Next != NULL)
    {

        selanjutnya = hapus->Next;
        delete hapus;
        hapus = selanjutnya;
        print_list(Head);
        
    }

    if (Head->Next == NULL)
    {
        delete Head;
    }
    
    Head = NULL;

    cout << "List dihapus\n\n";

}

void delete_position(int pos){

        Node *current = new Node;
        Node *previous = new Node;
        Node *temp = new Node;
        current = Head;

        for(int i = 1;i < pos;i++)
        {
            previous=current;
            current=current->Next;
        }

        previous->Next=current->Next;

        if (pos == 1)
        {
            temp = Head;
            Head = Head->Next;
            delete temp;
        }
        
}

int main()
{   
    bool found = true;
    int inputMenu = 0;
    int inputSearch = 0;
    int inputDelete = 0;
    int simpen_Nim = 0;
    string simpen_Nama = "hai";
    while (found)
    {
        MENU(inputMenu);
        switch (inputMenu)
        {
        case 1:
            
            cout << "\nMASUKKAN NIM (pastikan angka) : ";
            cin >> simpen_Nim;
            cout << "MASUKKAN NAMA (Tanpa Spasi): ";
            cin >> simpen_Nama;
            addSort(simpen_Nim, simpen_Nama);
            break;

        case 2:
            
            cout << "\nMASUKKAN SEARCH BY NIM : " << endl;
            cin >> inputSearch;
            searchList(inputSearch);
            break;

        case 3:
            
            cout << "\nDELETE All List ?" << endl;
            cout << "1. Yes" << endl << "INPUT angka lainnya untuk BATAL" << endl;
            cout << "Pilihan Anda (angka) : ";
            cin >> inputDelete;
            cout << endl;
            
            switch (inputDelete)
            {
            case 1:

                deleteList();
                break;

            default:
                
                cout << "\nPenghapusan List Dibatalkan\n";
                print_list(Head);
                break;

            }
            
            break;
        case 4:

            cout << "\nDELETE This List ?" << endl;
            cout << "1. Yes" << endl << "INPUT angka lainnya untuk BATAL" << endl;
            cout << "Pilihan Anda (angka) : ";
            cin >> inputDelete;
            cout << endl;
            
            switch (inputDelete)
            {
            case 1:

                int input;
                cout << "Masukkan Index";
                cin >> input;
                delete_position(input);
                break;

            default:
                
                cout << "\nPenghapusan List Dibatalkan\n";
                print_list(Head);
                break;

            }

            break;
        case 5:

            if (Head != NULL)
            {
                print_list(Head);
            } else
            {
                cout << "\nList Kosong\n\n";
            }
            
            break;
        case 6:
            
            cout << "\nTerima Kasih";
            found = false;
            break;

        default:
            
            cout << "\nInput anda tidak valid !!!\n\n";
            break;

        }
        
    }

    return 0;

}
