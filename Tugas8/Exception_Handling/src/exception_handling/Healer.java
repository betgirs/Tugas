/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author Personal
 */
public class Healer extends Character{

    public Healer() {
         super.setHP(70); 
         super.setAttack(10); 
         super.setDefense(10); 
    }
    

public void heal(){
    System.out.println("Menggunakan skill Heal.");
    super.setHP(getHP()+25);
}    
     
@Override
public boolean attack(){
    int acak = new java.util.Random().nextInt(100)+1;
    if (acak <= 85) {
          return true;
    } else {
     return false;
     }
 }

    @Override
    public void info() {
        System.out.println("-----------STATUS-----------");
        System.out.println("Role\t: Healer");
        super.info(); 
       
 
    }

}
