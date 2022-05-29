package com.jedediahF;

// Nim  : 1119023
// Nama : Jedediah Fanuel

import java.util.Scanner;

public class Double_Queue {
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

    private static boolean isFull_Rear(TQueue Q) {

        return(Q.Tail == MAX-1);

    }

    private static boolean isFull_Front(TQueue Q) {

        return(Q.Head == 0);

    }

    public static Scanner input = new Scanner(System.in);

    private static int MENU() {

        int masukkan;
        System.out.println("1. Enqueue First");
        System.out.println("2. Enqueue Last");
        System.out.println("3. Dequeue First");
        System.out.println("4. Dequeue Last");
        System.out.println("5. Print Queue");
        System.out.println("6. EXIT");
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

    private static char Dequeue_Front(TQueue Q) {

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

    private static char Dequeue_Rear(TQueue Q) {

        char temp = '!';

        if (isEmpty(Q)) {

            System.out.print("Queue KOSONG");
            return '!';

        } else {

            temp = Q.data[Q.Tail];
            Q.data[Q.Tail] = '-';
            Q.Tail -= 1;

            if (Q.Head > Q.Tail) {

                Q.Head = -1;
                Q.Tail = -1;

            }

            return temp;

        }

    }

    // SHIFTING QUEUE
    private static void ShiftingEnqueue_Rear(TQueue Q, char data) {

        if (isFull_Rear(Q)) {

            if (isFull_Front(Q)) { // Bener - Bener Full

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

                Q.Head = MAX-1;
                Q.Tail = MAX-1;

            } else {

                Q.Tail += 1;

            }
            Q.data[Q.Tail] = data;

        }

    }

    private static void ShiftingEnqueue_Front(TQueue Q, char data) {

        if (isFull_Front(Q)) {

            if (isFull_Rear(Q)) { // Bener - Bener Full

                System.out.println("Queue FULL\n");

            } else { // Array index awal udh terisi, index di rear ada yang kosong

                int temp = MAX;
                for (int i = Q.Tail; i >= Q.Head; i--) {

                    temp -= 1;
                    Q.data[temp] = Q.data[i];
                    Q.data[i] = '-';

                }

                Q.Tail = MAX-1;
                Q.Head = temp-1;
                Q.data[Q.Head] = data;

            }

        } else {

            if (isEmpty(Q)) {

                Q.Head = 0;
                Q.Tail = 0;

            } else {

                Q.Head -= 1;

            }

            Q.data[Q.Head] = data;

        }

    }

    public static void main(String[] args) {

        System.out.println("Program Double Queue !!!");
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
                    ShiftingEnqueue_Front(Antrian, dataInput);
                    break;
                case 2:
                    System.out.print("Masukkan Data yang ingin di input : ");
                    dataInput = input.next().charAt(0);
                    ShiftingEnqueue_Rear(Antrian, dataInput);
                    break;
                case 3:
                    outPrint = Dequeue_Front(Antrian);
                    if (outPrint == '!') {

                        System.out.println(outPrint + "\n");

                    } else {

                        System.out.println("Data yang dikeluarkan : " + outPrint + "\n");

                    }
                    break;
                case 4:
                    outPrint = Dequeue_Rear(Antrian);
                    if (outPrint == '!') {

                        System.out.println(outPrint + "\n");

                    } else {

                        System.out.println("Data yang dikeluarkan : " + outPrint + "\n");

                    }
                    break;
                case 5:
                    PrintQueue(Antrian);
                    break;
                case 6:
                    found = true;
                    break;
                default:
                    System.out.println("Invalid input\n");
                    break;
            }
        }
    }
}
