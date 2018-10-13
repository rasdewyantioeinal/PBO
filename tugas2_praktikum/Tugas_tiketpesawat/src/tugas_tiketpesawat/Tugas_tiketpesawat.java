/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_tiketpesawat;
import java.util.Scanner;
/**
 *
 * @author Rasdewyanti
 */
public class Tugas_tiketpesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,alamat,tipe;
        int bayar,kembalian;
        int harga = 0;
        
               
        System.out.println("Program Pendataan Tiket Pesawat");
        System.out.println();
        System.out.print("Nama: ");
        nama = input.next();
        System.out.print("Alamat: ");
        alamat = input.next();       
        System.out.print("Tipe Pesawat: ");
        tipe = input.next();
        
        tipe = tipe.toUpperCase();
        
        if (tipe.equals("A")) {
            harga = 5000000;
        } 
        if (tipe.equals("B")) {
            harga = 2000000;
        } 
        if (tipe.equals("C")) {
            harga = 1000000;
        }
        
        System.out.println("Harga Tiket Pesawat : " + harga);
        System.out.println();
        System.out.print("Bayar : ");
        bayar = input.nextInt();
        
        do
        if (bayar<harga) {
            System.out.println("Uang anda tidak mencukupi...!!!");
            System.out.print("Bayar : ");
            bayar = input.nextInt();            
        }
        while (bayar<harga);
        
        if (bayar>=harga) {
            kembalian = bayar-harga;
        System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Kembalian : " +kembalian); 
        }
        
        // TODO code application logic here
    }
    
}
