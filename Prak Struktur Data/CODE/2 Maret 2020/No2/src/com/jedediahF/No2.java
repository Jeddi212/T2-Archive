package com.jedediahF;

public class No2 {

    private static void TransposeMatrix(char[][] array) {
        char temp = 'q';

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (i != j){
                    temp = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] matrix = {
            {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("");

        TransposeMatrix(matrix);

        System.out.println("Hasilnya : ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("");
    }
}
