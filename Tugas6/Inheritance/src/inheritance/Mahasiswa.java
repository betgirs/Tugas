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
public class Mahasiswa extends Manusia{
    private String NIM;
    private double IPK;

    public Mahasiswa(String nama, String NIK, boolean jk, boolean menikah,String NIM, double IPK) {
        super(nama, NIK, jk, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
       
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    public String getStatus(){
         
             if (getNIM().charAt(6)=='2')
                 return "Teknik Meniup Gelembung"+",20"+NIM.substring(0, 2);
             else if(NIM.charAt(6)=='3')
                 return "Teknik Berburu Ubur Ubur"+",20"+NIM.substring(0, 2);
             else if(NIM.charAt(6)=='4')
                 return "Sistem Perhamburgeran"+",20"+NIM.substring(0, 2);
             else if(getNIM().charAt(6)=='6')
                 return "Pendidikan Chum Bucket"+",20"+NIM.substring(0, 2);
             else if (NIM.charAt(6)=='7')
                 return "Teknologi Telepon Kerang"+",20"+NIM.substring(0, 2);
             else 
                 return "Maaf data yang anda inputkan belum ada di fakultas ini";
             
              
        }
        
    
    public double getBeasiswa(){
         if(IPK>3.0&&IPK<3.5)
            return 50;
         else if(IPK>3.5&&IPK<4)
             return 75;
         else
             return 0;
    }


    @Override
    public double getpendapatan() {
        return super.getpendapatan()+getBeasiswa(); 
    }

    @Override
    public String toString() {
        return super.toString()+ 
                "\nIPK : "+IPK+
                "\nNIM : "+NIM+
                "\nStatus : "+getStatus();
    }
    
}   

