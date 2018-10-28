/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaranpln;
import java.util.Scanner;

public class PembayaranPLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, alamat, blok;
        int tipe, kembalian = 0,bayar = 0,harga = 0;
               
        System.out.print("Nama: ");
        nama=input.nextLine();
        System.out.print("Alamat: ");
        alamat=input.nextLine();
        
        System.out.print("Tipe Rumah: ");
        tipe=input.nextInt();
        
        do 
            if ((tipe!=36) && (tipe!=37)) {
                System.out.println("Tipe tidak tersedia...!!!");
                System.out.print("Tipe Rumah: ");
                tipe=input.nextInt();          
            }
        while ((tipe!=36) && (tipe!=37));
        
        System.out.print("Blok: ");
        blok=input.next();
               
        blok=blok.toUpperCase();
        
        do
            if ((!blok.equals("A")) && (!blok.equals("B"))) {
                System.out.println("Blok tidak tersedia...!!!");
                System.out.print("Blok: ");
                blok=input.next();
                
                blok=blok.toUpperCase();
            }
        while ((!blok.equals("A")) && (!blok.equals("B")));               
        
        output a;
        a = new output(nama, alamat, tipe, blok, harga, bayar, kembalian);
        
//        a.harga();
        
        a.keluar();
    }
}
