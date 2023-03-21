/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author Ahmad Arfa
 */
public class player {

   String name;
   int speed,HP,attack1,armor;
   boolean defend = false;
   
   
   void run(){
       System.out.println("Nama Player      = "+name);
       System.out.println("Health           = "+HP);
       System.out.println("Speed            = "+speed);
       System.out.println("Attack Damage    = "+attack1);
       System.out.println("Armor            = "+armor);
       System.out.println("========================");

   }
   boolean isDead (){
       if (HP <=0) return true;
       return false;
   }
   boolean isAlive (){
       if (HP <= 100 && HP >=1) return true;
       return false;
   }

   void attack(player player){
       int atkdmg = attack1;
       
       if (player.armor >0) {
           player.armor -= atkdmg;
           player.defend = false;

       }
        if (player.armor <=0) {
           player.HP -= atkdmg;
           player.defend = false;

       }
   }
   
   void defend(){
       defend = true;
   }
}