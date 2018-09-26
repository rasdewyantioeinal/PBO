/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_2_luaslingkaran;

import java.util.Scanner;

/**
 *
 * @author Rasdewyanti
 */
public class Tugas1_2_LuasLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double JariJari, Luas;
            System.out.println("Aplikasi Penghitung Luas Lingkaran");
            System.out.println();
            System.out.print("Masukkan Jari-Jari Lingkaran: ");
        JariJari = masukan.nextInt();
            System.out.println();
            System.out.println("Luas Lingkaran = " + 3.14*JariJari*JariJari);
        // TODO code application logic here
    }
    
}
