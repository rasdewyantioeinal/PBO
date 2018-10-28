/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaranpln;

import java.util.Scanner;

/**
 *
 * @author Rasdewyanti
 */
public class output extends Harga{
    Scanner input = new Scanner(System.in); 
    protected String nama;
    protected String alamat;
    protected int bayar;
    protected int kembalian;   
    
    public output(String nama, String alamat, int tipe, String blok, int bayar, int kembalian,int harga) {  
        super(tipe,blok);
        this.nama=nama;
        this.alamat=alamat;
        this.harga=harga;
        this.bayar=bayar;
    }
    
    public int getharga() {
    if ((this.tipe==36) && (this.blok.equals("A"))) {
        this.harga = 500000;
        }
        if ((this.tipe==36) && (this.blok.equals("B"))) {
        this.harga = 300000;
        }
        if ((this.tipe==37) && (this.blok.equals("A"))) {
        this.harga = 800000;
        }
        if ((this.tipe==37) && (this.blok.equals("B"))) {
        this.harga = 600000;
        }
        
        return this.harga;
    }
    
    
    public void keluar() {
        System.out.println("Harga Bayar: " + getharga());
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
        
        kembalian = bayar-getharga();     
        System.out.println();
        System.out.println();
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Harga Bayar: " + harga);
        System.out.println("Bayar: " + bayar);
        System.out.println("Kembalian: " + kembalian);
    }
}
