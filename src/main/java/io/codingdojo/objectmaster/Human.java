package io.codingdojo.objectmaster;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Human {
    private int strength = 3;
    private int stealth = 3;
    private int intelligence = 3;
    private int health = 100;

    public void attack(Human player) {
        player.health-= this.strength;
    }

    public void displayHealth() {
        System.out.println("Health: " + health);
    }
}
