/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1prak;
import java.util.Scanner;
/**
 *
 * @author Rasdewyanti
 */
public class Quiz1prak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama,alamat,jeniskelamin,jabatan,status;
        int gaber;
        int asuransi = 0;
        int gapok = 0;
        
        
        System.out.print("Nama: ");
        nama=input.next();
        System.out.print("Alamat: ");
        alamat=input.next();
        System.out.print("Jenis Kelamin: ");
        jeniskelamin=input.next();
        System.out.print("Jabatan: ");
        jabatan=input.next();
        System.out.print("Status: ");
        status=input.next();        
        
        if ((jeniskelamin.equals("l")) && (jabatan.equals("m"))) {
                gapok = 5000000;                
        } 
        if ((jeniskelamin.equals("l")) && (jabatan.equals("t"))) {
                gapok = 3000000;
        }
        if ((jeniskelamin.equals("p")) && (jabatan.equals("m"))) {
                gapok = 6000000;
        }
        if ((jeniskelamin.equals("p")) && (jabatan.equals("t"))) {
                gapok = 4000000;
        }
        
        
        if (status.equals("bpjs")) {
            asuransi = 80000;
        }
        if (status.equals("umum")) {
            asuransi = 100000;
        }
         
            System.out.println("Gaji Pokok: " + gapok);
            System.out.println();
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat);
            gaber = gapok-asuransi;
            System.out.println("Gaji Bersih: " + gaber);
        }
        // TODO code application logic here
    }
    

