package com.jedediahF;

// Nim  : 1119023
// Nama : Jedediah Fanuel

import java.util.Base64;
import java.util.Scanner;

public class Basic_and_Shifting {
    // Global Variable
    static int MAX = 5;

    static class TQueue {

        char[] data = new char[MAX];
        int Head = -1;
        int Tail = -1;

    }

    private static boolean isEmpty(TQueue Q) {

        return(Q.Head == -1 && Q.Tail == -1);

    }

    private static boolean isFull(TQueue Q) {

        return(Q.Tail == MAX-1);

    }

    public static Scanner input = new Scanner(System.in);

    private static int MENU() {

        int masukkan;
        System.out.println("1. Basic Enqueue");
        System.out.println("2. Shifting Enqueue");
        System.out.println("3. Dequeue");
        System.out.println("4. Print Queue");
        System.out.println("5. EXIT");
        System.out.print("--> ");
        masukkan = input.nextInt();
        return masukkan;

    }

    private static void PrintQueue(TQueue Q) {

        System.out.print("\nQueue sekarang : ");
        System.out.print("[");
        for (int i = 0; i < Q.data.length; i++) {

            if(i != Q.data.length-1) {

                System.out.print(Q.data[i] + ", ");

            } else {

                System.out.print(Q.data[i]);

            }

        }
        System.out.println("]\n");

    }

    // BASIC QUEUE
    private static void BasicEnqueue(TQueue Q, char data) {

        if (isFull(Q)) {

            System.out.println("Queue FULL\n");

        } else {

            if (isEmpty(Q)) {

                Q.Head = 0;

            }

            Q.Tail += 1;
            Q.data[Q.Tail] = data;

        }

    }

    private static char Dequeue(TQueue Q) {

        char temp = '!';

        if (isEmpty(Q)) {

            System.out.print("Queue KOSONG");
            return '!';

        } else {

            temp = Q.data[Q.Head];
            Q.data[Q.Head] = '-';
            Q.Head += 1;

            if (Q.Head > Q.Tail) {

                Q.Head = -1;
                Q.Tail = -1;

            }

            return temp;

        }

    }

    // SHIFTING QUEUE
    private static void ShiftingEnqueue(TQueue Q, char data) {

        if (isFull(Q)) {

            if (Q.Head == 0) { // Bener - Bener Full

                System.out.println("Queue FULL\n");

            } else { // Array index terakhir udh terisi, index di depannya ada yang kosong

                int temp = -1;
                for (int i = Q.Head; i <= Q.Tail; i++) {

                    temp += 1;
                    Q.data[temp] = Q.data[i];
		    Q.data[i] = '-';

                }

                Q.Head = 0;
                Q.Tail = temp+1;
                Q.data[Q.Tail] = data;

            }

        } else {

            if (isEmpty(Q)) {

                Q.Head = 1;

            }

            Q.Tail += 1;
            Q.data[Q.Tail] = data;

        }

    }

    public static void main(String[] args) {

        System.out.println("Program BASIC & SHIFTING Queue !!!");
        TQueue Antrian = new TQueue();
        boolean found = false;
        int pilihan_user;
        char dataInput = '!';
        char outPrint = '!';

        while(!found) {

            pilihan_user = MENU();

            switch (pilihan_user) {

                case 1:
                    System.out.print("Masukkan Data yang ingin di input : ");
                    dataInput = input.next().charAt(0);
                    BasicEnqueue(Antrian, dataInput);
                    break;
                case 2:
                    System.out.print("Masukkan Data yang ingin di input : ");
                    dataInput = input.next().charAt(0);
                    ShiftingEnqueue(Antrian, dataInput);
                    break;
                case 3:
                    outPrint = Dequeue(Antrian);
                    if (outPrint == '!') {

                        System.out.println(outPrint + "\n");

                    } else {

                        System.out.println("Data yang dikeluarkan : " + outPrint + "\n");

                    }
                    break;
                case 4:
                    PrintQueue(Antrian);
                    break;
                case 5:
                    found = true;
                    break;
                default:
                    System.out.println("Invalid input\n");
                    break;
            }

        }
    }
}
