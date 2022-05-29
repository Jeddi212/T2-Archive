package com.jedediahF;

// Nama : Jedediah Fanuel
// Nim  : 1119023

public class Nomor1 {

    public static class Absensi {
        double jamMasuk;
        double jamKeluar;

        Absensi(double jamMasuk, double jamKeluar) {
            this.jamMasuk = jamMasuk;
            this.jamKeluar = jamKeluar;
        }
    }

    public static class MataKuiah {
        String kode;
        String nama;
        String kategori;
        double jadwalJamMasuk;
        int SKS;
        Absensi[] arrAbsensi = new Absensi[14];

        MataKuiah(String kode, String nama, String kategori, double jadwalJamMasuk, int SKS) {
            this.kode = kode;
            this.nama = nama;
            this.kategori = kategori;
            this.jadwalJamMasuk = jadwalJamMasuk;
            this.SKS = SKS;
        }
    }

    // Bagian a
    private static int hitungKeterlambatan(MataKuiah MK) {
        int terlambat = 0;
        for (int i = 0; i < 14; i++) {
            if (MK.arrAbsensi[i].jamMasuk > MK.jadwalJamMasuk) {
                terlambat++;
            }
        }
        return terlambat;
    }

    // Bagian b
    private static int hitungHonor(MataKuiah MK) {
        int bayar = 0;

        if (MK.kategori == "MKTetap") {

            for (int i = 0; i < 14; i++) {
                if (MK.arrAbsensi[i].jamMasuk > MK.jadwalJamMasuk) {
                    bayar += MK.SKS * (10000 / 2);
                } else {
                    bayar += MK.SKS * 10000;
                }
            }

        } else if (MK.kategori == "MKPil") {

            for (int i = 0; i < 14; i++) {
                if (MK.arrAbsensi[i].jamMasuk > MK.jadwalJamMasuk) {
                    bayar += MK.SKS * (20000 / 2);
                } else {
                    bayar += MK.SKS * 20000;
                }
            }

        } else /* MK.kategori == "MKUmum */ {

            for (int i = 0; i < 14; i++) {
                if (MK.arrAbsensi[i].jamMasuk > MK.jadwalJamMasuk) {
                    bayar += MK.SKS * (30000 / 2);
                } else {
                    bayar += MK.SKS * 30000;
                }
            }

        }
        return bayar;
    }

    // Bagian c
    private static int totalHonor(MataKuiah[] Transaksi) {
        int total = 0;

        for (int i = 0; i < /* 50, karena dihardcode nya cuman 2 jadi kurang dari 2 aja*/ 2; i++) {
            total += hitungHonor(Transaksi[i]);
        }

        return total;
    }

    public static void main(String[] args) {

        MataKuiah[] transactions = new MataKuiah[50];

        transactions[0] = new MataKuiah("101", "Udin", "MKUmum", 13.00, 2);
        transactions[0].arrAbsensi[0] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[1] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[2] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[3] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[4] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[5] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[6] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[7] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[8] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[9] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[10] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[11] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[12] = new Absensi(13.00, 15.00);
        transactions[0].arrAbsensi[13] = new Absensi(13.00, 15.00);

        transactions[1] = new MataKuiah("103", "Mamang", "MKTetap", 08.00, 3);
        transactions[1].arrAbsensi[0] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[1] = new Absensi(08.10, 15.00);
        transactions[1].arrAbsensi[2] = new Absensi(08.02, 15.00);
        transactions[1].arrAbsensi[3] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[4] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[5] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[6] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[7] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[8] = new Absensi(08.01, 15.00);
        transactions[1].arrAbsensi[9] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[10] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[11] = new Absensi(08.40, 15.00);
        transactions[1].arrAbsensi[12] = new Absensi(08.00, 15.00);
        transactions[1].arrAbsensi[13] = new Absensi(09.00, 15.00);

        int telat = 0;
        int honor = 0;
        int bayar = 0;

        // RUN
        System.out.println("Program Nomor 1\n");

        System.out.println("Bagian A : ");
        telat = hitungKeterlambatan(transactions[0]);
        System.out.println("Dosen pada matakuliah ke-1 terlambat sejumlah : " + telat + "\n");
        telat = hitungKeterlambatan(transactions[1]);
        System.out.println("Dosen pada matakuliah ke-2 terlambat sejumlah : " + telat + "\n");

        System.out.println("Bagian B : ");
        honor = hitungHonor(transactions[0]);
        System.out.println("Dosen pada matakuliah ke-1 memiliki honor : " + honor + "\n");
        honor = hitungHonor(transactions[1]);
        System.out.println("Dosen pada matakuliah ke-2 memiliki honor : " + honor + "\n");

        System.out.println("Bagian C : ");
        bayar = totalHonor(transactions);
        System.out.println("Seluruh total biaya honor : " + bayar);
    }
}
