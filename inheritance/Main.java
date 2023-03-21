package inheritance;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunDatar bangunDatar = new BangunDatar();
        
        
        // membuat objek persegi dan mengisi properti
        Persegi persegi = new Persegi();
        System.out.print("Masukkan Sisi Persegi             : ");
        persegi.sisi = scan.nextInt();
        
        // membuat objek lingkaran dan mengisi properti
        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Masukkan Jari - Jari Lingkaran    : ");
        lingkaran.r = scan.nextInt();
        
        // membuat persegi panjang panjang dan mengisi properti
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        System.out.print("Masukkan Panjang Persegi Panjang  : ");
        persegiPanjang.panjang = scan.nextInt();
        System.out.print("Masukkan Lebar Persegi Panjang    : ");;
        persegiPanjang.lebar = scan.nextInt();
        
        // membuat segitiga dan mengisi properti
        Segitiga segitiga = new Segitiga ();
        System.out.print("Masukkan Alas Segitiga            : ");
        segitiga.alas = scan.nextInt();
        System.out.print("Masukkan Tinggi Segitiga          : ");
        segitiga.tinggi = scan.nextInt();
        System.out.print("Masukkan Sisi Miring Segitiga     : ");
        segitiga.sisimiring = scan.nextInt();
        
        // memanggil method luas dan keliling
        
//        bangunDatar.luas();
//        bangunDatar.keliling();
//        bangunDatar.spasi();
        
        persegi.luas();
        persegi.keliling();
        persegi.spasi();
        
        lingkaran.luas();
        lingkaran.keliling();
        lingkaran.spasi();
        
        persegiPanjang.luas();
        persegiPanjang.keliling();
        persegiPanjang.spasi();
        
        segitiga.luas();
        segitiga.keliling();
    }
}
