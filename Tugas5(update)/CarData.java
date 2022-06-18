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
public class CarData {
    private ArrayList <Car> carList= new ArrayList<Car>();

    public ArrayList<Car> getCarList() {
        return carList;
    }
    public void addCar(String carType, String polNum, String merk){
  
        Car yak = new Car(carType, polNum, merk, true);
        carList.add(yak);
    }
    public void listOfCar(){
      System.out.println("-----------------------");
      System.out.println("DAFTAR MOBIL");
      System.out.println("-----------------------");
      int i = 0;
      do{
          System.out.println("TIPE MOBIL : "+ carList.get(i).getcarType());
          System.out.println("NO. POLISI : "+ carList.get(i).getPolNum());
          System.out.println("MERK MOBIL : "+ carList.get(i).getMerk());
          System.out.println("-----------------------");
          i++;
      }while(i< carList.size());
      
}

}
