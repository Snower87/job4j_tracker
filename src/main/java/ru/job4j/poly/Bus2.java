package ru.job4j.poly;

public class Bus2 implements Vehicle {
    private int numPassengers = 0;

    public Bus2(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public void move() {
        System.out.println("Автобус ездит по дороге");
    }

    @Override
    public void passengers() {
        System.out.println("Автобус перевозит " + numPassengers + " пассажиров");
    }
}
