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
public class Hero {
    Random rand = new Random();
    
    int health = rand.nextInt(30-20)+20;
    int power = rand.nextInt(3-1)+1;
    int defense = rand.nextInt(5-1)+1;
    int[] potions =  new int[5];
    int gold =0;

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int[] getPotions() {
        return potions;
    }

    public void setPotions(int[] potions) {
        this.potions = potions;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }
    
    
}
