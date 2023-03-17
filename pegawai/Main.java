package pegawai;

import java.util.Scanner;

public class Main {
   static Scanner scan = new Scanner(System.in);
   
    public static void main(String[] args) {
        System.out.print("Masukkan Nama : ");
        String nama = scan.nextLine();
        System.out.print("Masukkan NIP : ");
        int nip = scan.nextInt();
        scan.nextLine();
        System.out.print("Masukkan Jabatan : ");
        String jabat = scan.nextLine();
        Boss boss = new Boss();
        Manager manager = new Manager();
        CleaningServices cleaningService = new CleaningServices();
        Internship intern = new Internship();
        int gA = 0;
        
        if (jabat.equalsIgnoreCase(boss.jabat)) {
            System.out.print("Berapa Lama Waktu Anda Bekerja : ");
            int lamaKerja = scan.nextInt();
            gA = boss.hitung(boss.gaji, lamaKerja);           
        }
        else if (jabat.equalsIgnoreCase(manager.jabat)) {
            System.out.print("Berapa Lama Waktu Anda Bekerja : ");
            int lamaKerja = scan.nextInt();
            gA = manager.hitung(manager.gaji, lamaKerja);
            scan.nextLine();         
        }
        else if (jabat.equalsIgnoreCase(cleaningService.jabat)) {
            System.out.print("Berapa Lama Waktu Anda Bekerja : ");
            int lamaKerja = scan.nextInt();
            gA = cleaningService.hitung(cleaningService.gaji, lamaKerja);
        }
        else if (jabat.equalsIgnoreCase(intern.jabat)) {
            System.out.print("Berapa Lama Waktu Anda Bekerja : ");
            int lamaKerja = scan.nextInt();
            gA = intern.hitung(intern.gaji, lamaKerja);
        }
        System.out.print("Status ( Menikah / Tidak Menikah ) : ");
        scan.nextLine();
        String st = scan.nextLine();
        boolean status = true;
        if (st.equalsIgnoreCase("Menikah")) {
            gA += 5_000_000;
        }
        System.out.println("Gaji Bulan Ini : " + gA);

    }
}
