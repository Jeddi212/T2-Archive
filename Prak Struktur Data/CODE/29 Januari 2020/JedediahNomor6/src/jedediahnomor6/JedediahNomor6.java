package jedediahnomor6;

import java.util.Scanner;

public class JedediahNomor6 {
    
    static class MAKANAN {
        int ID;
        String KATEGORI;
        String MERK;
        int HARGA;
    }
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int input_1, input_2, input_3, input_4, input_5;
            MAKANAN[] menu = new MAKANAN[5];
            
            //MENU 1
            menu[0] = new MAKANAN();
            menu[0].ID = 1;
            menu[0].KATEGORI = "Air Mineral";
            menu[0].MERK = "AQUA";
            menu[0].HARGA = 3000;
            
            //MENU 2
            menu[1] = new MAKANAN();
            menu[1].ID = 2;
            menu[1].KATEGORI = "Air Mineral";
            menu[1].MERK = "Amidis";
            menu[1].HARGA = 2000;
            
            //MENU 3
            menu[2] = new MAKANAN();
            menu[2].ID = 3;
            menu[2].KATEGORI = "Permen";
            menu[2].MERK = "Kiss";
            menu[2].HARGA = 500;
            
            //MENU 4
            menu[3] = new MAKANAN();
            menu[3].ID = 4;
            menu[3].KATEGORI = "Roti";
            menu[3].MERK = "Sari Roti";
            menu[3].HARGA = 5000;
            
            //MENU 5
            menu[4] = new MAKANAN();
            menu[4].ID = 5;
            menu[4].KATEGORI = "Roti";
            menu[4].MERK = "BreadTalk";
            menu[4].HARGA = 10000;
            
            System.out.println("Menu Hari Ini");
            
            for(int i = 0; i < 5; i++){
                System.out.println(menu[i].ID + ". " + menu[i].KATEGORI + ", " 
                        + menu[i].MERK + ", " + menu[i].HARGA);
            }
            
            System.out.println("Masukkan jumlah barang pertama : ");
            input_1 = input.nextInt();
            
            System.out.println("Masukkan jumlah barang kedua : ");
            input_2 = input.nextInt();
            
            System.out.println("Masukkan jumlah barang ketiga : ");
            input_3 = input.nextInt();
            
            System.out.println("Masukkan jumlah barang keempat : ");
            input_4 = input.nextInt();
            
            System.out.println("Masukkan jumlah barang kelima : ");
            input_5 = input.nextInt();
            
            int hasil;
            hasil = (menu[0].HARGA * input_1 ) + (menu[1].HARGA * input_2) + 
                    (menu[2].HARGA * input_3) + (menu[3].HARGA * input_4) + 
                    (menu[4].HARGA * input_5);
            
            System.out.println("Total Harga : " + hasil);
        }
    
}
