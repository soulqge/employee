package toko_online;

import java.util.ArrayList;
import java.util.Scanner;


    public class Transaksi {
    
    private ArrayList <Integer> idBarang = new ArrayList <Integer>();
    private ArrayList <Integer> banyak = new ArrayList <Integer>();
    private ArrayList <Integer> idMember = new ArrayList <Integer>();
    
    
public Transaksi(){
        
        this.idMember.add(0);
        this.idBarang.add(0);
        this.banyak.add(3);
        
        this.idMember.add(0);
        this.idBarang.add(1);
        this.banyak.add(3);
        
        this.idMember.add(1);
        this.idBarang.add(0);
        this.banyak.add(1);
        
        this.idMember.add(1);
        this.idBarang.add(1);
        this.banyak.add(2);      
    }
    
    public void prosesTransaksi(Member member, Transaksi transaksi, Barang barang){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Silahkan Belanja ");
        System.out.print("Masukkan Id Member : ");
        int idMember = scan.nextInt();
        System.out.print("Selamat Datang "+member.getName(idMember));
        ArrayList<Integer> idBarang = new ArrayList<Integer>();
        ArrayList<Integer> banyak = new ArrayList<Integer>();
        int i = 0;
        int temp = 0;
        
        do{
            System.out.print("Masukkan Kode Barang : ");
            temp = scan.nextInt();
            if (temp !=99) {
                System.out.print(barang.getNamaB(idBarang.get(i))+"Sebanyak : ");
                banyak.add(scan.nextInt());
                i++;
            }
        }
        while (temp !=99);
        
        System.out.println("Transaksi Belanja "+member.getName(idMember)+" Sebagai Berikut");
        System.out.println("Nama Barang \\tQty \\tHarga \\tJumlah \\t");
        
        int total =0;
        int x = idBarang.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * barang.getHarga(idBarang.get(j));
            total+=jumlah;
            
            System.out.println(barang.getNamaB(idBarang.get(j))+"\t"+idBarang.get(j)+"\t"+barang.getHarga(idBarang.get(j))+"\t"+ jumlah);
        }
    }
}
