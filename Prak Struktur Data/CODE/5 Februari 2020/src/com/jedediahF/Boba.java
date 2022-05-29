//Nama : Jedediah Fanuel
//Nim  : 1119023
package com.jedediahF;

import java.util.Scanner;

public class Boba {

    static class fix {
        String Nama;
        int Harga;
        int ID;
    }

    static class rac {
        String Rasa;
        String Topping;
        int Harga;
        int HargaT;
        int ID;
    }

    //Function Pajak 10 %
    private static double PPN(double biayaMentah) {
        return biayaMentah + (biayaMentah * 0.1);
    }

    public static void main(String[] args) {

        //Deklarasi
        Scanner input = new Scanner(System.in);
        String pilihan;
        String kondisi;
        String out = " ";
        String ice = " ";
        String sugar = " ";
        double total = 0;
        int max_Fix_Menu = 6;

        //Inisialisasi Array
        fix[] menu_Fix = new fix[max_Fix_Menu];
        for (int i = 0; i < max_Fix_Menu; i++) {
            menu_Fix[i] = new fix();
        }

        rac[] menu_Rac = new rac[max_Fix_Menu];
        for (int i = 0; i < max_Fix_Menu; i++) {
            menu_Rac[i] = new rac();
        }

        //!DATA MENU FIXED
        menu_Fix[0].ID = 1;
        menu_Fix[0].Nama = "Fresh Boba";
        menu_Fix[0].Harga = 20000;

        menu_Fix[1].ID = 2;
        menu_Fix[1].Nama = "Coco Boba";
        menu_Fix[1].Harga = 25000;

        menu_Fix[2].ID = 3;
        menu_Fix[2].Nama = "Chis Boba";
        menu_Fix[2].Harga = 27500;

        menu_Fix[3].ID = 4;
        menu_Fix[3].Nama = "Volca Boba";
        menu_Fix[3].Harga = 30000;

        menu_Fix[4].ID = 5;
        menu_Fix[4].Nama = "Happy Boba";
        menu_Fix[4].Harga = 32000;

        //!DATA RACIK
        menu_Rac[0].Rasa = "Vanilla";
        menu_Rac[0].Topping = "Marshmallow";
        menu_Rac[0].Harga = 22000;
        menu_Rac[0].HargaT = 2200;
        menu_Rac[0].ID = 1;

        menu_Rac[1].Rasa = "Chocolatte";
        menu_Rac[1].Topping = "Choco Chip";
        menu_Rac[1].Harga = 25000;
        menu_Rac[1].HargaT = 1800;
        menu_Rac[1].ID = 2;

        menu_Rac[2].Rasa = "Strawberry";
        menu_Rac[2].Topping = "Oreo";
        menu_Rac[2].Harga = 30000;
        menu_Rac[2].HargaT = 3000;
        menu_Rac[2].ID = 3;

        menu_Rac[3].Rasa = "Orange";
        menu_Rac[3].Topping = "Jelly";
        menu_Rac[3].Harga = 27500;
        menu_Rac[3].HargaT = 1500;
        menu_Rac[3].ID = 4;

        menu_Rac[4].Rasa = "Milk";
        menu_Rac[4].Topping = "Cookie";
        menu_Rac[4].Harga = 25500;
        menu_Rac[4].HargaT = 2000;
        menu_Rac[4].ID = 5;

        //Opening Welcome
        System.out.println("Selamat Datang Di Boba");
        System.out.println("________________________________________");

        //CODE pilih menu
        do {

            //Opening Question
            System.out.println("\nIngin Pesan Menu Yang Sudah Jadi, ketik -> FIX");
            System.out.println("Ingin Racik Menu Anda Sendiri, ketik -> RACIK");

            //Deklarasi Lokal
            pilihan = input.nextLine();
            kondisi = " ";

            //ICE
            System.out.println("\nLess ice / normal ice ? ");
            ice = input.nextLine();
            if (ice.equals("less") || ice.equals("Less") || ice.equals("LESS")){
                ice = "less ice";
            } else { //default
                ice = "normal ice";
            }

            //SUGAR
            System.out.println("\nLess sugar / normal sugar ? ");
            sugar = input.nextLine();
            if (sugar.equals("less") || sugar.equals("Less") || sugar.equals("LESS")){
                sugar = "less sugar";
            } else { //default
                sugar = "normal sugar";
            }

            if (pilihan.equals("FIX") || pilihan.equals("fix") || pilihan.equals("Fix")) {

                System.out.println("\nSilahkan pilih dari menu dibawah (input Angka)");
                for (int i = 0; i < max_Fix_Menu-1; i++) {
                    System.out.println("Menu ke-" + menu_Fix[i].ID + ": " + menu_Fix[i].Nama + " , Harga : Rp." + menu_Fix[i].Harga);
                }

                //Deklarasi Lokal
                int pilih_Fix;
                System.out.println("\nAnda memilih menu nomor : ");
                pilih_Fix = input.nextInt();

                //Sentinel
                if (pilih_Fix > 5 || pilih_Fix < 1) {
                    pilih_Fix = 6;
                }

                if (pilih_Fix != menu_Fix[pilih_Fix-1].ID) {
                    kondisi = "loopFix";
                } else {
                    total = PPN(menu_Fix[pilih_Fix-1].Harga);
                    System.out.println("\nPesanan anda : " + menu_Fix[pilih_Fix-1].Nama);
                    System.out.println("Keterangan tambahan : " + ice + " and " + sugar);
                    System.out.println("Total Harga + Pajak : Rp." + total);
                    out = "keluar";
                }

            } else if (pilihan.equals("RACIK") || pilihan.equals("racik") || pilihan.equals("Racik")) {

                //Pilih Rasa
                System.out.println("\nSilahkan pilih Varian Rasa dibawah (input Angka)");
                for (int i = 0; i < max_Fix_Menu-1; i++) {
                    System.out.println(menu_Rac[i].ID + ". " + menu_Rac[i].Rasa + " , Harga : Rp." + menu_Rac[i].Harga);
                }

                //Deklarasi Lokal
                int pilih_Rasa;
                System.out.println("\nAnda memilih Rasa nomor : ");
                pilih_Rasa = input.nextInt();

                //Sentinel
                if (pilih_Rasa > 5 || pilih_Rasa < 1) {
                    pilih_Rasa = 6;
                }

                if (pilih_Rasa != menu_Rac[pilih_Rasa-1].ID) {
                    kondisi = "loopRac";
                } else {
                    total += menu_Rac[pilih_Rasa-1].Harga;

                    //Pilih Topping
                    System.out.println("\nSilahkan pilih Tambahan Topping dibawah (input Angka)");
                    for (int i = 0; i < max_Fix_Menu-1; i++) {
                        System.out.println(menu_Rac[i].ID + ". " + menu_Rac[i].Topping + " , Harga : Rp." + menu_Rac[i].HargaT);
                    }

                    //Deklarasi Lokal
                    int pilih_Topping;
                    System.out.println("\nAnda memilih Topping nomor : ");
                    pilih_Topping = input.nextInt();

                    //Sentinel
                    if (pilih_Topping > 5 || pilih_Topping < 1) {
                        pilih_Topping = 6;
                    }

                    if (pilih_Topping != menu_Rac[pilih_Topping-1].ID) {
                        kondisi = "loopRac";
                    } else {
                        total += menu_Rac[pilih_Topping - 1].HargaT;

                        total = PPN(total);
                        System.out.println("\nPesanan anda Boba rasa : " + menu_Rac[pilih_Rasa - 1].Rasa + ", dengan Toping : " + menu_Rac[pilih_Topping - 1].Topping);
                        System.out.println("Keterangan tambahan : " + ice + " and " + sugar);
                        System.out.println("Total Harga + Pajak : Rp." + total);
                        out = "keluar";
                    }
                }

            } else {

                kondisi = "loopMenu";

            }

            if (kondisi.equals("loopMenu")) {
                System.out.println("\nInput tidak valid. Silahkan masukkan input sembarang untuk kembali memesan");
                System.out.println("Atau ketik 'keluar' untuk keluar");
                out = input.nextLine();
            } else if (kondisi.equals("loopFix")) {
                System.out.println("\nPilihan Menu tidak ada, masukkan input sembarang untuk kembali memesan");
                System.out.println("Atau ketik 'keluar' untuk keluar");
                out = input.nextLine();
                out = input.nextLine();
            } else if (kondisi.equals("loopRac")) {
                System.out.println("\nPilihan anda tidak ada, masukkan input sembarang untuk kembali memesan");
                System.out.println("Atau ketik 'keluar' untuk keluar");
                out = input.nextLine();
                out = input.nextLine();
            }

        } while (!out.equals("keluar"));
    }
}
