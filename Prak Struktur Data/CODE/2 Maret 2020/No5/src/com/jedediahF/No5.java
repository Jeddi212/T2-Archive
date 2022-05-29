package com.jedediahF;

import java.util.Scanner;

public class No5 {

    private static void SumSubset(int[][] array, int K) {
        int tempMax = 0;
        int tempTotal = 0;
        int index1 = 0;
        int index2 = 0;

        for (int i = 0; i < array.length - K + 1; i++) {

            for (int j = 0; j < array[i].length - K + 1; j++) {
                tempTotal = 0;
                for (int l = i; l < i + K; l++) {

                    for (int p = j; p < j + K; p++) {

                       tempTotal += array[l][p];

                    }

                }
                if (tempMax < tempTotal) {
                    index1 = i;
                    index2 = j;
                    tempMax = tempTotal;
                }
            }
        }

        //Print Array Terpilih
        System.out.println("Matrix Terpilih : ");
        for (int a = index1; a < index1 + K; a++) {
            System.out.print("[ ");
            for (int b = index2; b < index2 + K; b++) {
                System.out.print(array[a][b] + " ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {3, -4, 6, -5, 1},
                {1, -2, 8, -4, -2},
                {3, -8, 9, 3, 1},
                {-7, 3, 4, 2, 7},
                {-3, 7, -5, 7, -6}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("");

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan ukuran matrix SUMSUBSET (0 < INPUT <= 5) ");
        int k = input.nextInt();

        SumSubset(matrix, k);

    }
}
