package com.jedediahF;

import java.util.Scanner;

public class RekursifFaktorial {

    private static int FaktorialRekursif(int nilai) {
        if (nilai == 0) {
            return 1;
        } else if (nilai == 1){
            return nilai;
        } else {
            return (nilai * FaktorialRekursif(nilai-1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka1, angka2;

        System.out.println("Program Faktorial Rekursif !!!\n");

        System.out.println("Masukkan angka : ");
        angka1 = input.nextInt();

        int hasil = 0;

        hasil = FaktorialRekursif(angka1);

        System.out.println("Hasilnya : " + hasil);

    }
}
