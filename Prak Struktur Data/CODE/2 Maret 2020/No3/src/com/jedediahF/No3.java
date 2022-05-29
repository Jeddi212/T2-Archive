package com.jedediahF;

public class No3 {

    private static boolean FuncCekToeplitz(char[][] array) {
        boolean found = true;
        for (int i = 1; i < array.length; i++) {
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] != array[i-1][j-1]){
                    found = false;
                }
            }
        }
        return found;
    }

    public static void main(String[] args) {
        char[][] matrix = {
                {'a', 'b', 'c', 'd', 'e'},
                {'f', 'a', 'b', 'c', 'd'},
                {'g', 'f', 'a', 'b', 'c'},
                {'h', 'g', 'f', 'a', 'b'},
                {'i', 'h', 'g', 'f', 'a'}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("");

        System.out.println("Pengecekan matrix apakah matrix Toeplitz ?");
        if (FuncCekToeplitz(matrix)) {
            System.out.println("matrix Ini Termasuk matrix Toeplitz");
        } else {
            System.out.println("matrix Ini Bukan matrix Toeplitz");
        }
    }
}
