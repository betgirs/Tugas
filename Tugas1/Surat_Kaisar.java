/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package surat_kaisar;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Surat_Kaisar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner in = new Scanner(System.in);
        String teks = in.nextLine();
        int geser = in.nextInt();
        Surat(teks, geser);
    }public static void Surat(String teks1, int geser1){
        int i = 0;
        
        while (i<teks1.length()){
            char j = teks1.charAt(i);
            i++;
            if (j>=65&&j<=90||j>=97&&j<=122){
                j+=geser1;
              if (j>90&&j<=96||j>122){
                    j-=90;
                    j+=64;
              }
            } 
                System.out.print(j);
               
        } 
    
}}         
