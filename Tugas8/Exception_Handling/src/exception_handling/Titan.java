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
public class Titan extends Character{
  
    public  Titan() {
         super.setHP(200); 
         super.setAttack(45); 
         super.setDefense(0); 
       
    }
    
@Override
public boolean attack(){
    int acak = new java.util.Random().nextInt(100)+1;
  //   System.out.println("magic menyerang " +acak);
    if (acak <= 40) {
          return true;
    } else {
          return false;
     }
    
}

    @Override
    public void info() {
        System.out.println("-----------STATUS-----------");
        System.out.println("Role\t: Titan");
        super.info();
    }
}
