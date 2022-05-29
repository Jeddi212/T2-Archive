package com.jedediahF;

import java.util.Scanner;

public class Singly_Tail {

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

    static Node head = null;
    static Node tail = null;
    static Scanner input = new Scanner(System.in);

    public static int menuAwal() {

        System.out.println("Silahkan Pilih : ");
        System.out.println("0. Add First");
        System.out.println("1. Print Data");
        System.out.println("2. Add Last");
        System.out.println("3. Delete Last");
        System.out.println("4. Exit");
        System.out.print("Pilihan anda : ");
        int user = input.nextInt();
        return user;
    }

    private static void addFirst(int nilai) {

        if (head == null) {
            head = new Node(nilai);
            tail = head;
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

    private static void addLast(int nilai) {

        if (head == null) {
            head = new Node(nilai);
            tail = head;
        } else {
            Node temp = new Node(nilai);
            temp.next = null;
            tail.next = temp;
            tail = tail.next;
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
                if (p == tail) {
                    found = true;
                } else {
                    temp = p;
                    p = p.next;
                }
            }

            if (found) {
                if (p == head && p == tail) {
                    head = null;
                    tail = null;
                } else {
                    tail = temp;
                    tail.next = null;
                }
                System.out.println("Data berhasil dihapus!\n");
            } else {
                System.out.println("List Kosong!\n");
            }

        }

    }

    // Nama : Jedediah Fanuel
    // Niim : 1119023

    public static void main(String[] args) {

        System.out.println("Program Singly Linked List With Tail\n");

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
                    System.out.println("Masukkan data nilai");
                    data = input.nextInt();
                    System.out.println("");
                    addLast(data);
                    break;
                case 3:
                    deleteLast();
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
