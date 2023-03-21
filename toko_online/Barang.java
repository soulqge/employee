package toko_online;

import java.util.ArrayList;

public class Barang {
    
    private ArrayList <String> namaB = new ArrayList <String>();
    private ArrayList <Integer> stok = new ArrayList <Integer>();
    private ArrayList <Integer> harga = new ArrayList <Integer>();
    
    public Barang(){
        
        this.namaB.add("Sabun Muka");
        this.stok.add(20);
        this.harga.add(10_000);
        
        this.namaB.add("Odol");
        this.stok.add(20);
        this.harga.add(25_000);
        
        this.namaB.add("Shampoo");
        this.stok.add(20);
        this.harga.add(15_000);
    }
    
    public int getJmlB(){
        return this.namaB.size();
    }
    public void setNamaB(String namaB){
        this.namaB.add(namaB);
    }
    public String getNamaB(int idBarang){
        return this.namaB.get(idBarang);
    }
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
}
