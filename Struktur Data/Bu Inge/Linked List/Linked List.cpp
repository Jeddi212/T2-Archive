#include <iostream>
using namespace std;

struct Node {
    string Nama;
    int Usia;
    struct Node *Next;
};

void print_list(Node * n) {
    while (n != NULL) {
        cout << n->Nama << " ";
        cout << n->Usia << " ";
        n = n->Next;
    }
}

int main() {

    Node * Head = NULL;
    Node * Second = NULL;
    Node * Third = NULL;

    Head = new Node();
    Second = new Node();
    Third = new Node();

    Head->Nama = "Jeddi";
    Head->Usia = 18;
    Head->Next = Second;

    Second->Nama = "Fanuel";
    Second->Usia = 17;
    Second->Next = Third;

    Third->Nama = "Jeddi-Fan";
    Third->Usia = 20;
    Third->Next = NULL;

    print_list(Head);

    return 0;
}