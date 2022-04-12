/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diskon;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
class Bajuu {
    String jenis;
    double harga;
    double jumlah;
    public Bajuu(String a,double b){
        this.jenis = a;
        this.jumlah = b;
        
    }
    static final double bajua = 100000;
    static final double bajub = 125000;
    static final double bajuc = 175000;
    
    double hargaa(){
        if (jumlah>100)
          return harga = bajua-5000;
       else
          return  harga = bajua;
      
    }double hargab(){
         if (jumlah>100)
           return  harga = bajub-5000;
         else 
          return harga = bajub;
         
    }double hargac(){
        if (jumlah>100)
          return  harga = bajuc-15000;
        else 
           return harga = bajuc;
    }
    void display(){
      
        if (jenis.equalsIgnoreCase("a")||jenis.equalsIgnoreCase("A"))
            hargaa();
        else if (jenis.equalsIgnoreCase("b")||jenis.equalsIgnoreCase("B"))
           hargab();
        else if (jenis.equalsIgnoreCase("c")||jenis.equalsIgnoreCase("B"))
          hargac();
        
        System.out.println("Jenis yang anda beli : "+jenis);
        System.out.println("Harga per buah       : "+(int)harga);
        System.out.println("Total harga          : "+(int)(harga*jumlah));
    }
}public class Baju {
    
    public static void main(String[] args) {
     
        Scanner in = new Scanner(System.in);
           
        System.out.println("Baju yang tersedia : ");
        System.out.println("Baju A dengan harga : 100000");
        System.out.println("Baju B dengan harga : 125000");
        System.out.println("Baju C dengan harga : 175000");
        
        
        System.out.print("Baju yang akan anda beli bertipe : ");
        String c = in.nextLine();
        System.out.print("Jumlah Baju yang akan anda beli adalah : ");
        double d = in.nextDouble();
        
        Bajuu Baju1 =new Bajuu(c,d);
        Baju1.display();
        
    }
}
