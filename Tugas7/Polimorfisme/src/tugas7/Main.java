/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Personal
 */
public class Main {
     
     public static void main(String[] args) {
        
         System.out.println(" --------------------------------");
         System.out.println("| NAMA : ELISABET DAHLIA GIRSANG |");
         System.out.println("| NIM  : 215150700111026         |");
         System.out.println(" --------------------------------");
         System.out.println("");
         
         
         Tampil(new PegawaiTetap("Bayu", "350728490327424892342",2000000));
         Tampil(new PegawaiHarian("Edo", "350728490327424892343", 8500, 40));
         Tampil(new Sales("Tika", "350728490327424892344", 50, 50000));
         
         
         System.out.println("=============   OBJEK KE-1  =================\n");  
         Tampil(new PegawaiTetap("Yanto", "64341777822114283932",2500000));
         Tampil(new PegawaiHarian("Edi Gaga", "5364167380534726402",8500,45));
         Tampil(new Sales("Caca","674323654300111223344",45,30000));
         
         System.out.println("==============  OBJEK KE-2  =================\n");
         Tampil(new PegawaiTetap("Budi", "123215226371984653722",2000000));
         Tampil(new PegawaiHarian("Surya Ramadhan", "7682092865142534", 10000,35));
         Tampil(new Sales("Raisa","321423543627111100990",100,45000)); 
         
         System.out.println("==============  OBJEK KE-3  =================\n");
         Tampil(new PegawaiTetap ("Yanti", "43525167384926254163",2500000));
         Tampil(new PegawaiHarian("Marijan", "122131445522104750",10000,45));
         Tampil(new Sales("Rosaliny","22314400847200176463",45,40000));
      
    }
      static void Tampil(Pegawai pegawai){
         
          System.out.println(pegawai.toString());
          System.out.println("Pendapatan      : " +"Rp "+(int)pegawai.gaji());
          System.out.println("");
          
          /// ======  BISA JUGA PAKE INSTANCE OF ======
          // ======   KEK YANG BAWAH ======
        
           if (pegawai instanceof PegawaiTetap){
               System.out.println("Pegawai tetap yaa");
           }
           else if (pegawai instanceof PegawaiHarian){
               System.out.println("INI PEGAWAI HARIAN");
           }else{
               System.out.println("SALES");
           }
      }
}
