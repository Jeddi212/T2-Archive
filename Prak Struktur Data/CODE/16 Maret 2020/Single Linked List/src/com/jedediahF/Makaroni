package com.jedediahF;

import java.util.Scanner;

public class SingleLinkedList {

    static class Node {

        int nilai;
        Node next;

        public Node() {

        }

        public Node(int nilai) {
            this.nilai = nilai;
            this.next = null;
        }

    }

    static Node head;
    static Scanner input = new Scanner(System.in);

    public static int menuAwal() {

        System.out.println("Silahkan Pilih : ");
        System.out.println("0. Add First");
        System.out.println("1. Print Data");
        System.out.println("2. Print Urutan");
        System.out.println("3. Add Last");
        System.out.println("4. Delete First");
        System.out.println("5. Delete Last");
        System.out.println("6. Delete Search");
        System.out.println("7. Exit");
        System.out.print("Pilihan anda : ");
        int user = input.nextInt();
        return user;
    }

    private static void addFirst(int nilai) {

        if (head == null) {
            head = new Node(nilai);
        } else {
            Node temp = new Node(nilai);
            temp.next = head;
            head = temp;
        }

    }

    private static void printData() {
        Node temp;
        temp = head;

        if (temp == null) {
            System.out.println("List Kosong\n");
        } else {
            System.out.println("\nList : ");
            while (temp != null) {
                System.out.println(temp.nilai);
                temp = temp.next;
            }
            System.out.println("");
        }

    }

    private static void printUrutan(int nilai) {

        Node p;
        p = head;
        boolean found = false;
        int count = 0;

        while (p != null && !found) {
            if (p.nilai == nilai) {
                found = true;
                count++;
            } else {
                count++;
                p = p.next;
            }
        }

        if (found) {
            System.out.println("\nData " + nilai + " ditemukan");
            System.out.println("Pada urutan ke-" + count + "\n");
        } else {
            System.out.println("\nData tidak ditemukan !!!\n");
        }

    }

    private static void addLast(int nilai) {

        if (head == null) {
            head = new Node(nilai);
        } else {
            Node temp = new Node(nilai);
            Node cek;
            cek = head;
            while (cek.next != null) {
                cek = cek.next;
            }
            cek.next = temp;
        }

    }

    public static void deleteFirst() {

        if (head == null) {
            System.out.println("List Kosong\n");
        } else {
            head = head.next;
        }

    }

    private static void deleteLast() {

        if (head == null) {
            System.out.println("List Kosong\n");
        } else {
            Node p;
            p = head;
            Node temp = null;
            boolean found = false;

            while (!found){
                if (p.next == null) {
                    found = true;
                } else {
                    temp = p;
                    p = p.next;
                }
            }

            if (found) {
                if (p == head) {
                    head = null;
                } else {
                    temp.next = null;
                }
            } else {
                System.out.println("Data tidak ditemukan!\n");
            }

        }

    }

    private static void delete(int nilai) {

        if (head == null) {
            System.out.println("List Kosong\n");
        } else {

            Node p;
            p = head;
            Node temp = null;

            boolean found = false;

            while (p != null && !found) {
                if (p.nilai == nilai) {
                    found = true;
                } else {
                    temp = p;
                    p = p.next;
                }
            }

            if (found) {
                if (p == head) {
                    head = head.next;
                } else {
                    temp.next = p.next;
                    p.next = null;
                }
            }

        }

    }

        // Nama : Jedediah Fanuel
        // Niim : 1119023

    public static void main(String[] args) {

        System.out.println("Program Singly Linked List\n");

        boolean exit = false;
        int pilih = 0;
        int data = 0;

        while (!exit) {
            pilih = menuAwal();
            switch (pilih){
                case 0:
                    System.out.println("Masukkan data nilai");
                    data = input.nextInt();
                    System.out.println("");
                    addFirst(data);
                    break;
                case 1:
                    printData();
                    break;
                case 2:
                    System.out.println("Masukkan data nilai yang dicari");
                    data = input.nextInt();
                    System.out.println("");
                    printUrutan(data);
                    break;
                case 3:
                    System.out.println("Masukkan data nilai");
                    data = input.nextInt();
                    System.out.println("");
                    addLast(data);
                    break;
                case 4:
                    deleteFirst();
                    break;
                case 5:
                    deleteLast();
                    break;
                case 6:
                    System.out.println("Masukkan data nilai yang dihapus");
                    data = input.nextInt();
                    System.out.println("");
                    delete(data);
                    break;
                case 7:
                    System.out.println("\nTerima Kasih");
                    exit =  true;
                    break;
                default:
                    System.out.println("\nInvalid input !!! \n");
            }
        }

    }


}
