/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaranpln;
import java.util.Scanner;

class PLN {
    Scanner input = new Scanner(System.in); 
    private String nama;
    private String alamat;
    String blok;
    int bayar, tipe, harga, kembalian;
    
    public void setNama(String nama) {
        this.nama=nama;
    }    
    public String getNama() {
        return nama;
    }
    
    public void setAlamat(String alamat) {
        this.alamat=alamat;
    }
    public String getAlamat() {
        return alamat;
    }
    
    public void tipe() {
        System.out.print("Tipe Rumah: ");
        tipe=input.nextInt();
        
        do 
            if ((tipe!=36) && (tipe!=37)) {
                System.out.println("Tipe tidak tersedia...!!!");
                System.out.print("Tipe Rumah: ");
                tipe=input.nextInt();          
            }
        while ((tipe!=36) && (tipe!=37));
    }
    
    public void blok() {
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
    }
    
    public void harga() {                              
        if ((tipe==36) && (blok.equals("A"))) {
        harga = 500000;
        }
        if ((tipe==36) && (blok.equals("B"))) {
        harga = 300000;
        }
        if ((tipe==37) && (blok.equals("A"))) {
        harga = 800000;
        }
        if ((tipe==37) && (blok.equals("B"))) {
        harga = 600000;
        }
        
        System.out.println("Harga Bayar: " + harga);
    }
    
    public void output() {
               
        System.out.println();
        System.out.print("Bayar: ");
        bayar = input.nextInt();
        
        do
        if (bayar<harga) {
            System.out.println("Uang anda tidak mencukupi...!!!");
            System.out.print("Bayar : ");
            bayar = input.nextInt();            
        }
        while (bayar<harga);
        
        kembalian = bayar-harga;     
        System.out.println();
        System.out.println();
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Harga Bayar: " + harga);
        System.out.println("Bayar: " + bayar);
        System.out.println("Kembalian: " + kembalian);
    }    
}

public class PembayaranPLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        PLN a = new PLN();
        System.out.print("Nama: ");
        a.setNama(input.next());
        System.out.print("Alamat: ");
        a.setAlamat(input.next());
        
        a.tipe();
        
        a.blok();               
        
        a.harga();
        
        a.output();
    }
}
