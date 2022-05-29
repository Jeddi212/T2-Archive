//*Nama : Jedediah Fanuel
//*Info  : 1119023
//*Quis Nomor 1, Double Linked List (Descending, data printed once)

#include <iostream>
using namespace std;

struct Node {
    int Info;
    Node *Prev;
    Node *Next;
};

//! Deklarasi Pointer Global
Node *Head = NULL;
Node *Tail = NULL;

void MENU(int &input) {
    
    cout << "Silahkan Pilih Menu (Pilih Angka): " << endl;
    cout << "1. Add Node (sorted)" << endl;
    cout << "2. Print (normal) Forward" << endl;
    cout << "3. Print (once) Descending Vertical" << endl;
    cout << "4. Print (once) Descending Horizontal" << endl;
    cout << "5. EXIT PROGRAM" << endl;
    cout << "Pilihan Anda (angka) : ";
    cin >> input;
    
}

//TODO Procedure untuk Output dari depan
void print_Forward(Node *printForward) {

    cout << "\nList Sekarang Ascending: " << endl;
    
    while (printForward != NULL) {
        cout << printForward->Info << endl;
        printForward = printForward->Next;
    }
    cout << endl;
    
}

void print_Backward_horizontal(Node *printBackward) {

    cout << "\nList Descending : ";
    Node *cekData = new Node();
    cekData = printBackward->Prev;
    int cekData_before;
    int cekData_last = printBackward->Info;


    while (cekData != NULL) {
        
        if (cekData->Info < printBackward->Info)
        {
            cekData_before = printBackward->Info;
            cout << printBackward->Info << " ";
        }
        
        printBackward = printBackward->Prev;
        cekData = cekData->Prev;

    }
    
    if (printBackward->Info < cekData_before || printBackward->Info == cekData_last)
    {
        cout << printBackward->Info << " ";
    }
    
    cout << endl << endl;
    
}

//TODO Procedure untuk Output dari belakang + data sama tidiak diulang
void print_Backward_vertical(Node *printBackward) {

    cout << "\nList Descending : " << endl;
    Node *cekData = new Node();
    cekData = printBackward->Prev;
    int cekData_before;
    int cekData_last = printBackward->Info;

    while (cekData != NULL) {
        
        if (cekData->Info < printBackward->Info)
        {
            cekData_before = printBackward->Info;
            cout << printBackward->Info << endl;
        }
        
        printBackward = printBackward->Prev;
        cekData = cekData->Prev;
        
    }
    
    if (printBackward->Info < cekData_before || printBackward->Info == cekData_last)
    {
        cout << printBackward->Info << endl;
    }
    
    cout << endl;
    
}

//TODO Procedur untuk Add First NODE
void addSort(int Info){

    Node *p = new Node();
    p->Info = Info;

    if (Head == NULL)
    {
        p->Next = NULL;
        p->Prev = NULL;
        Head = p;
        Tail = p;
    } 
    else if (Head->Info > p->Info)
    {
        p->Next = Head;
        p->Prev = NULL;
        Head->Prev = p;
        Head = p;
    }
    else
    {
        //Deklrarasi
        Node *temp = new Node();
        temp = Head;
        bool found = false;

        //Jika masuk ke while dan found true, maka Add MID
        while (!found && temp->Next != NULL)
        {
            if (temp->Next->Info > p->Info)
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
        p->Prev = temp;
        temp->Next = p; //temp->Next di isi dengan Node pada alamat p
        if (!found) {
            Tail = p;
        } else {
            p->Next->Prev = p;
        }
        
    }
    
}

int main()
{
    
    bool found = true;

    int inputMenu = 0;
    
    int simpen_info = 0;

    while (found)
    {
        
        MENU(inputMenu);

        switch (inputMenu)
        {
        case 1: //TODO Add First
            
            cout << "\nMASUKKAN Angka : ";
            cin >> simpen_info;
            addSort(simpen_info);
            cout << endl;
            break;
        
        case 2: //TODO Print Forward

            if (Head != NULL)
            {
                
                print_Forward(Head);

            }
            else
            {
                
                cout << "\nList Kosong\n\n";

            }
            
            break;

        case 3: //TODO Print Descending Unik

            if (Tail != NULL)
            {
                
                print_Backward_vertical(Tail);

            }
            else
            {
                
                cout << "\nList Kosong\n\n";
                
            }
            
            break;
        
        case 4:

            if (Head != NULL)
            {
                
                print_Backward_horizontal(Tail);

            }
            else
            {
                
                cout << "\nList Kosong\n\n";
                
            }

            break;

        case 5:
            
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
