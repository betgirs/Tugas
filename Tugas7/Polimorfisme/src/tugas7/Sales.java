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
public class Sales extends Pegawai{
    private int penjualan;
    private double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
    @Override
    public double gaji() {
        return super.gaji()+(penjualan*komisi); 
    }
    
    @Override
    public String toString() {
        return  "Sales           : "+
                super.toString()+
                "\nTotal Penjualan : "+(double)penjualan+
                "\nBesaran Komisi  : "+komisi;     }

    
    
}
