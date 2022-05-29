/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import static latihan.HotelHarapanBangsa.inputDataKamar;

/**
 *
 * @author hanschristian
 */
class Member {

    String nama;
    String telepon;

    public Member(String nama, String telepon) {
        this.nama = nama;
        this.telepon = telepon;
    }
}

class Buku {

    String idBuku;
    String judul;

    public Buku(String idBuku, String judul) {
        this.idBuku = idBuku;
        this.judul = judul;
    }
}

class Peminjaman {

    String idMember;
    String idBuku;

    public Peminjaman(String idMember, String idBuku) {
        this.idMember = idMember;
        this.idBuku = idBuku;
    }
}

public class Collections {

    // asumsi memberId dimulai dari 100, lalu +1 setiap tambah member
    static int memberId = 100;
    static HashMap<Integer, Member> mapMember = new HashMap<>();
    static LinkedList<Buku> listBuku = new LinkedList<>();
    static ArrayList<Peminjaman> listPeminjaman = new ArrayList<>();

    public static void main(String[] args) {
        boolean menu = true;
        while (menu) {
            int inputMenu = Integer.parseInt(JOptionPane.showInputDialog(null, "Perpustakaan Harapan Bangsa"
                    + "\n1. Tambah Member Baru"
                    + "\n2. Hapus Member"
                    + "\n3. Tambah Buku Baru"
                    + "\n4. Hapus Buku"
                    + "\n5. Peminjaman Buku"
                    + "\n6. Pengembalian Buku"
                    + "\n7. Exit", 0));

            switch (inputMenu) {
                case 1:
                    tambahMemberBaru();
                    break;
                case 2:
                    hapusMember();
                    break;
                case 3:
                    tambahBukuBaru();
                    break;
                case 4:
                    hapusBuku();
                    break;
                case 5:
                    pinjamBuku();
                    break;
                case 6:
                    kembalikanBuku();
                    break;
                case 7:
                    menu = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Input Salah!", "Alert", JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }
    }

    static void tambahMemberBaru() {
        String nama = JOptionPane.showInputDialog(null, "Input Nama :", 0);
        String telepon = JOptionPane.showInputDialog(null, "Input Telepon :", 0);
        mapMember.put(memberId, new Member(nama, telepon));
        memberId++;
        lihatMember();
        JOptionPane.showMessageDialog(null, "Data member baru berhasil disimpan!");
    }

    static void hapusMember() {
        int idMember = Integer.parseInt(JOptionPane.showInputDialog(null, "Input ID Member :", 0));
        if (mapMember.containsKey(idMember)) {
            mapMember.remove(idMember);
            JOptionPane.showMessageDialog(null, "Data member berhasil dihapus!");
        } else {
            JOptionPane.showMessageDialog(null, "Data member tidak ditemukan!");
        }
        lihatMember();
    }

    static void lihatMember() {
        for (int i : mapMember.keySet()) {
            System.out.println(i + " " + mapMember.get(i).nama + " " + mapMember.get(i).telepon);
        }
        System.out.println("");
    }

    static void tambahBukuBaru() {
        String idBuku = JOptionPane.showInputDialog(null, "Input ID Buku :", 0);
        String judul = JOptionPane.showInputDialog(null, "Input Judul :", 0);
        listBuku.add(new Buku(idBuku, judul));
        lihatBuku();
        JOptionPane.showMessageDialog(null, "Data buku baru berhasil disimpan!");
    }

    static void hapusBuku() {
        String idBuku = JOptionPane.showInputDialog(null, "Input ID Buku :", 0);
        boolean found = false;
        for (int i = 0; i < listBuku.size(); i++) {
            Buku buku = listBuku.get(i);
            if (buku.idBuku.equals(idBuku)) {
                listBuku.remove(i);
                found = true;
            }
        }
        lihatBuku();
        if (found) {
            JOptionPane.showMessageDialog(null, "Data buku berhasil dihapus!");
        } else {
            JOptionPane.showMessageDialog(null, "Data buku tidak ditemukan!");
        }
    }

    static void lihatBuku() {
        for (Buku buku : listBuku) {
            System.out.println(buku.idBuku + " " + buku.judul);
        }
//        for (int i = 0; i < listBuku.size(); i++) {
//            Buku buku = listBuku.get(i);
//            System.out.println(buku.idBuku + " " + buku.judul);
//        }
        System.out.println("");
    }

    static void pinjamBuku() {
        String idBuku = JOptionPane.showInputDialog(null, "Input ID Buku :", 0);
        String idMember = JOptionPane.showInputDialog(null, "Input ID Member :", 0);
        listPeminjaman.add(new Peminjaman(idBuku, idMember));
        lihatPeminjaman();
        JOptionPane.showMessageDialog(null, "Buku berhasil dipinjam!");
    }

    static void kembalikanBuku() {
        String idBuku = JOptionPane.showInputDialog(null, "Input ID Buku :", 0);
        String idMember = JOptionPane.showInputDialog(null, "Input ID Member :", 0);
        boolean found = false;
        for (int i = 0; i < listPeminjaman.size(); i++) {
            Peminjaman pinjam = listPeminjaman.get(i);
            if (pinjam.idBuku.equals(idBuku) && pinjam.idMember.equals(idMember)) {
                listPeminjaman.remove(i);
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, "Buku berhasil dikembalikan!");
        } else {
            JOptionPane.showMessageDialog(null, "Data peminjaman tidak ditemukan!");
        }
        lihatPeminjaman();
    }

    static void lihatPeminjaman() {
        for (Peminjaman pinjam : listPeminjaman) {
            System.out.println(pinjam.idBuku + " " + pinjam.idMember);
        }
//        for (int i = 0; i < listPeminjaman.size(); i++) {
//            Peminjaman pinjam = listPeminjaman.get(i);
//            System.out.println(pinjam.idBuku + " " + pinjam.idMember);
//        }
        System.out.println("");
    }
}
