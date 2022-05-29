package com.jedediahF;

import java.util.Scanner;
import javax.swing.*;

public class UTS_NO1 {

    static int RekursifBakteri(int jumlahBakteri, double waktu) {

        if (waktu < 1) {
            return jumlahBakteri;
        } else if (waktu >= 2) {
            return (20 * RekursifBakteri(jumlahBakteri, waktu - 2));
        } else if (waktu >= 1) {
            return (5 * RekursifBakteri(jumlahBakteri, waktu - 1));
        }
        return jumlahBakteri;
    }

    public static void main(String[] args) {
        //Deklarasi
        int hasil = 0;

        /*
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan Jumlah bakteri : ");
        bakteri = inp.nextInt();
        System.out.println("Masukkan lama waktu : ");
        time = inp.nextDouble();
        */

        String bakteri_input = JOptionPane.showInputDialog(null, "Input Jumlah Bakteri", "Cabang", JOptionPane.QUESTION_MESSAGE);
        String time_input = JOptionPane.showInputDialog(null, "Input lama waktu", "Cabang", JOptionPane.QUESTION_MESSAGE);

        int bakteri = Integer.parseInt(bakteri_input);
        double time = Double.parseDouble(time_input);

        if (bakteri < 0 || time < 0) {
            JOptionPane.showMessageDialog(null, "Input Tidak Valid !", "Caution", JOptionPane.WARNING_MESSAGE);
        } else {
            hasil = RekursifBakteri(bakteri, time);
        }

        System.out.println("Hasilnya : " + hasil);
    }

}
