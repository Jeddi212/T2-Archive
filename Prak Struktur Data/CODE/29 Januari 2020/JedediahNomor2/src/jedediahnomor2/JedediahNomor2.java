package jedediahnomor2;

import java.util.Scanner;

public class JedediahNomor2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String a = "";
        String b = "";
        String temp = "";
        
        System.out.println("Masukkan input A : ");
        a = input.nextLine();
        
        System.out.println("Masukkan input B : ");
        b = input.nextLine();
        
        System.out.println("Nilai variable pertama : " + a);
        System.out.println("Nilai variable kedua : " + b);
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Nilai variable pertama sekarang : " + a);
        System.out.println("Nilai variable kedua sekarang : " + b);
    }
    
}
