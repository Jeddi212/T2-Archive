package com.jedediahF;

import java.util.Scanner;

public class RekursifPerkalian {

    private static int PerkalianRekursif(int n1, int n2) {
        if (n2 == 1) {
            return n1;
        } else if (n2 == 0){
            return n2;
        } else {
            return (n1 + PerkalianRekursif(n1, (n2 - 1)));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;

        System.out.println("Program Perkalian Rekursif !!!\n");

        System.out.println("Masukkan angka pertama : ");
        angka1 = input.nextInt();

        System.out.println("Masukkan angka Kedua : ");
        angka2 = input.nextInt();

        int hasil = 0;

        hasil = PerkalianRekursif(angka1, angka2);

        System.out.println("Hasilnya : " + hasil);

    }
}
