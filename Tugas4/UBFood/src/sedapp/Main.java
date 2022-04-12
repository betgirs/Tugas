/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sedapp;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Main {
       public static void main(String[] args){
        
        System.out.println("Nama : Elisabet Dahlia Girsang");
        System.out.println("NIM : 215150700111026");
    
        Scanner in = new Scanner(System.in);
        int pilih=0;
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso",8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes","Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi",10000));
        DataMerchant.tampilData();
        System.out.println();
      
        do{
            System.out.println("    " + "===Daftar Menu Pilihan===");
            System.out.println("    " +" 1.Tambah Merchant");
            System.out.println("    " +" 2.Tampil Data");
            System.out.println("    " +" 3.Cari Merchant");
            System.out.println("    " +" 4.Update Merchant");
            System.out.println("    " +" 5. Selesai ");
            System.out.println("    " + "=========================" +"\n"); 
            System.out.print("Pilih no. berapa : ");
            pilih=in.nextInt(); in.nextLine();
            System.out.println();
                  switch(pilih){
                      case 1:
                          System.out.print("Nama Merchant baru : ");
                          String namaMerchant = in.nextLine();
                          System.out.print("Nama Produk baru : ");
                          String namaProduk = in.nextLine();
                          System.out.print("harga baru : ");
                          Double HargaMakanan = in.nextDouble();in.nextLine();
                          DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(namaMerchant, namaProduk, HargaMakanan));  
                          break;
                      case 2:
                           DataMerchant.tampilData();
                          break;
                      case 3:
                           System.out.print("Masukkan Nama Merchant : ");
                           String Nama = in.nextLine();
                           DataMerchant.tampilMerchant(DataMerchant.cariMerchant(Nama));
                           break;
                      case 4:
                           System.out.print("Masukkan Nama Merchant : ");
                           String Nama2 = in.nextLine();
                          if(Nama2=="Bakso Pak Sahid"){
                             DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama2));
                          }else if (Nama2=="Nasgor Mblebes"){
                              DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama2));
                          }else if (Nama2=="Ayam Geprek Kak Ros"){
                              DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama2));
                          }else {
                              DataMerchant.updateMerchant(DataMerchant.cariMerchant(Nama2));
                          }break;
                      case 5:
                           System.out.println("Terima kasih atas kunjungannya.... ");   
                           break;
                          
                     }
                          
        }while(pilih!=5);
    }
}

    

