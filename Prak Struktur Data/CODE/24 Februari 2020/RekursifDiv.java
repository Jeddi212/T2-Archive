package com.jedediahF;

import java.util.Scanner;

public class RekursifDiv {
    private static int DivRekursif(int Angka, int Pembagi) {
        if (Angka < Pembagi) {
            return 0;
        } else {
            return DivRekursif(Angka - Pembagi, Pembagi) + 1;
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pokok");
        int baseNumber = input.nextInt();

        System.out.println("Masukkan angka pembagi");
        int pembagi = input.nextInt();

        int hasil = DivRekursif(baseNumber, pembagi);

        System.out.println("Hasilnya setelah di DIV " + hasil);
    }
}
