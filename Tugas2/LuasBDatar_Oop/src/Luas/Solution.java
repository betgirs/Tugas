/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luas;
import java.util.Scanner;

 class persegi {
    int sisi;
    int Lp (int sisi){
        return sisi*sisi;
    }
} class segitiga{
    int alas;
    int tinggi;
    
    int seg ( int alas, int tinggi){
        return alas*tinggi/2; 
    }
    
}class lingkaran{
    double radius;
    
    double Llingkaran (double radius){
        if (radius %7 !=0){
            return (int)(radius*radius*3.14);
        }else {
            return  (int)(radius*radius*(22/7));
        }
    }
    
}
public class Solution{
    
     public static void main(String[]args){
 
          Scanner in = new Scanner(System.in);
          
          System.out.print("masukkan input : ");
          double a = in.nextDouble();
          
          persegi b = new persegi();
          segitiga c = new segitiga(); 
          lingkaran d = new lingkaran();
           
            if (a == 1){ 
                System.out.print("masukkan sisi : ");
                b.sisi = in.nextInt();
                System.out.println("Luas persegi : " +b.Lp(b.sisi) );  
            }else if (a==2){
                System.out.print("masukkan alas : ");
                c.alas = in.nextInt();
                System.out.print("masukkan tinggi : ");
                c.tinggi = in.nextInt();
                System.out.println("Luas segitiga : " +c.seg(c.alas,c.tinggi)); 
            }else  if (a==3){
                System.out.print("masukkan radius : ");
                d.radius = in.nextDouble();
                System.out.println("Luas lingkaran : " +(double)d.Llingkaran(d.radius));
            }else{
                System.out.println("Input yang anda masukan tidak sesuai");
            }
    
      }
}
