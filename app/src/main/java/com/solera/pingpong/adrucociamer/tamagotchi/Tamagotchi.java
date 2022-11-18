package com.solera.pingpong.adrucociamer.tamagotchi;

public class Tamagotchi {

    private boolean alive = false;
    private int fullness = 0;
    private int hungriness = 0;
    private int happiness = 100;
    private int tiredness = 0;

    public Tamagotchi() {}

    public void tick() {
        if (fullness > 100) this.die();
        if (hungriness >= 100) this.die();
        if (happiness <= 0) this.die();
        if (tiredness >= 100) this.die();

        if (!alive) {
            System.out.println("You killed your gochi, monster.");
            return;
        }

        hungriness += 1;
        happiness -=1;
        tiredness += 1;
    }

    public void feed() {
        this.hungriness -= 25;
        this.fullness += 15;
    }

    public void play() {
        this.happiness += 50;
        this.tiredness += 40;
    }

    public void sleep() {
        this.tiredness = 0;
    }

    public void poop() {
        this.fullness = 0;
    }

    private void die() {
        this.alive = false;
    }

}
