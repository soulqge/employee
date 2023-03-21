package toko_online;

import java.util.ArrayList;

 public class Member implements User{
     
     private ArrayList <String> namaM = new ArrayList <String>();
     private ArrayList <String> alamat = new ArrayList <String>();
     private ArrayList <String> telepon = new ArrayList <String>();
     private ArrayList <Integer> saldo = new ArrayList <Integer>();
     
     public Member(){
         this.namaM.add("Arfa");
         this.alamat.add("Dinoyo");
         this.telepon.add("081358087866");
         this.saldo.add(100_000);
         
         this.namaM.add("Hendra");
         this.alamat.add("Lesanpuro");
         this.telepon.add("08135876512");
         this.saldo.add(250_000);
     }
   
     @Override
    public void setName(String namaM){
        this.namaM.add(namaM);
    }
     @Override
    public void setAlamat(String alamat){
        this.alamat.add(alamat);
    }
    
     @Override
    public void setTelp(String telepon){
        this.telepon.add(telepon);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public int getSaldo(int IdMember){
        return this.saldo.get(IdMember);
    }
    public void editSaldo(int IdMember, int saldo){
        this.saldo.set(saldo, IdMember);
    }
    public int getJmlM(){
        return this.saldo.size();
    }
    
    public String getName( int IdMember ){
        return this.namaM.get(IdMember);
    }
    public String getAlamat( int IdMember ){
        return this.alamat.get(IdMember);
    }
    public String getTelp( int IdMember ){
        return this.alamat.get(IdMember);
    }
    
   
 } 