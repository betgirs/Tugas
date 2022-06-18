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
public class Warrior extends Character{

    public Warrior() {
         super.setHP(80); 
         super.setAttack(25); 
         super.setDefense(30); 
    }
    
    
@Override
public boolean attack(){
    int acak = new java.util.Random().nextInt(100)+1;
    if (acak <= 60) {
          return true;
    } else {
     return false;
     }
 }

    @Override
    public void info() {
        System.out.println("-----------STATUS-----------");
        System.out.println("Role\t: Warrior");
        super.info(); 
       
 
    }
}
