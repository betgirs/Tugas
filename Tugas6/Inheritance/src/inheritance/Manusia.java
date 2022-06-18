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
public class Manusia {
    private String nama,NIK;
    private boolean jk,menikah;

    public Manusia(String nama, String NIK, boolean jk, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jk = jk;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJk() {
      
     return jk;
    }

    public void setJk(boolean jk) {
       this.jk = jk;
        
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public double getTunjangan(){
        if(jk==true &&menikah==true)
        return 25;
        else if (jk==true && menikah==false)
            return 20;
        else
            return 15;
    }
    public double getpendapatan(){
        double pdpt = 0;
        pdpt+= getTunjangan();
  
        return pdpt;
    }
    public String toString() {
       
        return "Nama : " + nama+ 
               "\nNIK  : " + NIK+ 
               "\nJenis Kelamin   : " + jk+ 
               "\nPendapatan : " + getpendapatan()+"$";
              
    }
            
}
