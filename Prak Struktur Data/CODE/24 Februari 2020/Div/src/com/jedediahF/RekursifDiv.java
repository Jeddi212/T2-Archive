package com.jedediahF;

import java.util.Scanner;

public class RekursifDiv {
    private static int DivRekursif1(int Angka, int Pembagi) {
        if (Angka < Pembagi) {
            return 0;
        } else {
            return DivRekursif1(Angka - Pembagi, Pembagi) + 1;
        }

    }
    private static int DivRekursif(int Angka, int Pembagi) {
        if (Angka < Pembagi) {
            return 0;
        } else if (Angka == Pembagi) {
            return 1;
        } else {
            return 1 + DivRekursif(Angka - Pembagi, Pembagi);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pokok");
        int baseNumber = input.nextInt();

        System.out.println("Masukkan angka pembagi");
        int pembagi = input.nextInt();

        int hasil = DivRekursif(baseNumber, pembagi);

        System.out.println("Hasil DIV = " + hasil);
    }
}
