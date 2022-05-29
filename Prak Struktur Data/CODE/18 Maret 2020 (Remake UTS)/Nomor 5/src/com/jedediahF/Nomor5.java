package com.jedediahF;

// Nama : Jedediah Fanuel
// Nim  : 1119023

public class Nomor5 {

    public static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node Head = null;
    static Node Tail = null;

    private static void addFirst(int data) {

        Node temp = new Node(data);

        if (Head == null) {
            Head = temp;
            Tail = temp;
            Head.next = null;
            Head.prev = null;
        } else {
            temp.next = Head;
            Head.prev = temp;
            Head = temp;
        }

    }

    private static void printData() {
        Node temp;
        temp = Head;

        if (temp == null) {
            System.out.println("List Kosong\n");
        } else {
            System.out.println("List : ");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    // PROSEDUR MENGHAPUS NODE PILIHAN
    private static void hapusData(int dicari) {

        Node hapus = null;
        Node cek;
        cek = Head;
        boolean found = false;

        while (cek != null && cek.data <= dicari) {
            if (cek.data == dicari) {
                found = true;
                hapus = cek;
            }
            cek = cek.next;

            if (found) {
                if (hapus == Head && hapus == Tail) {
                    Head = null;
                    Tail = null;
                } else if (hapus == Head) {
                    Head = Head.next;
                    Head.prev = null;
                } else if (hapus == Tail) {
                    Tail = Tail.prev;
                    Tail.next = null;
                } else {
                    hapus.prev.next = hapus.next;
                    hapus.next.prev = hapus.prev;
                }
                hapus = null;
            }

        }

        if (!found) {
            System.out.println("Data yang ingin dihapus tidak ada !");
        } else {
            System.out.println("Penghapusan data berhasil");
        }
    }

    public static void main(String[] args) {

        addFirst(12);
        addFirst(11);
        addFirst(11);
        addFirst(9);
        addFirst(7);
        addFirst(5);
        addFirst(5);
        addFirst(5);
        addFirst(2);
        addFirst(2);
        addFirst(2);
        addFirst(1);

        printData();

        System.out.println("");
        System.out.println("");

        System.out.println("Menghapus data 6");
        hapusData(6);
        printData();

        System.out.println("");
        System.out.println("");

        System.out.println("Menghapus data 5");
        hapusData(5);
        printData();

    }
}
