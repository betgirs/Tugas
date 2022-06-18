/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Personal
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("NAMA : ELISABET DAHLIA GIRSANG");
        System.out.println("NIM : 215150700111026");
        System.out.println("");
    System.out.println("======================= MANUSIA ============================="); 
    Manusia man1 = new Manusia("Aku","3923842934",true, true);
    Manusia man2 = new Manusia("Budi","2345252416",true,false);
    Manusia man3 = new Manusia("Ayu","2311152416",false,false);
    Manusia man4 = new Manusia("Cahaya","345552322",false,true);
    System.out.println(man1.toString());
        System.out.println("");
    System.out.println(man2.toString());
        System.out.println("");
    System.out.println(man3.toString());
        System.out.println("");
    System.out.println(man4.toString());
    System.out.println("======================= MAHASISWA ============================");
     Mahasiswa mhs1 = new Mahasiswa("I PutuYoga", "351923848239", false,false, "205150601111018",3.70);
     Mahasiswa mhs2 = new Mahasiswa("Bayu", "87544225579988", false,true, "2123107016354222",3.20);
     Mahasiswa mhs3 = new Mahasiswa("Citra", "4322844443222", true,false, "2162713043243442",3.0);
     Mahasiswa mhs4 = new Mahasiswa("Bagas", "6433888882345", true,true, "208255241825533",3.50);
    System.out.println(mhs1.toString()+"\n");
    System.out.println(mhs2.toString()+"\n");
    System.out.println(mhs3.toString()+"\n");
    System.out.println(mhs4.toString()+"\n");
    System.out.println("======================= PEKERJA =============================="); 
    Pekerja pekerja1 = new Pekerja(7, 22,"195102439283", "Iqbal Biondy", "351717969", true,true);
     Pekerja pekerja2 = new Pekerja(8, 20,"42286461371", "Kirana", "336352422", false,true);
     Pekerja pekerja3 = new Pekerja(6, 24,"21792597543", "Soraya", "3386252", true,false);
     Pekerja pekerja4 = new Pekerja(9, 28,"18386437962", "Bidly", "6533262772", true,true);
    System.out.println(pekerja1.toString()+"\n");
    System.out.println(pekerja2.toString()+"\n");
    System.out.println(pekerja3.toString()+"\n");
    System.out.println(pekerja4.toString()+"\n");
    System.out.println("======================= MANAGER =============================="); 
    Manager manajer1 = new Manager(9, 20,"204837283728", "Lyra Hertin", "351707384392",false, false, 1500);
    Manager manajer2 = new Manager(7, 18,"324854296453", "Glory", "462525522222",true, false, 2000);
    Manager manajer3 = new Manager(8, 25,"571856628539", "Dimas", "744573564528",true, true, 2300);
    Manager manajer4 = new Manager(9, 20,"633725838628", "Fatih", "637464535333",false, true, 1800);
   
    System.out.println(manajer1.toString()+"\n");
    System.out.println(manajer2.toString()+"\n");
    System.out.println(manajer3.toString()+"\n");
    System.out.println(manajer4.toString()+"\n");
    }
}
