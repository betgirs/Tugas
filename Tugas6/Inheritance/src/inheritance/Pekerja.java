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
public class Pekerja extends Manusia{
    private double gaji,bonus;
    private int jamKerja,hariKerja;
    private String NIP;

    public Pekerja( int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jk, boolean menikah) {
        super(nama, NIK, jk, menikah);
        this.gaji = gaji;
        this.bonus = bonus;
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }
    public double getGaji() {
        gaji=getHariKerja() * getJamKerja() * 15;
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getBonus() {
        double bonusLembur=0;
        double bonusLibur=0;
        
        int libur = (getHariKerja() / 7) * 2;
        
        if (getHariKerja() - (getHariKerja() / 7 * 7) == 6)
            libur++;

        if (getJamKerja() > 7)
            bonusLembur = (getHariKerja() - libur) * (getJamKerja() - 7) * 7;
      
        if (getHariKerja() > 5)
            bonusLibur = libur * getJamKerja() * 20;

        return bonusLibur + bonusLembur;
        
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }
    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
    public String getStatus(){
        String kantor=null;
        String departemen=null;
        
        switch(NIP.charAt(0)){
            case '1':
            kantor="Mondstadt";
            break;
            case '2' :
            kantor = "Liyue";
            break;
            case '3':
                kantor ="Inazuma";
                break;
            case '4':
                kantor ="Sumeru";
                break;
            case '5':
                kantor ="Fontaine";
                break;
            case '6':
                kantor =" Natlan";
               break;
            case '7':
                kantor ="Snezhnaya";
                break;
            
            default:
                kantor ="-";
               
                
        }
        switch (NIP.charAt(6)){
            case '1':  
            departemen="Pemasaran";
            break;
            case '2' :
            departemen="Humas";
            break;
            case '3':
                departemen="Riset";
                break;
            case '4':
                departemen="Teknologi";
                break;
            case '5':
                departemen="Personalia";
                break;
            case '6':
                departemen="Akademik";
                break;
            case '7':
                departemen="Administrasi";
                break;
            case '8':
                departemen="Operasional";
                break;
            case '9':
                departemen="Pembangunan";
                break;
            default:
                departemen="-";
        }
        return departemen+", "+kantor+" cabang ke- "+NIP.charAt(2);
      
    }
     @Override
    public double getpendapatan() {
        return super.getpendapatan()+getGaji()+getBonus(); 
    }
    

    @Override
    public String toString() {
        return super.toString()+
                 "\nBonus : "+getBonus()+"$"+
                "\nGaji: "+gaji+"$"+
                "\nStatus : "+getStatus();
    }

   
}
