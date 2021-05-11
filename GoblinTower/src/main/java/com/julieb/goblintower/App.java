/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.goblintower;

import java.util.Random;

/**
 *
 * @author julie
 */
public class App {
    public static void main(String args[]){
        
        boolean play = true;
        Random rand = new Random();
        
        // intialize hero
        Hero hero = new Hero();
        
        
        while (play){
            //level tracker 
            int stepCount =0; 
            int level =1; 
            
            //1. take step 
            //2. potion shop 
            
             if(rand.nextInt(5) == 3){
                 
                //spawn goblin 
                 Goblin goblin = new Goblin();
                 
                 //start fight 
             }
                 
        
        
        
        }
        
        
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
               hero.setGold(hero.getGold() +2);
               fight = false;
           }
           
           //if hero health <= 0 --> fight = false; 
           if(heroHealth <= 0){
               fight = false;
           }      
       }
   }


}
