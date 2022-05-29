package com.jedediahF;

public class No4 {

    private static void PrintSpiral(int[][] array){
        int awalBaris = 0;
        int akhirBaris = array.length;
        int awalKolom = 0;
        int akhirKolom = array[0].length;
        int i = 0;

        while (awalBaris < akhirBaris && awalKolom < akhirKolom) {
            for (i = 0; i < akhirKolom; i++) {
                System.out.print(array[awalBaris][i] + " ");
            }
            awalBaris++;

            for (i = awalBaris; i < akhirBaris; i++) {
                System.out.print(array[i][akhirKolom - 1] + " ");
            }
            akhirKolom--;

            if (awalBaris < akhirBaris) {
                for (i = akhirKolom - 1; i >= 1 ; i--) {
                    System.out.print(array[akhirBaris - 1][i] + " ");
                }
                akhirBaris--;
            }

            if (awalKolom < akhirKolom) {
                for (i = akhirBaris; i > awalBaris; i--) {
                    System.out.print(array[i][awalKolom] + " ");
                }
                awalKolom++;
            }
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
            { 1, 2, 3, 4},
            {12,13,14, 5},
            {11,16,15, 6},
            {10, 9, 8, 7}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("");

        PrintSpiral(matrix);

    }
}
