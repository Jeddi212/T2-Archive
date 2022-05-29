/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesstrukdat;

import java.util.Scanner;

/**
 *
 * @author msj
 */

public class controller {
    
    public static Student headStudent = null;
    public static Student tailStudent = null;
    public static Teacher headTeacher = null;
    public static Teacher tailTeacher = null;
    public static Pembayaran headPay = null;
    public static Pembayaran tailPay = null;
    public static Penggajian headGaji = null;
    public static Penggajian tailGaji = null;
    public static PengambilanMatpel headAmbil = null;
    public static PengambilanMatpel tailAmbil = null;
    public static Scanner scan = new Scanner(System.in);
    
    
    public static void inisialisasiStudents(){
        Student s1 = new Student();
        s1.idStudent = "budi1";
        s1.noTelepon = "081234214242";
        s1.email = "budi@gmail.com";
        s1.username = "budi";
        s1.password = "1234";
        s1.saldo = 35000;
        s1.next = null;
        
        if(headStudent == null){
            headStudent = s1;
            tailStudent = s1;
        }
        Student s2 = new Student();
        s2.idStudent = "rremar2";
        s2.noTelepon = "082125435432";
        s2.email = "rremar@gmail.com";
        s2.username = "rremar";
        s2.password = "3462";
        s2.saldo = 50000;
        s2.next = null;
        
        tailStudent.next = s2;
        tailStudent = s2;
        
        Student s3 = new Student();
        s3.idStudent = "bada3";
        s3.noTelepon = "083462462623";
        s3.email = "bada@gmail.com";
        s3.username = "bada";
        s3.password = "1144";
        s3.saldo = 70000;
        s3.next = null;
        
        tailStudent.next = s3;
        tailStudent = s3;
    }
    
    public static void inisialisasiPembayaran(){
        
        Pembayaran pay1 = new Pembayaran();
        pay1.idStudent = "budi1";
        pay1.tanggal = 15;
        pay1.bulan = 1;
        pay1.tahun = 2020;
        pay1.pay = 300000;
        pay1.next = null;
        if(headPay == null){
            headPay = pay1;
            tailPay = pay1;
        }
        Pembayaran pay2 = new Pembayaran();
        pay2.idStudent = "budi1";
        pay2.tanggal = 7;
        pay2.bulan = 2;
        pay2.tahun = 2020;
        pay2.pay = 300000;
        pay2.next = null;
        
        tailPay.next = pay2;
        tailPay = pay2;
        
        Pembayaran pay3 = new Pembayaran();
        pay3.idStudent = "rremar2";
        pay3.tanggal = 21;
        pay3.bulan = 1;
        pay3.tahun = 2020;
        pay3.pay = 300000;
        pay3.next = null;
        
        tailPay.next = pay3;
        tailPay = pay3;
        
        Pembayaran pay4 = new Pembayaran();
        pay4.idStudent = "bada3";
        pay4.tanggal = 24;
        pay4.bulan = 1;
        pay4.tahun = 2020;
        pay4.pay = 300000;
        pay4.next = null;
        
        tailPay.next = pay4;
        tailPay = pay4;
        
    }
    
    public static void inisialisasiTeacher(){
        Teacher t1 = new Teacher();
        Matpel matpel1 = new Matpel();
        Matpel matpel2 = new Matpel();
        Jadwal jadwal1 = new Jadwal();
        Jadwal jadwal2 = new Jadwal();
        Jadwal jadwal3 = new Jadwal();
        t1.idTeacher = "hartono1";
        t1.nameTeacher = "hartono";
        t1.password = "5253";
        t1.next = null;
        matpel1.idMatpel = "matematika0001";
        matpel1.namaMatpel = "Matematika";
        
        jadwal1.idJadwal = "11.0013.00matematika0001";
        jadwal1.idMatpel = "matematika0001";
        jadwal1.tanggal = "2-Februari-2020";
        jadwal1.jamMulai = "11.00";
        jadwal1.jamSelesai = "13.00";
        jadwal1.hari = "selasa";
        jadwal1.next = null;
        if(t1.headJadwal == null){
            t1.headJadwal = jadwal1;
            t1.tailJadwal = jadwal1;
        }
        jadwal2.idJadwal = "15.0017.00matematika0001";
        jadwal2.idMatpel = "matematika0001";
        jadwal2.tanggal = "2-Februari-2020";
        jadwal2.jamMulai = "15.00";
        jadwal2.jamSelesai = "17.00";
        jadwal2.hari = "selasa";
        jadwal2.next = null;
        t1.tailJadwal.next = jadwal2;
        t1.tailJadwal = jadwal2;
        
        matpel1.next = null;
        if(t1.headMatpel == null){
            t1.headMatpel = matpel1;
            t1.tailMatpel = matpel1;
        }
        matpel2.idMatpel = "fisika0112";
        matpel2.namaMatpel = "Fisika";
        
        jadwal3.idJadwal = "9.0011.00fisika0112";
        jadwal3.idMatpel = "fisika0112";
        jadwal3.tanggal = "2-Februari-2020";
        jadwal3.jamMulai = "9.00";
        jadwal3.jamSelesai = "11.00";
        jadwal3.hari = "selasa";
        jadwal3.next = null;
        t1.tailJadwal.next = jadwal3;
        t1.tailJadwal = jadwal3;
        
        matpel2.next = null;
        t1.tailMatpel.next = matpel2;
        t1.tailMatpel = matpel2;
        
        if(headTeacher == null){
            headTeacher = t1;
            tailTeacher = t1;
        }
        
        
        Teacher t2 = new Teacher();
        Matpel matpel4 = new Matpel();
        Matpel matpel5 = new Matpel();
        Matpel matpel8 = new Matpel();
        Matpel matpel9 = new Matpel();
        Jadwal jadwal4 = new Jadwal();
        Jadwal jadwal5 = new Jadwal();
        Jadwal jadwal9 = new Jadwal();
        Jadwal jadwal10 = new Jadwal();
        Jadwal jadwal11 = new Jadwal();
        Jadwal jadwal12 = new Jadwal();
        
        t2.idTeacher = "lidya2";
        t2.nameTeacher = "lidya";
        t2.password = "2522";
        
        matpel4.idMatpel = "inggris0123";
        matpel4.namaMatpel = "Inggris";
        jadwal4.idMatpel = "inggris0123";
        jadwal4.idJadwal = "14.0016.00inggris0123";
        jadwal4.hari = "Rabu";
        jadwal4.tanggal = "3-Februari-2020";
        jadwal4.jamMulai = "14.00";
        jadwal4.jamSelesai = "16.00";
        if(t2.headJadwal == null){
            t2.headJadwal = jadwal4;
            t2.tailJadwal = jadwal4;
        }
        matpel4.next = null;
        if(t2.headMatpel == null){
            t2.headMatpel = matpel4;
            t2.tailMatpel = matpel4;
        }
        
        matpel5.idMatpel = "jerman0213";
        matpel5.namaMatpel = "Jerman";
        
        jadwal5.idJadwal = "17.0019.00jerman0213";
        jadwal5.idMatpel = "jerman0213";
        jadwal5.hari = "Kamis";
        jadwal5.jamMulai = "17.00";
        jadwal5.jamSelesai = "19.00";
        jadwal5.tanggal = "4-Februari-2020";
        jadwal5.next = null;
        
        t2.tailJadwal.next = jadwal5;
        t2.tailJadwal = jadwal5;
        
        matpel5.next = null;
        t2.tailMatpel.next = matpel5;
        t2.tailMatpel = matpel5;
        matpel8.idMatpel = "sunda1113";
        matpel8.namaMatpel = "Bahasa Sunda";
        jadwal9.idJadwal = "16.0018.00sunda1113";
        jadwal9.idMatpel = "sunda1113";
        jadwal9.jamMulai = "16.00";
        jadwal9.jamSelesai = "19.00";
        jadwal9.tanggal = "2-Februari-2020";
        jadwal9.hari = "Selasa";
        jadwal9.next = null;
        t2.tailJadwal.next = jadwal9;
        t2.tailJadwal = jadwal9;
        
        jadwal10.idJadwal = "14.0016.00sunda1113";
        jadwal10.idMatpel = "sunda1113";
        jadwal10.jamMulai = "14.00";
        jadwal10.jamSelesai = "16.00";
        jadwal10.tanggal = "2-Februari-2020";
        jadwal10.hari = "Selasa";
        jadwal10.next = null;
        t2.tailJadwal.next = jadwal10;
        t2.tailJadwal = jadwal10;
        matpel8.next = null;
        t2.tailMatpel.next = matpel8;
        t2.tailMatpel = matpel8;
        
        matpel9.idMatpel = "indonesia1423";
        matpel9.namaMatpel = "Bahasa Indonesia";
        jadwal11.idJadwal = "14.0016.00indonesia1423";
        jadwal11.idMatpel = "indonesia1423";
        jadwal11.jamMulai = "14.00";
        jadwal11.jamSelesai = "16.00";
        jadwal11.hari = "Jumat";
        jadwal11.tanggal = "5-Februari-2020";
        jadwal11.next = null;
        t2.tailJadwal.next = jadwal11;
        t2.tailJadwal = jadwal11;
        matpel9.next = null;
        t2.tailMatpel.next = matpel9;
        t2.tailMatpel = matpel9;
        
        t2.next = null;
        tailTeacher.next = t2;
        tailTeacher = t2;
        
        Teacher t3 = new Teacher();
        Matpel matpel6 = new Matpel();
        Matpel matpel7 = new Matpel();
        Jadwal jadwal6 = new Jadwal();
        Jadwal jadwal7 = new Jadwal();
        Jadwal jadwal8 = new Jadwal();
        t3.idTeacher = "maman3";
        t3.nameTeacher = "maman";
        t3.password = "8456";
        t3.next = null;
        
        matpel6.idMatpel = "akuntansi0431";
        matpel6.namaMatpel = "Akuntansi";
        jadwal6.idMatpel = "akuntansi0431";
        jadwal6.idJadwal = "15.0017.00akuntansi0431";
        jadwal6.hari = "Rabu";
        jadwal6.jamMulai = "15.00";
        jadwal6.jamSelesai = "17.00";
        jadwal6.tanggal = "3-Februari-2020";
        if(t3.headJadwal == null){
            t3.headJadwal = jadwal6;
            t3.tailJadwal = jadwal6;
        }
        jadwal7.idJadwal = "14.0016.00akuntansi0431";
        jadwal7.idMatpel = "akuntansi0431";
        jadwal7.hari = "Jumat";
        jadwal7.jamMulai = "14.00";
        jadwal7.jamSelesai = "16.00";
        jadwal7.tanggal = "5-Februari-2020";
        t3.tailJadwal.next = jadwal7;
        t3.tailJadwal = jadwal7;
        matpel6.next = null;
        if(t3.headMatpel == null){
            t3.headMatpel = matpel6;
            t3.tailMatpel = matpel6;
        }
        matpel7.idMatpel = "geografi1024";
        matpel7.namaMatpel = "Geografi";
        jadwal8.idJadwal = "13.0015.00geografi1024";
        jadwal8.idMatpel = "geografi1024";
        jadwal8.jamMulai = "13.00";
        jadwal8.jamSelesai = "15.00";
        jadwal8.tanggal = "4-Februari-2020";
        jadwal8.hari = "Kamis";
        jadwal8.next = null;
        t3.tailJadwal.next = jadwal8;
        t3.tailJadwal = jadwal8;
        
        matpel7.next = null;
        t3.tailMatpel.next = matpel7;
        t3.tailMatpel = matpel7;
        tailTeacher.next = t3;
        tailTeacher = t3;
        
       
    }
    
    public static void inisialisasiPengambilanMatkul(){
        PengambilanMatpel ambil1 = new PengambilanMatpel();
        PengambilanMatpel ambil2 = new PengambilanMatpel();
        PengambilanMatpel ambil3 = new PengambilanMatpel();
        PengambilanMatpel ambil4 = new PengambilanMatpel();
        PengambilanMatpel ambil5 = new PengambilanMatpel();
        PengambilanMatpel ambil6 = new PengambilanMatpel();
        
        ambil1.idTeacher = "hartono1";
        ambil1.idStudent = "rremar2";
        ambil1.idMatpel = "fisika0112";
        ambil1.jadwal = "9.0011.00fisika0112";
        ambil1.next = null;
        if(headAmbil == null){
            headAmbil = ambil1;
            tailAmbil = ambil1;
        }
        ambil2.idTeacher = "hartono1";
        ambil2.idStudent = "rremar2";
        ambil2.idMatpel = "matematika0001";
        ambil2.jadwal = "11.0013.00matematika0001";
        ambil2.next = null;
        tailAmbil.next = ambil2;
        tailAmbil = ambil2;
        
        ambil3.idTeacher = "hartono1";
        ambil3.idStudent = "budi1";
        ambil3.idMatpel = "matematika0001";
        ambil3.jadwal = "11.0013.00matematika0001";
        ambil3.next = null;
        tailAmbil.next = ambil3;
        tailAmbil = ambil3;
        
        ambil4.idTeacher = "maman3";
        ambil4.idStudent = "budi1";
        ambil4.idMatpel = "akuntansi0431";
        ambil4.jadwal = "15.0017.00akuntansi0431";
        ambil4.next = null;
        tailAmbil.next = ambil4;
        tailAmbil = ambil4;
        
        ambil5.idTeacher = "lidya2";
        ambil5.idStudent = "budi1";
        ambil5.idMatpel = "sunda1113";
        ambil5.jadwal = "14.0016.00sunda1113";
        ambil5.next = null;
        tailAmbil.next = ambil5;
        tailAmbil = ambil5;
        
        ambil6.idTeacher = "lidya2";
        ambil6.idStudent = "bada3";
        ambil6.idMatpel = "jerman0213";
        ambil6.jadwal = "17.0019.00jerman0213";
        ambil6.next = null;
        tailAmbil.next = ambil6;
        tailAmbil = ambil6;
        
    }
    
    public static Admin inisialisasiAdmin(){
        Admin adm = new Admin();
        adm.biayaPerSatuMatpel = 150000;
        adm.Gaji = 100000;
        
        return adm;
    }
    
    public static void inisialisasiPenggajian(){
        Penggajian p1 = new Penggajian();
        Penggajian p2 = new Penggajian();
        Penggajian p3 = new Penggajian();
        Penggajian p4 = new Penggajian();
        
        p1.idTeacher = "hartono1";
        p1.gaji = 300000;
        p1.tanggal = 20;
        p1.bulan = 1;
        p1.tahun = 2020;
        p1.next = null;
        if(headGaji == null){
            headGaji = p1;
            tailGaji = p1;
        }
        
        p2.idTeacher = "hartono1";
        p2.gaji = 300000;
        p2.tanggal = 15;
        p2.bulan = 2;
        p2.tahun = 2020;
        p2.next = null;
        
        tailGaji.next = p2;
        tailGaji = p2;
        
        p3.idTeacher = "lidya2";
        p3.gaji = 200000;
        p3.tanggal = 15;
        p3.bulan = 1;
        p3.tahun = 2020;
        p3.next = null;
        tailGaji.next = p3;
        tailGaji = p3;
        
        p4.idTeacher = "maman3";
        p4.gaji = 100000;
        p4.tanggal = 15;
        p4.bulan = 1;
        p4.tahun = 2020;
        p4.next = null;
        tailGaji.next = p4;
        tailGaji = p4;
        
    }
    
    public static void cekJadwalStudent(String id){
            PengambilanMatpel p = headAmbil;
            Teacher q = headTeacher;
            Student j = headStudent;
            Jadwal k = q.headJadwal;
            Matpel l = q.headMatpel;
            boolean found = false;
            
                while (p != null) {
                    if(p.idStudent == null ? id == null : p.idStudent.equals(id)){
                        q = headTeacher;
                        while (q != null) {
                            if(q.idTeacher == null ? p.idTeacher == null : q.idTeacher.equals(p.idTeacher)){
                                System.out.println("Pengajar "+q.nameTeacher);
                                l = q.headMatpel;
                                while (l != null) {
                                    if(l.idMatpel == null ? p.idMatpel == null : l.idMatpel.equals(p.idMatpel)){
                                        System.out.println("Matkul: "+l.namaMatpel);
                                        k = q.headJadwal;
                                            while (k != null) {
                                                if(k.idJadwal == null ? p.jadwal == null : k.idJadwal.equals(p.jadwal)){
                                                    System.out.println(k.hari+", "+k.tanggal);
                                                    System.out.println(k.jamMulai+" - "+k.jamSelesai);
                                                    System.out.println("---------------------------");
                                                    k = k.next;
                                                }else{
                                                    k = k.next;
                                                }
                                            }
                                            l = l.next;
                                    }else{
                                        l = l.next;
                                    }
                                }
                                q = q.next;
                            }else{
                                q = q.next;
                            }
                        }
                        p = p.next;
                    }else{
                        p = p.next;
                    }
                }
                p = headAmbil;
                while (p != null && !found) {
                    if(p.idStudent == id){
                        found = true;
                    }else{
                        p = p.next;
                    }
                }
                
                if(!found){
                    System.out.println("Belum ada jadwal");
                    System.out.println("------------------");
                }
    }
    
    public static boolean validasiLogInStudent(String username,String password){
        Student p = headStudent;
        boolean found = false;
            while (p != null && !found) {
                if((p.username == null ? username == null : p.username.equals(username)) && (p.password == null ? password == null : p.password.equals(password))){
                    found = true;
                }else{
                    p = p.next;
                }
            }
        return(found);
    }
    
    public static boolean validasiLogInTeacher(String username,String password){
        Teacher p = headTeacher;
        boolean found = false;
            while (p != null && !found) {
                if((p.nameTeacher == null ? username == null : p.nameTeacher.equals(username)) && (p.password == null ? password == null : p.password.equals(password))){
                    found = true;
                }else{
                    p = p.next;
                }
            }
            return(found);
    }
    
    public static String getIdStudent(String username,String password){
        Student p = headStudent;
        boolean found = false;
            while (p != null && !found) {
                if((p.username == null ? username == null : p.username.equals(username)) && (p.password == null ? password == null : p.password.equals(password))){
                    found = true;
                }else{
                    p = p.next;
                }
            }
        return(p.idStudent);
    }
    
    public static String getIdTeacher(String username,String password){
        Teacher p = headTeacher;
        boolean found = false;
            while (p != null && !found) {
                if((p.nameTeacher == null ? username == null : p.nameTeacher.equals(username)) && p.password.equals(password)){
                    found = true;
                }else{
                    p = p.next;
                }
            }
        return(p.idTeacher);
    }
    
    public static void topUp(String idStudent, int nominalTopUp){
       Student p = headStudent;
        boolean found = false;
        while (p != null && !found) {
            if(p.idStudent == null ? idStudent == null : p.idStudent.equals(idStudent)){
                found = true;
            }else{
                p = p.next;
            }
        }
        p.saldo += nominalTopUp;
        System.out.println("Saldo kamu saat ini adalah Rp"+p.saldo);
    }
    
    public static int cekSaldo(String id){
        Student p = headStudent;
        boolean found = false;
        
        while (p != null && !found) {
            if(p.idStudent == null ? id == null : p.idStudent.equals(id)){
                found = true;
            }else{
                p = p.next;
            }
        }
        return(p.saldo);
    }
    
    public static String getNameStudent(String idStudent){
        String name = " ";
        boolean found = false;
        Student p = headStudent;
        while (p != null && !found) {
            if(p.idStudent == null ? idStudent == null : p.idStudent.equals(idStudent)){
                found = true;
                name = p.username;
            }else{
                p = p.next;
            }
        }
        return name;
    }
    
    public static void retrieveStudent(){
            Student p = headStudent;
            int i = 1;
            System.out.println("------------");
            System.out.println("Data Student");
            System.out.println("------------");
            while (p != null) {
                System.out.println(i+". "+p.username+" - "+p.noTelepon+" - "+p.email+" - "+p.idStudent);
                i++;
                p = p.next;
            }
    }
    
    public static boolean cekPembayaran(String id,int bulan,int tahun){
        Pembayaran p = headPay;
        boolean found = false;
        while (p != null && !found) {
            if(p.bulan == bulan && p.tahun == tahun && (p.idStudent == null ? id == null : p.idStudent.equals(id))){
                found = true;
            }else{
                p = p.next;
            }
        }
            return (found);
        
        
    }
    
    public static void retrieveSemuaPembayaran(){
            Pembayaran p = headPay;
            int i = 1;
            System.out.println("----------------");
            System.out.println("Daftar Transaksi");
            System.out.println("----------------");
            while (p != null) {
                System.out.println(i+". "+getNameStudent(p.idStudent)+" - "+p.tanggal+"-"+getMonth(p.bulan)+"-"+p.tahun+" - "+p.pay);
                i++;
                p = p.next;
            }
    }
    
    public static void retrieveTeacher(){
        Teacher p = headTeacher;
            int i = 1;
            System.out.println("------------");
            System.out.println("Data Teacher");
            System.out.println("------------");
            System.out.println("No  Nama    idTeacher");
            while (p != null) {
                System.out.println(i+". "+getNameTeacher(p.idTeacher)+" - "+p.idTeacher);
                i++;
                p = p.next;
            }
    }
    
    public static String getNameTeacher(String id){
        String name = " ";
        boolean found = false;
        Teacher p = headTeacher;
        while (p != null && !found) {
            if(p.idTeacher == null ? id == null : p.idTeacher.equals(id)){
                found = true;
                name = p.nameTeacher;
            }else{
                p = p.next;
            }
        }
        return name;
    }
    
    public static void aboutUs(){
        System.out.println("Bimbel Harapan Bangsa");
        System.out.println("Jl.Bubur Ayam Enak No.743");
        System.out.println("Telp 022-640244");
        System.out.println("Visi: Menghasilkan generasi-generasi unggulan");
        System.out.println("Misi : Mendidik para pelajar sesuai kurikulum yang up to date");
    }
    
    public static String getMonth(int bulan){
        String month="";
        switch (bulan) {
            case 1:
                month = "Januari";
                break;
            case 2:
                month = "Februari";
                break;
            case 3:
                month = "Maret";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "Mei";
                break;
            case 6:
                month = "Juni";
                break;
            case 7:
                month = "Juli";
                break;
            case 8:
                month = "Agustus";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "Oktober";
                break;
            case 11:
                month = "November";
                break;
            case 12:
                month = "Desember";
                break;
            default:
                throw new AssertionError();
        }
        return(month);
    }
    
    public static int cekBulanTertinggi(String id){
        Pembayaran p = headPay;
        int bulanTerakhir = 0;
        while (p != null) {
            if(p.idStudent == null ? id == null : p.idStudent.equals(id)){
                if(bulanTerakhir < p.bulan){
                    bulanTerakhir = p.bulan;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return bulanTerakhir;
    }
    
    public static int cekTahunTertinggi(String id){
        Pembayaran p = headPay;
        int tahunTerakhir = 0;
        while (p != null) {
            if(p.idStudent == null ? id == null : p.idStudent.equals(id)){
                if(tahunTerakhir < p.tahun){
                    tahunTerakhir = p.tahun;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return tahunTerakhir;
    }
    public static void historyPembayaranPerStudent(String id){
        Pembayaran p = headPay;
        int i = 1;
        System.out.println("History Pembayaran");
        while (p != null) {
            if(p.idStudent == null ? id == null : p.idStudent.equals(id)){
                System.out.println(i+". "+p.tanggal+" - "+getMonth(p.bulan)+" - "+p.tahun+" - "+p.pay);
                p = p.next;
            }else{
                p = p.next;
            }
        }
    }
    
    public static void pembayaranBimbel(String id, int tanggal, int bulan, int tahun, int total){
        Pembayaran p = new Pembayaran();
        p.idStudent = id;
        p.tanggal = tanggal;
        p.bulan = bulan;
        p.tahun = tahun;
        p.pay = total;
        tailPay.next = p;
        tailPay = p;
        System.out.println("Pembayaran berhasil!! Terima Kasih");
    }
    
    public static int hitungPengambilanMatpel(String id){
        PengambilanMatpel p = headAmbil;
        int pengambilanMatpel = 0;
        while (p != null) {
            if(p.idStudent == null ? id == null : p.idStudent.equals(id)){
                pengambilanMatpel++;
                p = p.next;
            }else{
                p = p.next;
            }
        }
        return pengambilanMatpel;
    }
    
    public static void inisialisasi(){
        inisialisasiAdmin();
        inisialisasiPembayaran();
        inisialisasiPengambilanMatkul();
        inisialisasiStudents();
        inisialisasiTeacher();
        inisialisasiPenggajian();
    }
    
    public static void penguranganSaldo(String id, int biaya){
        Student p = headStudent;
        boolean found = false;
        
        while (p != null && !found) {
            if(p.idStudent == null ? id == null : p.idStudent.equals(id)){
                found = true;
            }else{
                p = p.next;
            }
            
        }
            p.saldo = p.saldo - biaya;
        
        System.out.println("Saldo kamu sekarang Rp"+p.saldo);
    }
    
    public static void pengambilanMatpel(String id){
        int pilihGuru, pilihMatpel, pilihJadwal;
        boolean foundGuru = false;
        boolean foundMatpel = false;
        boolean foundJadwal = false;
        Teacher t = headTeacher;
        Matpel m = t.headMatpel;
        Jadwal s = t.headJadwal;
        int i = 1;
        int j = 1;
        int k = 1;
        
        while (t != null) {
            System.out.println("----------------");
            System.out.println(i+". Nama Pengajar: "+t.nameTeacher);
            System.out.println("----------------");
            m = t.headMatpel;
            j = 1;
            while (m != null) {
                System.out.println("    "+j+". Nama Mata Pelajaran: "+m.namaMatpel);
                System.out.println("        --Jadwal--");
                k = 1;
                s = t.headJadwal;
                while (s != null) {
                    if(m.idMatpel == null ? s.idMatpel == null : m.idMatpel.equals(s.idMatpel)){
                        System.out.println("        "+k+". "+s.jamMulai+" - "+s.jamSelesai+"("+s.hari+","+s.tanggal+")");
                        s = s.next;
                        k++;
                    }else{
                        s = s.next;
                    }
                }
                m = m.next;
                j++;
            }
            t = t.next;
            i++;
        }
        
        System.out.print("Masukkan angka untuk memilih guru: ");
        pilihGuru = scan.nextInt();
        System.out.print("Masukkan angka untuk memilih Matpel: ");
        pilihMatpel = scan.nextInt();
        System.out.print("Masukkan angka untuk memilih Jadwal: ");
        pilihJadwal = scan.nextInt();
        
        t = headTeacher;
        m = t.headMatpel;
        s = t.headJadwal;
        i = 1;
        j = 1;
        k = 1;
        while (t != null && !foundGuru) {
            if(i == pilihGuru){
                m = t.headMatpel;
                while (m != null && !foundMatpel) {
                    if(j == pilihMatpel){
                        s = t.headJadwal;
                        while (s != null && !foundJadwal) {
                            if(s.idMatpel == null ? m.idMatpel == null : s.idMatpel.equals(m.idMatpel)){
                                if(k == pilihJadwal){
                                    foundJadwal = true;
                                }else{
                                    k++;
                                    s = s.next;
                                }
                            }else{
                                s = s.next;
                            }
                        }
                        foundMatpel = true;
                    }else{
                        j++;
                        m = m.next;
                    }
                }
                foundGuru = true;
            }else{
                i++;
                t = t.next;
            }
        }
        PengambilanMatpel pm = new PengambilanMatpel();
        pm.idMatpel = m.idMatpel;
        pm.idStudent = id;
        pm.idTeacher = t.idTeacher;
        pm.jadwal = s.idJadwal;
        pm.next = null;
        tailAmbil.next = pm;
        tailAmbil = pm;
        
    }
    
    public static void penguranganMatpel(String id){
        PengambilanMatpel pm = headAmbil;
        boolean foundAmbil = false;
        int i = 0, choice;
        
        while (pm != null) {
            if(pm.idStudent == null ? id == null : pm.idStudent.equals(id)){
                System.out.println((i+1)+". "+pm.idMatpel);
                pm = pm.next;
                i++;
            }else{
                pm = pm.next;
            }
        }
        
        if(i==0){
            System.out.println("Belum ada mata pelajaran yang diambil!!");
            System.out.println("---------------------------------------");
        }else{
            System.out.print("Masukkan urutan matpel yang mau di hapus");
            choice = scan.nextInt();

            pm = headAmbil;
            PengambilanMatpel temp = new PengambilanMatpel();
            i = 1;
            while (pm != null && !foundAmbil) {
                if(pm.idStudent == null ? id == null : pm.idStudent.equals(id)){
                    if(choice == i){
                        foundAmbil = true;
                    }else{
                        i++;
                        temp = pm;
                        pm = pm.next;
                    }
                }else{
                    temp = pm;
                    pm = pm.next;
                }
            }
            if(pm == headAmbil && pm == tailAmbil){
                headAmbil = null;
                tailAmbil = null;
            }else if(pm == headAmbil){
                pm.next = headAmbil;
            }else if(pm == tailAmbil){
                tailAmbil = temp;
                tailAmbil.next = null;
            }else{
                temp.next = pm.next;
            }
            System.out.println(pm.idMatpel+" telah dihapus dari jadwal pembelajaran");
            pm = null;
        }
        
    }
    
    public static void perubahanMataPelajaran(String idStudent){
        int choice = 0;
        while (choice != 3) {
            System.out.println("1.Nambah Mata pelajaran");
            System.out.println("2.Ngurangin Mata Pelajaran");
            System.out.println("3.Exit");
            System.out.print("--->");
            choice = scan.nextInt();
            switch (choice) {
                case 1:
                    pengambilanMatpel(idStudent);
                    break;
                case 2:
                    penguranganMatpel(idStudent);
                    break;
            }
        }
    }
    
    public static void retrieveJadwal(){
            Teacher p = headTeacher;
            Jadwal j = p.headJadwal;
            Matpel m = p.headMatpel;
            int i = 1;

            System.out.println("--Jadwal--");
            while (p != null ) {
                System.out.println(i+". "+p.nameTeacher);
                m = p.headMatpel;
                while (m != null) {
                        System.out.println("Matkul : "+m.namaMatpel);
                        j = p.headJadwal;
                        while (j != null) {
                            if(m.idMatpel == null ? j.idMatpel == null : m.idMatpel.equals(j.idMatpel)){
                                System.out.println("    "+j.hari+", "+j.tanggal);
                                System.out.println("    Waktu: "+j.jamMulai+" - "+j.jamSelesai);
                                System.out.println("----------------------");
                                j = j.next;
                            }else{
                                j = j.next;
                            }
                        }
                        m = m.next;
                    }
                p = p.next;
                i++;
                }
    }
    
    public static void register(int i, String username, String password){
        String noTelp,email,topup;
        int topupSaldo;
        Student stdnt = tailStudent;
        Student s = new Student();
        
        System.out.print("Masukkan email: ");
        email = scan.next();
        System.out.print("Masukkan no telepon: ");
        noTelp = scan.next();
        System.out.print("Mau topup saldo sekarang?(y/n) ");
        topup = scan.next();
        if("n".equals(topup)){
            s.idStudent = username+i;
            s.username = username;
            s.password = password;
            s.noTelepon = noTelp;
            s.email = email;
            s.saldo = 0;
            s.next = null;
            tailStudent.next = s;
            tailStudent = s;
            System.out.println("---Data Murid Baru---");
            System.out.println(s.username+" - "+s.noTelepon+" - "+s.email+" - mendapat id: "+s.idStudent);
            
        }else if("y".equals(topup)){
            System.out.print("Mau topup berapa? ");
            topupSaldo = scan.nextInt();
            s.idStudent = username+i;
            s.username = username;
            s.password = password;
            s.noTelepon = noTelp;
            s.email = email;
            s.next = null;
            tailStudent.next = s;
            tailStudent = s;
            System.out.println("---Data Murid Baru---");
            System.out.println(s.username+" - "+s.noTelepon+" - "+s.email+" - mendapat id: "+s.idStudent);
            s.saldo = topupSaldo;
        }
        
    }
    
    public static void jadwalMengajar(String id){
        Teacher p = headTeacher;
            Jadwal j = p.headJadwal;
            Matpel m = p.headMatpel;

            System.out.println("--Jadwal--");
            while (p != null ) {
                if(p.idTeacher == null ? id == null : p.idTeacher.equals(id)){
                    m = p.headMatpel;
                    while (m != null) {
                            System.out.println("Matkul : "+m.namaMatpel);
                            j = p.headJadwal;
                            while (j != null) {
                                if(m.idMatpel == null ? j.idMatpel == null : m.idMatpel.equals(j.idMatpel)){
                                    System.out.println("    "+j.hari+", "+j.tanggal);
                                    System.out.println("    Waktu: "+j.jamMulai+" - "+j.jamSelesai);
                                    System.out.println("----------------------");
                                    j = j.next;
                                }else{
                                    j = j.next;
                                }
                            }
                            m = m.next;
                        }
                    p = p.next;
                }else{
                    p = p.next;
                }
            }
        
        
    }
    
    public static void printDataStudent(String idStudent){
        Student p = headStudent;
        boolean found = false;
        
        while (p != null && !found) {
            if(p.idStudent == null ? idStudent == null : p.idStudent.equals(idStudent)){
                found = true;
            }else{
                p = p.next;
            }
        }
        
        System.out.println(p.username+"     "+p.noTelepon+"     "+p.email);
    }
    
    public static void retrieveMuridYangDiajar(String id){
        PengambilanMatpel pm = headAmbil;
        String nama="";
        int i = 1;
        
        System.out.println("---Daftar Murid yang di ajar "+getNameTeacher(id)+"---");
        System.out.println("No  Nama        NoTelepon   Email");
        while (pm != null) {
            if(pm.idTeacher == null ? id == null : pm.idTeacher.equals(id)){
                if(getNameStudent(pm.idStudent) == null ? nama == null : getNameStudent(pm.idStudent).equals(nama)){
                    pm = pm.next;
                }else{
                    nama = getNameStudent(pm.idStudent);
                    System.out.print(i+". ");
                    printDataStudent(pm.idStudent);
                    pm = pm.next;
                    i++;
                }
            }else{
                pm = pm.next;
            }
        }
        System.out.println("--------------");
    }
    
    public static void perubahanJadwal(String id){
        Teacher t = headTeacher;
        Jadwal j = t.headJadwal;
        Matpel m = t.headMatpel;
        int i = 1;
        int f = 1;
        int k = 1;
        int choiceMatpel, choiceJadwal; 
        String tanggal, jamMulai, jamSelesai, hari;
        boolean foundMatpel= false, foundJadwal = false;
        
        while (t != null ) {
            if(t.idTeacher == null ? id == null : t.idTeacher.equals(id)){
                m = t.headMatpel;
                while (m != null) {
                    System.out.println(i+". "+m.namaMatpel);
                    j = t.headJadwal;
                    f = 1;
                    while (j != null) {
                        if(m.idMatpel == null ? j.idMatpel == null : m.idMatpel.equals(j.idMatpel)){
                            System.out.println("    "+f+". Tanggal: "+j.hari+", "+j.tanggal);
                            System.out.println("         Waktu: "+j.jamMulai+" - "+j.jamSelesai);
                            j = j.next;
                            f++;
                        }else{
                            j = j.next;
                        }
                    }
                    m = m.next;
                    i++;
                }
                t = t.next;
            }else{
                t = t.next;
            }
        }
        
        System.out.print("Matpel keberapa yang akan diubah: ");
        choiceMatpel = scan.nextInt();
        System.out.print("Jadwal yang mana? ");
        choiceJadwal = scan.nextInt();
        
        
        t = headTeacher;
        m = t.headMatpel;
        j = t.headJadwal;
        i = 1;
        f = 1;
        while (t != null ) {
            if(t.idTeacher == null ? id == null : t.idTeacher.equals(id)){
                    m = t.headMatpel;
                    while (m != null && !foundMatpel) {
                        if(choiceMatpel == i){
                            j = t.headJadwal;
                            f = 1;
                            while (j != null && !foundJadwal) {
                                if(m.idMatpel == null ? j.idMatpel == null : m.idMatpel.equals(j.idMatpel)){
                                    if(choiceJadwal == f){
                                        foundJadwal = true;
                                    }else{
                                        j = j.next;
                                        f++;
                                    }
                                }else{
                                    j = j.next;
                                }
                            }
                            foundMatpel = true;
                        }else{
                            m = m.next;
                            i++;
                        }
                    }
                t = t.next;
            }else{
                t = t.next;
            }
        }
        
        System.out.print("Masukkan tanggal yang baru: ");
        tanggal = scan.next();
        System.out.print("Masukkan hari: ");
        hari = scan.next();
        System.out.print("Masukkan Jam Mulai: ");
        jamMulai = scan.next();
        System.out.print("Masukkan Jam Selesai: ");
        jamSelesai = scan.next();
        
        j.hari = hari;
        j.jamMulai = jamMulai;
        j.jamSelesai = jamSelesai;
        j.tanggal = tanggal;
        
        System.out.println("--Jadwal telah berhasil diganti!--");
    }
    
    public static void penggajianTeacher(int gaji){
        int tanggal, bulan, tahun, totalGaji = 0, choiceTeacher, i;
        boolean foundTeacher = false;
        int murid = 0;
        
        retrieveTeacher();
        
        System.out.print("Urutan keberapa yang akan di gaji? ");
        choiceTeacher = scan.nextInt();
        
        i=1;
        Teacher t = headTeacher;
        while (t != null && !foundTeacher) {
            if(choiceTeacher == i){
                foundTeacher = true;
            }else{
                t = t.next;
                i++;
            }
        }
        PengambilanMatpel pm = headAmbil;
        
        while (pm != null) {
            if(pm.idTeacher == null ? t.idTeacher == null : pm.idTeacher.equals(t.idTeacher)){
                murid++;
                pm = pm.next;
            }else{
                pm = pm.next;
            }
        }
        
        System.out.print("Penggajian bulan berapa? ");
        bulan = scan.nextInt();
        System.out.print("Tahun? ");
        tahun = scan.nextInt();
        
        if(tahun<2020){
            System.out.println("Sekarang sudah tahun 2020");
        }else if(cekPenggajian(t.idTeacher, bulan, tahun)){
            System.out.println("Sudah digaji!!");
        }else if(cekTahunTertinggiTeacher(t.idTeacher)>tahun){
            System.out.println("sudah digaji");
        }else if(cekBulanTertinggiTeacher(t.idTeacher)>bulan){
            System.out.println("Sudah digaji");
        }else{
            System.out.print("Tanggal berapa? ");
            tanggal = scan.nextInt();
            if(tahun>2020){
                    totalGaji = gaji*murid*(12-cekBulanTertinggiTeacher(t.idTeacher)+bulan);
                    Penggajian p = new Penggajian();
                    p.idTeacher = t.idTeacher;
                    p.gaji = totalGaji;
                    p.tanggal = tanggal;
                    p.bulan = bulan;
                    p.tahun = tahun;
                    p.next = null;

                    tailGaji.next = p;
                    tailGaji = p;
                }else{
                    totalGaji = gaji*murid*(bulan - cekBulanTertinggiTeacher(t.idTeacher));
                    Penggajian p = new Penggajian();
                    p.idTeacher = t.idTeacher;
                    p.gaji = totalGaji;
                    p.tanggal = tanggal;
                    p.bulan = bulan;
                    p.tahun = tahun;
                    p.next = null;

                    tailGaji.next = p;
                    tailGaji = p;
                }
                    System.out.println("------------------------------------------");
                    System.out.println("Gaji perBulan "+gaji);
                    System.out.println(getNameTeacher(tailGaji.idTeacher)+" memiliki murid sebanyak "+murid);
                    System.out.println("    Gaji telah diterima Rp"+tailGaji.gaji+" pada tanggal "+tailGaji.tanggal+" - "+getMonth(tailGaji.bulan)+" - "+tailGaji.tahun);
                    System.out.println("------------------------------------------");
            }
    }
    
    public static int cekBulanTertinggiTeacher(String id){
        Penggajian p = headGaji;
        int bulan = 1;
        while (p != null) {
            if(p.idTeacher == null ? id == null : p.idTeacher.equals(id)){
                if(p.bulan>bulan){
                    bulan = p.bulan;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return bulan;
    }
    
    public static int cekTahunTertinggiTeacher(String id){
        Penggajian p = headGaji;
        int tahun = 0;
        while (p != null) {
            if(p.idTeacher == null ? id == null : p.idTeacher.equals(id)){
                if(tahun<p.tahun){
                    tahun = p.tahun;
                    p = p.next;
                }else{
                    p = p.next;
                }
            }else{
                p = p.next;
            }
        }
        return tahun;
    }
    
    public static boolean cekPenggajian(String id, int bulan, int tahun){
        Penggajian p = headGaji;
        boolean found = false;
        while (p != null && !found) {
            if(p.bulan == bulan && p.tahun==tahun && (p.idTeacher == null ? id == null : p.idTeacher.equals(id))){
                found = true;
            }else{
                p = p.next;
            }
        }
        return found;
    }
    public static void cekGajiSatuTeacher(String idTeacher){
        Penggajian p = headGaji;
        int i = 1;
        System.out.println("Data gaji "+getNameTeacher(idTeacher));
        while (p != null) {
            if(p.idTeacher == null ? idTeacher == null : p.idTeacher.equals(idTeacher)){
                System.out.println(i+". "+getNameTeacher(idTeacher)+" - "+p.tanggal+" - "+getMonth(p.bulan)+" - "+p.tahun+" - Rp"+p.gaji);
                i++;
                p = p.next;
            }else{
                p = p.next;
            }
        }
    }
    
    public static void retrieveSemuaGaji(){
        Penggajian p = headGaji;
        int i = 1;
        System.out.println("Data gaji semua guru");
        while (p != null) {
            System.out.println(i+". "+getNameTeacher(p.idTeacher)+" - "+p.tanggal+" - "+getMonth(p.bulan)+" - "+p.tahun+" - "+p.gaji);
            i++;
            p = p.next;
        }
        
    }
    
}
