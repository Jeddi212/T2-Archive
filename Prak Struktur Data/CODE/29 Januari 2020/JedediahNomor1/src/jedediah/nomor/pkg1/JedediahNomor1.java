package jedediah.nomor.pkg1;

import java.util.Scanner;

public class JedediahNomor1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang;
        int lebar;
        
        System.out.println("Masukkan panjang : ");
        
        panjang = input.nextInt();
        
        System.out.println("Masukkan Lebar : ");
        
        lebar = input.nextInt();
        
        System.out.println("Luas : " + (panjang * lebar));
        System.out.println("Keliling : " + 2*(panjang + lebar));
        
    }
    
}
