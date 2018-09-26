/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1_1;

import java.util.Scanner;

/**
 *
 * @author Rasdewyanti
 */
public class Tugas1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        double Celcius, Farenheit;
            System.out.println("Aplikasi Konversi Suhu Celcius > Farenheit dan Farenheit > Celcius");
            System.out.println();
            System.out.println();
            System.out.println("Konversi Suhu Celcius > Farenheit");
            System.out.println();
            System.out.print("Masukkan suhu (C) : ");
        Celcius = masukan.nextInt();
            System.out.println();
            System.out.println(Celcius + " Celcius = " + ((Celcius*9/5)+32) + " Farenheit");
            System.out.println();
            System.out.println();
            System.out.println("Konversi Suhu Farenheit > Celcius");
            System.out.println();
            System.out.print("Masukkan suhu (F) : ");
        Farenheit = masukan.nextInt();
            System.out.println();
            System.out.println(Farenheit + " Farenheit = " + ((Farenheit-32)*5/9) + " Celcius");
        // TODO code application logic here
    }
    
}
