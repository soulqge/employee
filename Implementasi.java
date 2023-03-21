/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testlagilagi;

import java.util.Scanner;

/**
 *
 * @author Ahmad Arfa
 */
public class Implementasi {
    public static void totalbiaya(int total) {
        System.out.println("Total Biaya Adalah : "+total);
    }
    public static void receipt(int total, String maskapai, String tujuan) {
       System.out.println("Rincian Pesanan : "+"\n" +"Maskapai : "+maskapai + "\n" + "Tujuan : "+tujuan + "\n" + "Harga : "+total );
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String maskapai[]={"Air Asia","Garuda Indonesia","Batik Air"};
        String tujuan[]= {"Jakarta - Surabaya","Bali - Aceh","Malang - Jayapura"};
        System.out.println("1. Air Asia \n2. Garuda Indonesia \n3. Batik Air ");
        System.out.print("Masukkan Maskapai : ");
        int nm = scan.nextInt()-1 ;
        System.out.println("1. Jakarta - Surabaya \n2. Bali - Aceh \n3. Malang - Jayapura ");
        System.out.print("Masukkan Tujuan Penerbangan : ");
        int tp = scan.nextInt()-1;
        System.out.print("Masukkan Jumlah Penumpang : ");
        int jp = scan.nextInt();
        
        int total = 0;
      
        if (nm==0) {
            if (tp==0) {
             for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*1000000;
            }
            else if (tp==1) {
                for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*2500000;
            }
            else if (tp==2) {
                for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*3000000;
            }
            totalbiaya(total);
        }
         if (nm==1) {
            if (tp==0) {
             for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*2000000;
            }
            else if (tp==1) {
                for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*3500000;
            }
            else if (tp==2) {
                for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*4000000;
            }
            totalbiaya(total);
        }
          if (nm==2) {
            if (tp==0) {
             for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*800000;
            }
            else if (tp==1) {
                for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*1200000;
            }
            else if (tp==2) {
                for (int i = 0; i < jp; i++) {
                System.out.println("Masukkan Nama : ");
                String nama = scan.next();
            }
              total = jp*2000000;
            }
            totalbiaya(total);
        }
    receipt(total, maskapai[nm],tujuan[tp]);
            }
           
        }
      
    

