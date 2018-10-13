/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package macmin;
import java.util.Scanner;

/**
 *
 * @author Rasdewyanti
 */
public class MacMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nil1,nil2,nil3,nil4,nil5;
        System.out.print("masukkan nilai pertama = ");
        nil1 = input.nextInt();
        int max = nil1;
        int min = nil1;
       
        System.out.print("masukkan nilai kedua = ");
        nil2 = input.nextInt();
        System.out.print("masukkan nilai ketiga = ");
        nil3 = input.nextInt();
        System.out.print("masukkan nilai keempat = ");
        nil4 = input.nextInt();
        System.out.print("masukkan nilai kelima = ");
        nil5 = input.nextInt();
        

        if(nil2 > max){
            max = nil2;
        } else if(nil2 < min){
            min = nil2;
        } 
        if(nil3 < min){
            min = nil3;
        } else if(nil3 > max){
            max = nil3;
        }
        if(nil4 > max){
            max = nil4;
        } else if(nil4 < min){
            min = nil4;
        }
        if(nil5 < min){
            min = nil5;
        } else if(nil5 > max){
            max = nil5;
        }
        System.out.println("Nilai max = " + max + " & Nilai min = " + min);
        // TODO code application logic here
    }
    
}
