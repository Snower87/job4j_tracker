package ru.job4j.poly;

public class Plane implements Vehicle {
    private int numPassengers = 0;

    public Plane(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    @Override
    public void move() {
        System.out.println("Самолет летает по воздуху");
    }

    @Override
    public void passengers() {
        System.out.println("Самолет перевозит " + numPassengers + " пассажиров");
    }
}
