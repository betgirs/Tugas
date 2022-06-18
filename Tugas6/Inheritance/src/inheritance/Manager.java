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
public class Manager extends Pekerja{
    private int lamaKerja;

    public Manager( int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jk, boolean menikah,int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jk, menikah);
        this.lamaKerja = lamaKerja;
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nLma Kerja : "+lamaKerja+" hari"; 
    }

    @Override
    public double getBonus() {
        return super.getBonus()+ (super.getBonus() * (0.3)); 
    }

    @Override
    public double getTunjangan() {
        return super.getTunjangan()+15; 
    }

    
    
}
