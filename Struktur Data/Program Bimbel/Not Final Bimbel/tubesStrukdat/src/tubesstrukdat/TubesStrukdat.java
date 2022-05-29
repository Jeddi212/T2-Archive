/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesstrukdat;

import java.util.Scanner;
import static tubesstrukdat.controller.*;

/**
 *
 * @author msj
 */
public class TubesStrukdat {
    
    public static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        int choice = 0, choiceAdmin = 0, choiceOthers = 0,choiceStudent = 0, choiceTeacher = 0, 
                i = 4, chance = 3, topup, tanggal, bulan, tahun, totalBayar = 0, biayaBaru, gajiBaru, choiceCek = 0;
        String id = null, username, password, choiceTopup = "", pay = "";
        controller.inisialisasi();
        Admin adm = controller.inisialisasiAdmin();
        
        while (choice != 5) {
            chance = 3;
            id = null;
            System.out.println("1.Pelajar");
            System.out.println("2.Pengajar");
            System.out.println("3.Admin");
            System.out.println("4.Other");
            System.out.println("5.Exit");
            System.out.print("--->");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    choiceStudent = 0;
                    do{
                        System.out.println("--Login Student--");
                        System.out.print("Username: ");
                        username = scan.next();
                        System.out.print("Password: ");
                        password = scan.next();
                        if(controller.validasiLogInStudent(username, password)){
                            chance = 0;
                            System.out.println("--Selamat datang "+username+"--");
                            id = controller.getIdStudent(username, password);
                            while (choiceStudent != 7) {
                                System.out.println("1.TopUp");
                                System.out.println("2.cek Saldo");
                                System.out.println("3.Pembayaran Bimbel");
                                System.out.println("4.cekJadwal");
                                System.out.println("5.History Pembayaran");
                                System.out.println("6.Perubahan Mata Pelajaran");
                                System.out.println("7.LogOut");
                                System.out.print("--->");
                                choiceStudent = scan.nextInt();
                                switch (choiceStudent) {
                                    case 1:
                                        System.out.print("Mau TopUp berapa? Rp");
                                        topup = scan.nextInt();
                                        controller.topUp(id, topup);
                                        break;
                                    case 2:
                                        System.out.println("Saldo kamu adalah Rp"+controller.cekSaldo(id));
                                        break;
                                    case 3:
                                        System.out.print("kamu mau bayar bulan berapa? ");
                                        bulan = scan.nextInt();
                                        System.out.print("tahun? ");
                                        tahun = scan.nextInt();
                                        if(tahun<2020){
                                            System.out.println("Sekarang sudah tahun 2020");
                                        }else if(controller.cekTahunTertinggi(id)>tahun){
                                            System.out.println("kamu Sudah bayar!");
                                        }else if(controller.cekPembayaran(id, bulan, tahun)){
                                            System.out.println("Horaii, kamu Sudah bayar!!");
                                        }else if(controller.cekBulanTertinggi(id)>bulan){
                                            System.out.println("Sudah dibayar");
                                        }else{
                                            System.out.print("Sekarang tanggal berapa? ");
                                            tanggal = scan.nextInt();
                                            if(controller.cekBulanTertinggi(id) == 0){
                                                totalBayar = (adm.biayaPerSatuMatpel*controller.hitungPengambilanMatpel(id)*bulan);
                                            }else{
                                                if(tahun > 2020){
                                                    totalBayar = (adm.biayaPerSatuMatpel*((12-controller.cekBulanTertinggi(id))+bulan))*controller.hitungPengambilanMatpel(id);
                                                }else{
                                                    totalBayar = (adm.biayaPerSatuMatpel*(bulan-controller.cekBulanTertinggi(id)))*controller.hitungPengambilanMatpel(id);
                                                }
                                            }
                                            System.out.println("Jumlah matkul yang diambil: "+controller.hitungPengambilanMatpel(id));
                                            System.out.println("Biaya per matkul Rp"+adm.biayaPerSatuMatpel);
                                            System.out.println("----------------------------------");
                                            System.out.println("Biaya yang harus kamu bayar Rp "+totalBayar);
                                                System.out.print("Mau bayar sekarang?(y/n) ");
                                                pay = scan.next();

                                                if("n".equals(pay)){
                                                    System.out.println("Oke!!");
                                                    break;
                                                }else if("y".equals(pay)){
                                                    if(controller.cekSaldo(id) < totalBayar){
                                                        System.out.println("--Saldo kamu kurang, harus top up dulu!--");
                                                        System.out.print("Masukkan jumlah topup ");
                                                        topup = scan.nextInt();
                                                        controller.topUp(id, topup);
                                                            System.out.print("Lanjut Pembayaran?(y/n) ");
                                                            choiceTopup = scan.next();
                                                            if("y".equals(choiceTopup)){
                                                                controller.pembayaranBimbel(id, tanggal, bulan, tahun, totalBayar);
                                                                controller.penguranganSaldo(id, totalBayar);
                                                            }else if("n".equals(choiceTopup)){
                                                                System.out.println("oke");
                                                                break;
                                                            }else{
                                                                System.out.println("Input salah");
                                                                break;
                                                            }
                                                    }else{
                                                        controller.pembayaranBimbel(id, tanggal, bulan, tahun, totalBayar);
                                                        controller.penguranganSaldo(id, totalBayar);
                                                    }
                                                }else{
                                                    System.out.println("input salah");
                                                    break;
                                                }
                                        }
                                        break;
                                    case 4:
                                        controller.cekJadwalStudent(id);
                                        break;
                                    case 5:
                                        controller.historyPembayaranPerStudent(id);
                                        break;
                                    case 6:
                                        controller.perubahanMataPelajaran(id);
                                        break;
                                }
                            }
                        }else{
                            chance--;
                        }
                    }while(chance != 0);
                    
                    break;
                case 2:
                    choiceTeacher = 0;
                    do{
                        System.out.println("--Login Teacher--");
                        System.out.print("Username: ");
                        username = scan.next();
                        System.out.print("Password: ");
                        password = scan.next();
                        if(controller.validasiLogInTeacher(username, password)){
                            chance = 0;
                            System.out.println("--Selamat datang "+username+"--");
                            id = controller.getIdTeacher(username, password);
                            while (choiceTeacher != 5) {
                                System.out.println("1.Lihat jadwal mengajar");
                                System.out.println("2.Lihat daftar murid");
                                System.out.println("3.Perubahan Jadwal");
                                System.out.println("4.Cek gaji");
                                System.out.println("5.LogOut");
                                System.out.print("--->");
                                choiceTeacher = scan.nextInt();
                                switch (choiceTeacher) {
                                    case 1:
                                        controller.jadwalMengajar(id);
                                        break;
                                    case 2:
                                        controller.retrieveMuridYangDiajar(id);
                                        break;
                                    case 3:
                                        controller.perubahanJadwal(id);
                                        break;
                                    case 4:
                                        controller.cekGajiSatuTeacher(id);
                                        break;
                                }
                            }
                        }else{
                            chance--;
                        }
                    }while(chance != 0);
                    
                    
                    break;
                case 3:
                    choiceAdmin = 0;
                    choiceTeacher = 0;
                    do{
                        System.out.println("--Login Admin--");
                        System.out.print("Username: ");
                        username = scan.next();
                        System.out.print("Password: ");
                        password = scan.next();
                        if("admin".equals(username) && "1234".equals(password)){
                            chance = 0;
                            System.out.println("--Selamat datang "+username+"--");
                            while (choiceAdmin != 8) {
                                System.out.println("1.Lihat jadwal");
                                System.out.println("2.Lihat Student");
                                System.out.println("3.Lihat Teacher");
                                System.out.println("4.Lihat History Transaksi");
                                System.out.println("5.Ubah harga biaya per mata pelajaran");
                                System.out.println("6.Ubah gaji guru");
                                System.out.println("7.Penggajian guru");
                                System.out.println("8.LogOut");
                                System.out.print("--->");
                                choiceAdmin = scan.nextInt();
                                switch (choiceAdmin) {
                                    case 1:
                                        controller.retrieveJadwal();
                                        break;
                                    case 2:
                                        controller.retrieveStudent();
                                        break;
                                    case 3:
                                        controller.retrieveTeacher();
                                        break;
                                    case 4:
                                        choiceCek = 0;
                                        while (choiceCek != 3) {
                                            System.out.println("1.Cek Gaji Guru");
                                            System.out.println("2.Cek Pembayaran Murid");
                                            System.out.println("3.Exit");
                                            System.out.print("--->");
                                            choiceCek = scan.nextInt();
                                            switch (choiceCek) {
                                                case 1:
                                                    controller.retrieveSemuaGaji();
                                                    break;
                                                case 2:
                                                    controller.retrieveSemuaPembayaran();
                                                    break;
                                            }
                                        }
                                        break;
                                    case 5:
                                        System.out.print("Masukkan Biaya yang baru Rp");
                                        biayaBaru = scan.nextInt();
                                        adm.biayaPerSatuMatpel = biayaBaru;
                                        break;
                                    case 6:
                                        System.out.print("Masukkan gaji yang baru Rp");
                                        gajiBaru = scan.nextInt();
                                        adm.Gaji = gajiBaru;
                                        break;
                                    case 7:
                                        controller.penggajianTeacher(adm.Gaji);
                                        break;
                                }
                            }
                        }else{
                            chance--;
                        }
                    }while(chance != 0);
                    
                    break;
                case 4:
                    choiceOthers = 0;
                    System.out.println("--------");
                    System.out.println("Heloo!!!");
                    System.out.println("--------");
                    while (choiceOthers != 3) {
                        System.out.println("1.Registrasi");
                        System.out.println("2.About Us");
                        System.out.println("3.Exit");
                        System.out.print("--->");
                        choiceOthers = scan.nextInt();

                            switch (choiceOthers) {
                                case 1:
                                    System.out.println("---------------------");
                                    System.out.println("Registrasi murid baru");
                                    System.out.println("---------------------");
                                    scan = new Scanner(System.in);
                                    System.out.print("Masukkan username: ");
                                    username = scan.nextLine();
                                    scan = new Scanner(System.in);
                                    System.out.print("Masukkan password: ");
                                    password = scan.next();
                                    controller.register(i,username,password);
                                    id = controller.getIdStudent(username, password);
                                    controller.pengambilanMatpel(id);
                                    i++;
                                    choiceOthers = 3;
                                    break;
                                case 2:
                                    controller.aboutUs();
                                    break;
                            }
                        }
                    break;
            }
        }
    }
    
}
