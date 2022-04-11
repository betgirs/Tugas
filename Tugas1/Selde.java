/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selde;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Selde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();
        String angka1=String.valueOf(angka);
        selde(angka1);
    }public static void selde(String input){
        int awal = 0;
        int akhir = input.length()-1;
        boolean selde = true;
        while(awal<akhir){
            if (input.charAt(awal)!=input.charAt(akhir)){
                selde = false;
                break;
            }awal++;
             akhir--;
        }if (selde)
             System.out.println(input + " adalah selde.");
           else
              System.out.println(input+ " bukan selde.");
    }
}
    

