package ru.job4j.poly;

public class Train implements Vehicle {
    private int numPassengers = 0;

    public Train(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public void move() {
        System.out.println("Поезд ездит по рельсам");
    }

    @Override
    public void passengers() {
        System.out.println("Поезд перевозит " + numPassengers + " пассажиров");
    }
}
