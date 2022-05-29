package com.jedediahF;

import java.util.Scanner;

public class RekursifBalikKata {

    private static String BalikKataRekursif(String Kata) {
        String simpan = "";
        int index = Kata.length() - 1;

        if (index == 0) {
            return Kata;
        } else {
            simpan += Kata.substring(0, 1);
            return BalikKataRekursif(Kata.substring(1)) + simpan;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program BalikKata Rekursif !!!\n");

        System.out.println("Masukkan kata : ");
        String kata = input.nextLine();

        String hasil = " ";

        hasil = BalikKataRekursif(kata);

        System.out.println("Hasilnya setelah di balik : " + hasil);

    }
}
