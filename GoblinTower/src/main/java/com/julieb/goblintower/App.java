/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.goblintower;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author julie
 */
public class App {
    public static void main(String args[]){
        
        boolean play = true;
        
        
        // intialize hero
        Hero hero = new Hero();
        
        
        while (play){
            
            Random random = new Random();
            int rand = random.nextInt(3);
            
            //level tracker 
            int stepCount =0; 
            int level =1; 
            
            //1. take step 
            //2. potion shop 
            int option = menu();
            
            if (option == 1){
                stepCount += 1;
                
                //randomize fight and goblin
                if(rand == 1){ 
                    //spawn goblin 
                     Goblin goblin = new Goblin();

                     //start fight
                     fight(hero, goblin);
             }
                else {System.out.println("All Clear");}
            }
            
            //change levels
            if(stepCount == 10){
                level +=1;
                stepCount = 0;
            }
            
            //potion shop 
            if(option ==2){
                
            }
            
            
           
                 
        
        
        
        }
        
        
  }
   
    public static int  menu(){
        System.out.println("1. Take a step \n2. Potion shop");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();
        
        if (option == 1){
            return 1;
        }
        if (option == 2){
            return 2;
        }
        
        return 0;
    }
    
   
    
   public static void fight (Hero hero, Goblin goblin){
       boolean fight = true;
       int goblinHealth = goblin.getHealth();
       int heroHealth = hero.getHealth();
       
       while (fight){
           
           //if goblin defense < hero defense --> goblin health -= hero attack 
           if (goblin.getDefense() < hero.getDefense()){
               goblinHealth -= hero.getPower();
           
           }
           //else if goblin defense > hero defense --> hero health -= goblin attack
           else if(goblin.getDefense() > hero.getDefense()){
              heroHealth -= goblin.getPower();
           }
           //else if goblin defense == hero health --> goblin health -= hero attack && hero health -= goblin attack
           else if(goblin.getDefense() == hero.getDefense()){
               goblinHealth -= hero.getPower();
               heroHealth -= goblin.getPower();
           }
           
           //if goblin health <= 0  -> hero gold +2, fight = false;
           if(goblinHealth <= 0 ){
               System.out.println("You won and earned 2 coins!");
               hero.setGold(hero.getGold() +2);
               System.out.println("Coins: " + hero.getGold());
               
               fight = false;
           }
           
           //if hero health <= 0 --> fight = false; 
           if(heroHealth <= 0){
               System.out.println("You lost!");
               fight = false;
           }      
       }
   }


}
