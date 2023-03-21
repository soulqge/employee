/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Ahmad Arfa
 */
public class game {
    public static void main(String[] args) {
        Scanner scan    = new Scanner(System.in);
        player Player1  = new player();
        player Player2  = new player();
        
        System.out.print("Masukkan Nama Player 1 : ");
        Player1.name    = scan.nextLine();
        Player1.HP      = 100;
        Player1.speed   = (int) ( Math.random()*100);
        Player1.attack1 = (int) ( Math.random()*50);
        Player1.armor   = (int) ( Math.random()*100);
        
        System.out.print("Masukkan Nama Player 2 : ");
        Player2.name    = scan.nextLine();
        Player2.HP      = 100;
        Player2.speed   = (int) ( Math.random()*100);
        Player2.attack1 = (int) ( Math.random()*50);
        Player2.armor   = (int) ( Math.random()*100);
        
        Player1.run();
        Player2.run();
        
        boolean Player1Gilir = false;
        
       while(true){
           if (Player1.HP <= 0 || Player2.HP <= 0)
           break;
       
       
        if (Player1Gilir) {
            
            System.out.println(Player1.name+" Choice Attack/Defend"+" : ");
                String choice   = scan.next();
                    if (choice.equalsIgnoreCase("Attack")) {
                Player1.attack(Player2);
            }
                    else if (choice.equalsIgnoreCase("Defend")) {
                     Player1.defend();
        }
                        Player1Gilir = false;
        }
        else if (!Player1Gilir)
        {
            System.out.println(Player2.name+" Choice Attack/Defend"+" : ");
                String choice   = scan.next();
                    if (choice.equalsIgnoreCase("Attack")) {
                    Player2.attack(Player1);
            }
                    else if (choice.equalsIgnoreCase("Defend")) {
                     Player2.defend();
        }
                        Player1Gilir = true;
        }
        System.out.println("\n"+ Player1.name +" Health: " + Player1.HP);
        System.out.println(Player1.name +" Armor: " + Player1.armor);
           System.out.println("========================");
        System.out.println(Player2.name + " Health: " +Player2.HP);
        System.out.println(Player2.name + " Armor: " +Player2.armor + '\n');
        
       }
           
       
        if (Player1.isAlive())
            System.out.println(Player1.name+" Adalah Pemenang");
        else if (Player2.isAlive()) 
            System.out.println(Player2.name+" Adalah Pemenang");
      
       
    }
}
