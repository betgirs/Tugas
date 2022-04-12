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
public class DataMerchant {
     static Scanner in = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant[] tambah= new Merchant[DataMerchant.merc.length+1];
        int i=0;
        while(i<DataMerchant.merc.length){
            tambah [i]=DataMerchant.merc[i];
            i++;
        }tambah[DataMerchant.merc.length]=merchant;
        System.out.println();
        return tambah;
    }
    public static void tampilData(){
        for(Merchant mch1 : merc){
            System.out.println("===Tampilan Data Merchant UB Food===");
            System.out.println("Nama Merchant : "+mch1.getNamaMerchant());
            System.out.println("Nama Produk : "+mch1.getNamaProduk());
            System.out.println("Harga : "+(int)mch1.getHargaMakanan());
        }System.out.println();
    }
    public static Merchant cariMerchant(String nama){
           for (int i=0;i<DataMerchant.merc.length;i++){
               if(nama.equalsIgnoreCase(DataMerchant.merc[i].getNamaMerchant())){
                   return DataMerchant.merc[i];
               }
           } System.out.println();
        return null;
       
    }public static void tampilMerchant(Merchant merchant){
       System.out.println("Nama Merchant   : "+merchant.getNamaMerchant());
       System.out.println("Nama Produk     : "+merchant.getNamaProduk());
       System.out.println("Harga           : "+(int)merchant.getHargaMakanan());  
       System.out.println(); 
    }
    public static void updateMerchant(Merchant merchant){
    
        System.out.print("Update Nama Merhant  : ");
        merchant.setNamaMerchant(in.nextLine());
        System.out.print("Update Nama Produkk  : ");
        merchant.setNamaProduk(in.nextLine());
        System.out.print("Update Harga Produkk : ");
        merchant.setHargaMakanan(in.nextInt());in.nextLine();
        System.out.println("==update terbaru==");
        System.out.println("Nama Merchant : "+ merchant.getNamaMerchant());
        System.out.println("Nama Produk   : "+ merchant.getNamaProduk());
        System.out.println("Harga         : "+(int) merchant.getHargaMakanan());
        System.out.println();
    }
    
       }
        
    



