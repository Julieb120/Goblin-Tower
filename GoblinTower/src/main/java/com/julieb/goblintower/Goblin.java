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
public class Goblin {
    Random rand = new Random();
    
    int health = rand.nextInt(10-5)+5;
    int power = rand.nextInt(3-2)+2;
    int defense = rand.nextInt(2-1)+1;

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
    
    
}
