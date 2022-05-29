package com.jedediahF;
//?Masih Bingung dengan Null Null exception :')
//*Nama : Jedediah Fanuel
//*Nim  : 1119023
import javax.swing.*;

public class HHBalaAla {

    public static cabang[] Cabang = new cabang[3];
    public static int maxArr = 3;
    public static int[] TOTAL = {0, 0, 0};
    public static int[] penuh = {0, 0, 0};

    public static class kamar {
        String Kode;
        int Harga_Malam;
        int Biaya_Rawat;
        int lama_Inap;

        // Constructor
        public kamar(String code, int price, int cost, int time) {
            Kode = code;
            Harga_Malam = price;
            Biaya_Rawat = cost;
            lama_Inap = time;
        }
    }

    public static class cabang {
        String Nama;
        String Lokasi;
        int counter;
        kamar[] Arr_Kamar = new kamar[maxArr];

        // Constructor
        public cabang(String Nama, String Lokasi) {
            this.Nama = Nama;
            this.Lokasi = Lokasi;
        }
    }

    public static void input_Kamar(cabang[] Cabang) {
        String [] options = {"1", "2", "3"};
        String input = (String) JOptionPane.showInputDialog(null, "Input Lokasi Cabang : \n" +
                "1. " + Cabang[0].Nama + "\n" +
                "2. " + Cabang[1].Nama + "\n" +
                "3. " + Cabang[2].Nama, "Cabang", JOptionPane.QUESTION_MESSAGE, null, options, options);
        if (input != null) {
            int lokasi = Integer.parseInt(input);
            String inputJumlah = JOptionPane.showInputDialog(null, "Input Jumlah Kamar : ", "Jumlah Pemesanan ???", JOptionPane.QUESTION_MESSAGE);
            if (inputJumlah != null) {
                int jumlah = Integer.parseInt(inputJumlah);
                int index = lokasi - 1;
                Cabang[index].counter = jumlah;
                if (Cabang[index].counter <= maxArr && Cabang[index].counter >= 1) {
                    for (int i = 0; i < Cabang[index].counter; i++) {
                        if (penuh[index] < maxArr) {
                            boolean found = false;
                            while (!found) {
                                penuh[index] += 1;

                                input = JOptionPane.showInputDialog(null, "Input Kode Kamar : ");
                                if (input != null) {
                                    String kode = input;

                                        input = JOptionPane.showInputDialog(null, "Input Harga per malam kamar " + kode + " : ");
                                        if (input != null) {
                                            int harga = Integer.parseInt(input);

                                            input = JOptionPane.showInputDialog(null, "Input Biaya Perawatan kamar " + kode + " : ");
                                            if (input != null) {
                                                int biaya = Integer.parseInt(input);

                                                input = JOptionPane.showInputDialog(null, "Input Lama Menginap (hari) kamar " + kode + " : ");
                                                if (input != null) {
                                                    int lama = Integer.parseInt(input);

                                                    int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data kamar " + kode + " sudah benar ?");
                                                    switch (confirm) {
                                                        case JOptionPane.YES_OPTION:
                                                            JOptionPane.showMessageDialog(null, "Data kamar baru berhasil disimpan");
                                                            if (index == 0) {
                                                                Cabang[index].Arr_Kamar[i] = new kamar(kode, harga, biaya, lama);
                                                            } else if (index == 1) {
                                                                Cabang[index].Arr_Kamar[i] = new kamar(kode, harga, biaya, lama);
                                                            } else if (index == 2) {
                                                                Cabang[index].Arr_Kamar[i] = new kamar(kode, harga, biaya, lama);
                                                            }
                                                            found = true;
                                                            break;
                                                        case JOptionPane.NO_OPTION:
                                                            JOptionPane.showMessageDialog(null, "Silahkan input ulang data");
                                                            found = false;
                                                            break;
                                                        case JOptionPane.CANCEL_OPTION:
                                                            JOptionPane.showMessageDialog(null, "Pemesanan dibatalkan");
                                                            found = true;
                                                            break;
                                                    }
                                                } else {
                                                    found = true;
                                                }
                                            } else {
                                                found = true;
                                            }
                                        } else {
                                            found = true;
                                        }
                                } else {
                                    found = true;
                                    i = jumlah;
                                }
                            }
                        } else {
                            Cabang[index].counter = maxArr;
                            JOptionPane.showMessageDialog(null, "Kamar Sudah Penuh");
                        }
                    }
                } else if (jumlah > maxArr){
                    JOptionPane.showMessageDialog(null, "Jumlah Kamar Melewati Batas (3 Kamar) !", "Caution", JOptionPane.WARNING_MESSAGE);
                } else if (jumlah < 1){
                    JOptionPane.showMessageDialog(null, "Jumlah Kamar Tidak Valid !", "Caution", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }

    public static void lihat_Kamar(cabang[] Cabang) {
        String [] options = {"1", "2", "3"};
        String input = (String) JOptionPane.showInputDialog(null, "Input Lokasi Cabang : \n" +
                "1. " + Cabang[0].Nama + "\n" +
                "2. " + Cabang[1].Nama + "\n" +
                "3. " + Cabang[2].Nama, "Cabang", JOptionPane.QUESTION_MESSAGE, null, options, options);
        if (input != null) {
            int lokasi = Integer.parseInt(input);
            int index = lokasi - 1;
            if (Cabang[index].counter > 0) {
                for (int i = 0; i < Cabang[index].counter; i++) {
                    JOptionPane.showMessageDialog(null, "Kode : " + Cabang[index].Arr_Kamar[i].Kode + "\n" +
                            "Harga : " + Cabang[index].Arr_Kamar[i].Harga_Malam + "\n" +
                            "Perawatan : " + Cabang[index].Arr_Kamar[i].Biaya_Rawat + "\n" +
                            "Lama Inap : " + Cabang[index].Arr_Kamar[i].lama_Inap
                    );
                }
            } else {
                JOptionPane.showMessageDialog(null, "Kamar Masih Kosong", "Information HHB", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void update_Kamar(cabang[] Cabang) {
        String [] options = {"1", "2", "3"};
        String input = (String) JOptionPane.showInputDialog(null, "Input Lokasi Cabang : \n" +
                "1. " + Cabang[0].Nama + "\n" +
                "2. " + Cabang[1].Nama + "\n" +
                "3. " + Cabang[2].Nama, "Cabang", JOptionPane.QUESTION_MESSAGE, null, options, options);
        if (input != null) {
            int lokasi = Integer.parseInt(input);
            int index = lokasi - 1;

            int iterator = 0;
            int index_Kode = 0;
            boolean found = false;

            input = JOptionPane.showInputDialog(null, "Input Kode Kamar : ");
            while (found != true && (iterator < maxArr)) {
                if (input != null && Cabang[index].Arr_Kamar[iterator].Kode != null) {
                    if (Cabang[index].Arr_Kamar[iterator].Kode.equals(input)) {
                        found = true;
                        index_Kode = iterator;
                    } else {
                        iterator += 1;
                        found = false;
                    }
                } else {
                    found = false;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Kode kamar tidak ditemukan", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {

                input = JOptionPane.showInputDialog(null, "Input Harga Kamar");
                if(input != null) {
                    Cabang[index].Arr_Kamar[index_Kode].Harga_Malam = Integer.parseInt(input);

                    input = JOptionPane.showInputDialog(null, "Input Biaya Perawatan");
                    if (input != null) {
                        Cabang[index].Arr_Kamar[index_Kode].Biaya_Rawat = Integer.parseInt(input);

                        input = JOptionPane.showInputDialog(null, "Lama Menginap");
                        if (input != null) {
                            Cabang[index].Arr_Kamar[index_Kode].lama_Inap = Integer.parseInt(input);
                        }
                    }
                }
            }
        }
    }

    public static int fungsi_hitung_Kamar(int harga, int lama, int rawat){
        return (harga * lama) - rawat;
    }

    public static void hitung_Kamar(cabang[] Cabang) {
        String [] options = {"1", "2", "3"};
        String input = (String) JOptionPane.showInputDialog(null, "Input Lokasi Cabang : \n" +
                "1. " + Cabang[0].Nama + "\n" +
                "2. " + Cabang[1].Nama + "\n" +
                "3. " + Cabang[2].Nama, "Cabang", JOptionPane.QUESTION_MESSAGE, null, options, options);
        if (input != null) {
            int lokasi = Integer.parseInt(input);
            int index = lokasi - 1;

            input = JOptionPane.showInputDialog(null, "Input Kode Kamar : ");
            if (input != null) {
                String cek_Kode = input;
                int iterator = 0;
                int index_Kode = 0;
                boolean found;
                do {
                    if (!(Cabang[index].Arr_Kamar[iterator].Kode).equals(cek_Kode)) {
                        found = false;
                        iterator += 1;
                    } else {
                        found = true;
                        index_Kode = iterator;
                    }
                } while ((Cabang[index].Arr_Kamar[iterator].Kode.equals(cek_Kode)) && !found);

                if (!found) {
                    JOptionPane.showMessageDialog(null, "Kode kamar tidak ditemukan", "Alert", JOptionPane.WARNING_MESSAGE);
                } else {
                    int hasil = 0;
                    hasil = fungsi_hitung_Kamar(Cabang[index].Arr_Kamar[index_Kode].Harga_Malam,
                            Cabang[index].Arr_Kamar[index_Kode].lama_Inap,
                            Cabang[index].Arr_Kamar[index_Kode].Biaya_Rawat);

                    JOptionPane.showMessageDialog(null, "Tertera : Rp." + hasil, "Biaya Kamar dengan Kode " + Cabang[index].Arr_Kamar[index_Kode].Kode, JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
    }

    public static void keuntungan_Cabang(cabang[] Cabang) {
        String [] options = {"1", "2", "3"};
        String input = (String) JOptionPane.showInputDialog(null, "Input Lokasi Cabang : \n" +
                "1. " + Cabang[0].Nama + "\n" +
                "2. " + Cabang[1].Nama + "\n" +
                "3. " + Cabang[2].Nama, "Cabang", JOptionPane.QUESTION_MESSAGE, null, options, options);
        if (input != null) {
            int lokasi = Integer.parseInt(input);
            int index = lokasi - 1;

            TOTAL[index] = 0;
            for (int i = 0; i < Cabang[index].counter; i++) {
                TOTAL[index] += fungsi_hitung_Kamar(Cabang[index].Arr_Kamar[i].Harga_Malam,
                        Cabang[index].Arr_Kamar[i].lama_Inap,
                        Cabang[index].Arr_Kamar[i].Biaya_Rawat);
            }
            JOptionPane.showMessageDialog(null, "Tertera : Rp." + TOTAL[index], "Pendapatan Cabang " + Cabang[index].Nama, JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void keuntungan_Total(cabang[] Cabang, int[] TOTAL) {
        int Total = 0;
        for (int index = 0; index < 3; index++) {
            for (int i = 0; i < Cabang[index].counter; i++) {
                Total += fungsi_hitung_Kamar(Cabang[index].Arr_Kamar[i].Harga_Malam,
                        Cabang[index].Arr_Kamar[i].lama_Inap,
                        Cabang[index].Arr_Kamar[i].Biaya_Rawat);
            }
        }
        JOptionPane.showMessageDialog(null, "Tertera : Rp." + Total, "Pendapatan Hotel Harapan Bangsa ", JOptionPane.INFORMATION_MESSAGE);
    }

    public static class menu_Awal {

        public menu_Awal(cabang[] Cabang) {
            boolean found = false;
            String [] options = {"1", "2", "3", "4", "5", "6"};
            while (!found) {
                String input = (String) JOptionPane.showInputDialog(null, "Hotel Harapan Bangsa" +
                        "\n 1. Input Data Kamar" +
                        "\n 2. Lihat Data Kamar" +
                        "\n 3. Update Data Kamar" +
                        "\n 4. Hitung Total Bayar Suatu Kamar" +
                        "\n 5. Hitung Keuntungan Total Suatu Cabang" +
                        "\n 6. Hitung Keuntungan Total Semua Cabang","Hotel Harapan Bangsa Gas Kuy !", JOptionPane.QUESTION_MESSAGE, null, options, options);
                if (input != null) {
                    int inputPilihan = Integer.parseInt(input);
                    switch (inputPilihan) {
                        case 1:
                            input_Kamar(Cabang);
                            break;
                        case 2:
                            lihat_Kamar(Cabang);
                            break;
                        case 3:
                            update_Kamar(Cabang);
                            break;
                        case 4:
                            hitung_Kamar(Cabang);
                            break;
                        case 5:
                            keuntungan_Cabang(Cabang);
                            break;
                        case 6:
                            keuntungan_Total(Cabang, TOTAL);
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

    public static void main(String[] args) {

        Cabang[0] = new cabang("Dago", "Jl.Dago");
        Cabang[1] = new cabang("Sudirman", "Jl.Sudirman");
        Cabang[2] = new cabang("Dipatiukur", "Jl.Dipatiukur");

        new menu_Awal(Cabang);

    }
}
