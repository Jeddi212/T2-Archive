package com.jedediahF;

public class RekursifTukerArray {
    static int[] array = {1, 2, 3, 4, 5};

    private static void TukerArrayRekursif(int[] array, int awal, int batas) {
        int temp;

        if (awal < batas) {
            temp = array[awal];
            array[awal] = array[batas];
            array[batas] = temp;
            TukerArrayRekursif(array, awal + 1, batas - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("Program TukerArray Rekursif !!!\n");

        System.out.println("Array Mula-Mula : ");
        System.out.print("[ ");
        for (int angka : array) {
            System.out.print(angka + " ");
        }
        System.out.println("]");

        TukerArrayRekursif(array, 0, 4);

        System.out.println("Array Setelah di reverse : ");
        System.out.print("[ ");
        for (int angka : array) {
            System.out.print(angka + " ");
        }
        System.out.println("]");

    }
}
