package com.jedediahF;

import java.util.Scanner;

public class RekursifMod {
    private static int ModRekursif(int Angka, int Pembagi) {
        if (Angka < Pembagi) {
            return Angka;
        } else {
            return ModRekursif(Angka - Pembagi, Pembagi);
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan angka pokok");
        int baseNumber = input.nextInt();

        System.out.println("Masukkan angka pembagi");
        int pembagi = input.nextInt();

        int hasil = ModRekursif(baseNumber, pembagi);

        System.out.println("Hasilnya setelah di MOD " + hasil);
    }
}
