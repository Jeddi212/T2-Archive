package com.jedediahF;

import java.util.Scanner;

public class Doubly_LL {

    static class DoublyLL {

        int nilai;
        DoublyLL next, prev;

        public DoublyLL() {

        }

        public DoublyLL(int nilai) {
            this.nilai = nilai;
            this.next = null;
            this.prev = null;
        }

    }

    static DoublyLL head = null;
    static DoublyLL tail = null;
    static Scanner input = new Scanner(System.in);

    public static int menuAwal() {

        System.out.println("Silahkan Pilih : ");
        System.out.println("1. Print Data Ascending");
        System.out.println("2. Print Data Descending");
        System.out.println("3. Add Ordered");
        System.out.println("4. Exit");
        System.out.print("Pilihan anda : ");
        int user = input.nextInt();
        return user;

    }

    private static void printDataAscending() {
        DoublyLL temp;
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

    private static void printDataDescending() {
        DoublyLL temp;
        temp = head;

        if (temp == null) {
            System.out.println("List Kosong\n");
        } else {
            System.out.println("\nList : ");
            while (temp.next != null) {
                temp = temp.next;
            }
            while (temp != null) {
                System.out.println(temp.nilai);
                temp = temp.prev;
            }
            System.out.println("");
        }
    }

    private static void addOrdered(int nilai) {
        DoublyLL temp = new DoublyLL(nilai);

        if (head == null) { //* ADD FIRST LIST KOSONG
            head = temp;
        } else if (head.nilai > temp.nilai) { //* ADD FIRST
            temp.next = head;
            head.prev = temp;
            head = temp;
        } else {
            DoublyLL cek;
            cek = head;
            boolean found = false;

            while (!found && cek.next != null) {
                if (cek.next.nilai >= temp.nilai) {
                    found = true;
                } else {
                    cek = cek.next;
                }
            }

            //* Jika !found, maka ADD LAST
            //* Jika found, maka ADD MID
            temp.prev = cek;
            temp.next = cek.next;
            cek.next = temp;
            if (found) {
                temp.next.prev = temp;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Program Doubly Linked List\n");

        boolean exit = false;
        int pilih = 0;
        int data = 0;

        while (!exit) {
            pilih = menuAwal();
            switch (pilih){
                case 1:
                    printDataAscending();
                    break;
                case 2:
                    printDataDescending();
                    break;
                case 3:
                    System.out.println("Masukkan data nilai");
                    data = input.nextInt();
                    System.out.println("");
                    addOrdered(data);
                    break;
                case 4:
                    System.out.println("\nTerima Kasih");
                    exit =  true;
                    break;
                default:
                    System.out.println("\nInvalid input !!! \n");
            }
        }
    }
}
