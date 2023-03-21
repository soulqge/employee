package toko_online;

import java.util.ArrayList;

public class Karyawan {
    
    
     private ArrayList <String> namaK = new ArrayList <String>();
     private ArrayList <String> alamat = new ArrayList <String>();
     private ArrayList <String> telepon = new ArrayList <String>();
     private ArrayList <Integer> Jabat = new ArrayList <Integer>();
     
     public Karyawan(){
         this.namaK.add("Edi");
         this.alamat.add("Singosari");
         this.telepon.add("085876912346");
         this.Jabat.add(0);
         
         this.namaK.add("Guntur");
         this.alamat.add("Karangploso");
         this.telepon.add("087249564327");
         this.Jabat.add(0);
     }
   
     
    public void setName(String namaK){
        this.namaK.add(namaK);
    }
     
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    
    
    public void setTelp(String telepon){
        this.telepon.add(telepon);
    }
    public void setSaldo(int Jabat){
        this.Jabat.add(Jabat);
    }
    
    public String getName(int IdMember){
        return this.namaK.get(IdMember);
    }
    public String getAlamat( int IdMember ){
        return this.alamat.get(IdMember);
    }
    public String getTelp( int IdMember ){
        return this.telepon.get(IdMember);
    }
    public Integer getJabat( int IdMember ){
        return this.Jabat.get(IdMember);
    }
}
