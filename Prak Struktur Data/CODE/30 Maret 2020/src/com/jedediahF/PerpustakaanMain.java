package com.jedediahF;

import java.util.*;

public class PerpustakaanMain {

    static class Member {
        String nama;
        String telepon;

        Member(String nama, String telepon) {
            this.nama = nama;
            this.telepon = telepon;
        }
    }

    static class Buku {
        String idBuku;
        String judul;

        Buku(String idBuku, String judul) {
            this.idBuku = idBuku;
            this.judul = judul;
        }
    }

    static class Peminjaman {
        String idMember;
        String idBuku;

        Peminjaman(String idMember, String idBuku) {
            this.idMember = idMember;
            this.idBuku = idBuku;
        }
    }

    // DEKLARASI
    static HashMap<String, Member> map = new HashMap<String, Member>();
    static LinkedList<Buku> list = new LinkedList<Buku>();
    static ArrayList<Peminjaman> arrayList = new ArrayList<Peminjaman>();

    // Menu Awasl
    private static void MenuAwal() {
        System.out.println("\nProgram Perpustakaan");
        System.out.println("1. Member");
        System.out.println("2. Buku");
        System.out.println("3. Peminjaman");
        System.out.println("4. Pengembalian");
        System.out.println("5. Exit");
        System.out.print("--> ");
    }

    // Menu 1. Member
    private static void MenuMember() {
        System.out.println("\nMenu Member : ");
        System.out.println("1. Tambah Member");
        System.out.println("2. Hapus Member");
        System.out.println("3. <- Back");
        System.out.print("-->");
    }

    // Menu 2. Buku
    private static void MenuBuku() {
        System.out.println("\nMenu Buku : ");
        System.out.println("1. Tambah Data Buku");
        System.out.println("2. Hapus Data Buku");
        System.out.println("3. <- Back");
        System.out.print("-->");
    }

    // Menu 3. Peminjaman
    private static void MenuPeminjaman() {
        System.out.println("\nMenu Peminjaman Buku : ");
    }

    private static boolean CekID(String members, String books) {
        boolean boolMember = false;
        boolean boolBuku = false;

        for (String i : map.keySet()) {
            if (i.equals(members)) {
                boolMember = true;
            }
        }

        Iterator iterator = list.iterator();
        int i = 0;
        while (iterator.hasNext() && !boolBuku) {
            Buku temp = (Buku)iterator.next();
            if (temp.idBuku.equals(books)) {
                boolBuku = true;
            }
            i++;
        }
        return (boolBuku && boolMember);
    }

    // Menu 4. Pengembalian
    private static void MenuPengembalian() {
        System.out.println("\nMenu Pengembalian Buku : ");
    }

    public static void main(String[] args) {

        // Deklarasi
        Member m1 = new Member("Jeddi", "08886076079");
        map.put("001", m1);
        Member m2 = new Member("Fanuel", "08186212440");
        map.put("002", m2);

        Buku b1 = new Buku("B001", "Perahu Kertas");
        list.add(b1);
        Buku b2 = new Buku("B002", "Revolusi Mental");
        list.add(b2);

        Peminjaman p1 = new Peminjaman("001", "B001");
        arrayList.add(p1);
        Peminjaman p2 = new Peminjaman("002", "B002");
        arrayList.add(p2);

        Scanner input = new Scanner(System.in);

        String nama = "";
        String telepon = "";

        String id_Buku = "";
        String judul_Buku = "";

        String id_Member = "";

        String idHapus = "";
        String pilihan = "";
        int id = 1;
        int user = 0;
        boolean exit = false;
        // Program Dijalankan
        while(!exit) {
            MenuAwal();
            pilihan = input.nextLine();
            if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3") || pilihan.equals("4") || pilihan.equals("5")) {
                user = Integer.parseInt(pilihan);
                switch (user) {
                    case 1:
                        MenuMember();
                        pilihan = input.nextLine();
                        if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3")) {
                            user = Integer.parseInt(pilihan);
                            switch (user) {
                                case 1:
                                    System.out.print("Masukkan nama : ");
                                    nama = input.nextLine();

                                    System.out.print("Masukkan nomor telepon : ");
                                    telepon = input.nextLine();

                                    Member memberBaru = new Member(nama, telepon);
                                    map.put(String.valueOf(id), memberBaru);
                                    System.out.println("\nPenambahan Data Member Berhasil");
                                    System.out.println("ID Member : " + id);
                                    System.out.println("Nama : " + nama);

                                    id += 1;
                                    break;
                                case 2:
                                    System.out.print("Masukkan Nama : ");
                                    idHapus = input.nextLine();

                                    map.remove(idHapus);
                                    System.out.println("\nPenghapusan Data Member Berhasil");
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            System.out.println("Invalid Input\n");
                        }
                        break;
                    case 2:
                        MenuBuku();
                        pilihan = input.nextLine();
                        if (pilihan.equals("1") || pilihan.equals("2") || pilihan.equals("3")) {
                            user = Integer.parseInt(pilihan);
                            switch (user) {
                                case 1:
                                    System.out.print("Masukkan ID Buku : ");
                                    id_Buku = input.nextLine();

                                    System.out.print("Masukkan Judul Buku : ");
                                    judul_Buku = input.nextLine();

                                    Buku bukuBaru = new Buku(id_Buku, judul_Buku);
                                    list.add(bukuBaru);
                                    System.out.println("\nPenambahan Data Buku Berhasil");
                                    System.out.println("ID Buku : " + id_Buku);
                                    System.out.println("Judul Buku : " + judul_Buku);

                                    break;
                                case 2:
                                    System.out.print("Masukkan ID Buku : ");
                                    idHapus = input.nextLine();

                                    list.remove(idHapus);
                                    System.out.println("\nPenghapusan Data Buku Berhasil");
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            System.out.println("Invalid Input\n");
                        }
                        break;
                    case 3:
                        MenuPeminjaman();
                        System.out.print("Masukkan ID Member : ");
                        id_Member = input.nextLine();
                        System.out.print("Masukkan ID Buku : ");
                        id_Buku = input.nextLine();

                        if ((CekID(id_Member, id_Buku))) {
                            Peminjaman peminjamBaru = new Peminjaman(id_Member, id_Buku);
                            arrayList.add(peminjamBaru);
                            System.out.println("Peminjaman Berhasil");
                        } else {
                            System.out.println("\nID tidak terdata\n");
                        }
                        break;
                    case 4:
                        MenuPengembalian();
                        System.out.print("Masukkan ID Member : ");
                        id_Member = input.nextLine();
                        System.out.print("Masukkan ID Buku : ");
                        id_Buku = input.nextLine();

                        // Cek inputan user
                        int simpan_index = 0;
                        boolean bool = false;

                        for (int i = 0; i < arrayList.size(); i++) {
                            Peminjaman n = arrayList.get(i);
                            if (n.idMember.equals(id_Member) && n.idBuku.equals(id_Buku)) {
                                bool = true;
                                simpan_index = i;
                            }
                        }

                        if (bool) {
                            arrayList.remove(simpan_index);
                            System.out.println("Pengembalian berhasil");
                        } else {
                            System.out.println("ID tidak terdata");
                        }
                        break;
                    default:
                        System.out.println("Terima Kasih");
                        exit = true;
                        break;
                }
            } else {
                System.out.println("Invalid input !\n");
            }
        }
    }
}
