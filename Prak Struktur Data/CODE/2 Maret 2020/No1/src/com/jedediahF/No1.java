package com.jedediahF;

public class No1 {

    private static boolean FuncCekIdentitas(int[][] array){
        boolean found = true;
        int i = 0;
        int j = 0;
        while (i < array.length && found) {
            while (j < array[i].length && found) {
                if (i == j) {
                    if (array[i][j] != 1) {
                        found = false;
                    }
                } else {
                    if (array[i][j] != 0) {
                        found = false;
                    }
                }
                j++;
            }
            i++;
        }
        return found;
    }

    private static boolean FuncCekSimetris(int[][] array) {
        int i = 1;
        boolean cek = true;

        while (cek == true && i < array.length) {
            int j = 0;
            while (j < array[i].length && cek == true) {
                if (array[i][j] != array[j][i]) {
                    cek = false;
                } else {
                    j++;
                }
            }
            i++;
        }
        return cek;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1,0,0,0},
                {0,1,0,0},
                {0,0,1,0},
                {0,0,0,1}
        };

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("[");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("");

        System.out.println("Pengecekan matrix apakah matrix Identitas ?");
        if (FuncCekIdentitas(matrix)) {
            System.out.println("matrix Ini Termasuk matrix Identitas");
        } else {
            System.out.println("matrix Ini Bukan matrix Identitas");
        }

        System.out.println("");

        System.out.println("Pengecekan matrix apakah matrix Simetris ?");
        if (FuncCekSimetris(matrix)) {
            System.out.println("matrix Ini Termasuk matrix Simetris");
        } else {
            System.out.println("matrix Ini Bukan matrix Simetris");
        }


    }
}
