/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Personal
 */
public class Main {
    public static void main(String[] args) {
        
        
        System.out.println("NAMA : ELISABET DAHLIA GIRSANG");
        System.out.println("NIM : 215150700111026");
        System.out.println("===================================");
        System.out.println();
        
        Scanner in = new Scanner(System.in);
        System.out.println("Selamat datang di game Defend FILKOM !");      
        System.out.print("Silahkan masukkan nama player : ");
        String nama = in.nextLine();
       
        int pilih=0;
        boolean cek=false;
        while(!cek){     
         
           try{
           System.out.println("Silahkan pilih karakter yang anda inginkan : ");
           System.out.println("1. Magician");
           System.out.println("2. Healer");
           System.out.println("3. Warrior");  
                  pilih=in.nextInt();
                  cek=true;
           }catch(InputMismatchException e){
               in.nextLine();
              System.out.println("Tolong masukkan angka !");
            }
          
       }
       
        Titan musuh = new Titan();
        Character player= null;
        System.out.print("Selamat datang, " + nama +" !"+"\n");
       switch(pilih){
           case 1:
               player = new Magician();
               player.info();
             break;
           case 2:
               player = new Healer();
               player.info();
               break;
               case 3 :
                   player = new Warrior();
                   player.info();
                   break;
               default:
       }
  
            int i=0;
        while (i<=100) {       
                i++;
 
            System.out.println("========== TURN " +i +" ==========");
            if (i % 2 == 0 && player instanceof Healer) {
                  ((Healer)player).heal();
            } 
            System.out.println("Enemy's HP\t: " +musuh.getHP());
            System.out.println(nama+"'s HP\t: " + player.getHP());
            
             if (musuh.attack() == true) {
                   player.receiveDamage(musuh.getAttack());
             } else if (player.attack()==true){
                   musuh.receiveDamage(player.getAttack());
             }
   
 
            if (musuh.getHP() <= 0) {
                musuh.setHP(0);
                    System.out.println("========== TURN " +(i+1)+" ========== ");
                    System.out.println("Enemy's HP\t: " +musuh.getHP());
                    System.out.println(nama+"'s HP\t: " + player.getHP());
                    System.out.println("=============================");
                    System.out.println(nama +" menang"+"\n\n");
                     break;
                 }
            else if ( player.getHP() <=0) {
                 player.setHP(0);
                 System.out.println("========== TURN " +(i+1)+" ========== ");
                 System.out.println("Enemy's HP\t: " +musuh.getHP());
                 System.out.println(nama+"'s HP\t: " + player.getHP());
                 System.out.println("=============================");  
                 System.out.println("Titan menang" +"\n\n");
                 break;
                }
        }   
             System.out.println("========== PLAYER ==========");
             player.info();
             System.out.println("========== MUSUH ==========");
             musuh.info();
 

        
    
        
    }
}
