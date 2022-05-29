package jedediahnomor3;

import java.util.Scanner;

public class JedediahNomor3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int detik;
        int menit;
        int jam;
        int masukan;
        
        System.out.println("Masukkan Jumlah Detik : ");
        masukan = input.nextInt();
        
        jam = masukan / 3600;
        menit = (masukan % 3600) / 60;
        detik = (masukan % 3600) % 60;
        
        System.out.println(jam + " jam " + menit + " menit " + detik + " detik ");
    }
    
}
