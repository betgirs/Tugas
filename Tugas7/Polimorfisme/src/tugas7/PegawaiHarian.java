/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas7;

/**
 *
 * @author Personal
 */
public class PegawaiHarian extends Pegawai{
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    public double getUpahPerJam() {
        
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
    @Override
    public double gaji() {
        if(totalJam>=40){
         return super.gaji() +((40*upahPerJam)+(totalJam-40)*upahPerJam*1.5);
        }else{
         return super.gaji()+(upahPerJam*totalJam);
        }
        
    }

    @Override
    public String toString() {
        return  "Pegawai Harian  : "+
                super.toString()+
                "\nUpah/jam        : "+"Rp "+upahPerJam+
                "\nTotal jam kerja : "+(double)totalJam; 
    }

    
    
    
    
}
