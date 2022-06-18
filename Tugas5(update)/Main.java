/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalMobil;
import java.util.Scanner;
/**
 *
 * @author Personal
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println(" --------------------------------");
        System.out.println("| NAMA : ELISABET DAHLIA GIRSANG |");
        System.out.println("| NIM : 215150700111026          |");
        System.out.println(" --------------------------------"+"\n");
  
    System.out.println("Tambahkan data peminjam baru");
    System.out.print("Masukkan Nama : ");
    String Nama =in.nextLine();
    System.out.print("Masukkan no.Telp : ");
    String no_Telp = in.nextLine();
    System.out.print("Masukkan umur : ");
    int umur = in.nextInt();in.nextLine();
    
    CarRider ming = new CarRider("Lin Ming", "08000000000", 19);
    CarRider youhan = new CarRider("Sei Youhan", "081111111111", 20);
    CarRider ling = new CarRider("Ling'er", "081222222222", 31);
    CarRider Budi = new CarRider(Nama,no_Telp,umur);
            
     
    System.out.println("Tambahkan data mobil baru");
    System.out.print("Masukkan tipe mobil : ");
    String a =in.nextLine();
    System.out.print("Masukkan No. Polisi : ");
    String b = in.nextLine();
    System.out.print("Masukkan Merk Mobil : ");
    String c = in.nextLine();
    
    CarData data = new CarData();
    data.addCar("SUV", "N 1111 AB", "Honda");
    data.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
    data.addCar("TRUCK", "N 3333 AB", "Suzuki");
    data.addCar(a.toUpperCase(),b.toUpperCase(),c);
    
    data.listOfCar();
     
    
    RentArchive arsip = new RentArchive();
    arsip.Rent(ming, data.getCarList().get(1),9);
    arsip.Rent(youhan, data.getCarList().get(0), 3);
    arsip.Rent(ling, data.getCarList().get(1), 1);
    arsip.Rent(Budi, data.getCarList().get(3), 5);
    System.out.println("");
    arsip.info();
}
    
}
    

