/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentalMobil;
import java.util.ArrayList;
/**
 *
 * @author Personal
 */
public class RentArchive {
    private ArrayList <CarRent> rentData= new ArrayList <CarRent>();;

    public void Rent(CarRider rider, Car car, int rentDur){
     
        CarRent yuk = new CarRent(rider, car, rentDur);
        
       if(car.isStatus()==true){
           rentData.add(yuk);
           System.out.println("MOBIL BERHASIL DISEWA");
           car.setStatus(Boolean.toString(false));
       }else{
           System.out.println("MAAF, MOBIL SUDAH DISEWA");
       }
    }   
    public void info(){
        System.out.println("-----------------------");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("-----------------------");
        int i=0;
        while(i<rentData.size()){
            System.out.println("NAMA PEMINJAM : "+rentData.get(i).getRider().getName());
            System.out.println("TIPE MOBIL : "+rentData.get(i).getCar().getcarType());
            System.out.println("NO. POLISI : "+rentData.get(i).getCar().getPolNum());
            System.out.println("LAMA RENTAL : "+rentData.get(i).getRentDur());   
            System.out.println("-----------------------");
            i++;
        }
    }
}
