package com.jedediahF;

// Nama : Jedediah Fanuel
// NIm  : 1119023

public class Main {

    public static int checkSurvivors(char[][] Array) {
        // Variable Declaration
        int countSurvivors = 0;
        int size_of_mine = 0;
        boolean foundMine = false;
        int mine_X = 0;
        int mine_Y = 0;
        int i = 0;
        int j = 0;
        int ROW = Array.length;
        int COL = Array[i].length;
        // Code
        while (j < COL && !foundMine) { // <=
            while (j < ROW && !foundMine) { // <=
                if (Array[i][j] != 'P' && Array[i][j] != '*') {
                    foundMine = true;
                    mine_X = j;
                    mine_Y = i;
                    size_of_mine = Array[i][j];
                } else {
                    j++;
                }
            }
            i++;
        }

        for (i = 0; i < ROW; i++) {
            for (j = 0; j < COL; j++) {
                if (i > mine_Y + size_of_mine || i < mine_Y - size_of_mine
                || j > mine_X + size_of_mine || j < mine_X - size_of_mine) {
                    if (Array[i][j] == 'P') {
                        countSurvivors++;
                    }
                }
            }
        }

        return countSurvivors;

    }

    public static void main(String[] args) {

    }
}
