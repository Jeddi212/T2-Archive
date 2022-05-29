package com.jedediahF;
//*Nama : Jedediah Fanuel
//*Nim  : 1119023
import javax.swing.*;
import java.lang.reflect.Type;

public class UTS_NO2 {

    public static karakter[] chara = new karakter[3];

    public static class skill {
        String NamaSkill;
        String Type;

        // Constructor
        public skill(String namaSkill, String tipe) {
            NamaSkill = namaSkill;
            Type = tipe;
        }
    }

    public static class karakter {
        String Nama;
        String Kelas;
        int HP;
        int ATK;
        int DEF;
        skill[] skillKarakter = new skill[4];

        // Constructor
        public karakter(String nama, String kelas, int hp, int atk, int def) {
            Nama = nama;
            Kelas = kelas;
            HP = hp;
            ATK = atk;
            DEF = def;
        }
    }

    public static class menu_Awal {

        public menu_Awal(karakter[] Chara) {
            boolean found = false;
            String [] options = {"1", "2", "3", "4"};
            while (!found) {
                String input = (String) JOptionPane.showInputDialog(null, "Hotel Harapan Bangsa" +
                        "\n 1. Buat Karakter Baru" +
                        "\n 2. Tambah Skill" +
                        "\n 3. Print Data" +
                        "\n 4. Exit"
                        ,"Program Game Sederhana", JOptionPane.QUESTION_MESSAGE, null, options, options);
                if (input != null) {
                    int inputPilihan = Integer.parseInt(input);
                    switch (inputPilihan) {
                        case 1:
                            buat_Karakter(Chara);
                            break;
                        case 2:
                            tambah_Skill(Chara);
                            break;
                        case 3:
                            print_Data(Chara);
                            break;
                        case 4:
                            found = true;
                            JOptionPane.showMessageDialog(null, "Terima Kasih Sudah Berkunjung", "Thank You So Much :)", JOptionPane.INFORMATION_MESSAGE);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Input Tidak Valid !!!", "Kesalahan", JOptionPane.WARNING_MESSAGE);
                            break;
                    }
                } else {
                    found = true;
                    JOptionPane.showMessageDialog(null, "Terima Kasih Sudah Berkunjung", "Thank You So Much :)", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    public static void buat_Karakter(karakter[] Chara) {

        String [] options = {"1", "2", "3"};
        int index = 0;

        String nama = (String) JOptionPane.showInputDialog(null, "Input nama karakter", "Cabang", JOptionPane.QUESTION_MESSAGE);
        String inputKelas = (String) JOptionPane.showInputDialog(null, "Input kelas karakter" +
                "\n1. Knight (HP 100, ATK 20, DEF 30)" +
                "\n Magician (HP 50, ATK 30, DEF 10)" +
                "\n Archer (HP 75, ATK 15, DEF 15)", "Cabang", JOptionPane.QUESTION_MESSAGE, null, options, options);
        if (inputKelas == "1") {
            Chara[index].Nama = nama;
            Chara[index].Kelas = "Knight";
            Chara[index].HP = 100;
            Chara[index].ATK = 20;
            Chara[index].DEF = 30;
        } else if (inputKelas == "2") {
            Chara[index].Nama = nama;
            Chara[index].Kelas = "Magician";
            Chara[index].HP = 50;
            Chara[index].ATK = 30;
            Chara[index].DEF = 10;
        } else {
            Chara[index].Nama = nama;
            Chara[index].Kelas = "Archer";
            Chara[index].HP = 75;
            Chara[index].ATK = 15;
            Chara[index].DEF = 15;
        }
    }

    public static void tambah_Skill(karakter[] Chara) {

        String [] options = {"1", "2", "3"};
        int index = 0;

        String pilih = (String) JOptionPane.showInputDialog(null, "Pilih Karakter : " +
                "\n1. " + Chara[0].Nama +
                "\n2. " + Chara[1].Nama +
                "\n3. " + Chara[2].Nama, "Tambah SKILL", JOptionPane.QUESTION_MESSAGE);

        String [] optionSkill = {"Active", "Passive"};
        String namaSkill = (String) JOptionPane.showInputDialog(null, "Input nama skill : ", "Cabang", JOptionPane.QUESTION_MESSAGE);
        String inputKelas = (String) JOptionPane.showInputDialog(null, "Input tipe skill (Active / Passive): "
                , "Input Type Skill", JOptionPane.QUESTION_MESSAGE, null, optionSkill, optionSkill);
        if (inputKelas == "1") {
            Chara[index].skillKarakter[0].NamaSkill = namaSkill;
            Chara[index].skillKarakter[0].Type = inputKelas;
        }
    }

    public static void print_Data(karakter[] Chara) {

    }

    public static void main(String[] args) {

        chara[0] = new karakter("A", "0", 0, 0, 0);
        chara[1] = new karakter("B", "0", 0, 0, 0);
        chara[2] = new karakter("C", "0", 0, 0, 0);
        new menu_Awal(chara);

    }
}
