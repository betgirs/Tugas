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
public class Magician extends Character{

    public Magician(){
         super.setHP(100); 
         super.setAttack(60); 
         super.setDefense(10); 
    }
    
  
    
@Override
public boolean attack(){
    int acak = new java.util.Random().nextInt(100)+1;
    if (acak <= 35) {
          return true;
    } else {
     return false;
     }
 }

    @Override
    public void info() {
        System.out.println("-----------STATUS-----------");
        System.out.println("Role\t: Magician");
        super.info(); 
    }


   
    
}
