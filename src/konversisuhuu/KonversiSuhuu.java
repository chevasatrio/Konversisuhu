/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversisuhuu;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class KonversiSuhuu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
     String[] listSuhu = {"Fahrenheit", "Kelvin", "Reamur", "Semua"};
     System.out.println("*******CELCIUS CONVERTER*******");
     System.out.println("Mau Mengubah ke satuan mana?");
     for (int i = 0; i < listSuhu.length; i++) {
         System.out.println(i+". "+listSuhu[i]);
    }
     System.out.print("Ingin Mengubah ke : ");
     int pilihan = input.nextInt();
     System.out.print("Masukkan Angka Suhu dalam Celcius : ");
     double suhuC = input.nextDouble();
     double suhuF = suhuC * 9/5 + 32;
     double suhuK = suhuC + 273;
     double suhuR = suhuC * 4/5;
     if (pilihan == 0) {
         System.out.println("Suhu sudah dikonversi : "+suhuF+"°F");
    } 
     else if (pilihan == 1) {
         System.out.println("Suhu sudah dikonversi : "+suhuK+"°K");
    } 
     else if (pilihan == 2) {
         System.out.println("Suhu sudah dikonversi : "+suhuR+"°R");
    } 
     else if (pilihan == 3) {
         System.out.println("Suhu sudah dikonversi : "+suhuF+"°F");
         System.out.println("Suhu sudah dikonversi : "+suhuK+"°K");
         System.out.println("Suhu sudah dikonversi : "+suhuR+"°R");
    } 
     else {
         System.out.println("Ulangi!");
         System.out.println("Kode yang anda masukkan salah!");
    }
    }
    
}
