package ru.job4j.cast;

import ru.job4j.polymorphism.Transport;
import ru.job4j.tracker.Input;

public class Bus implements Vehicle, Transport {
    private String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " Едет по дороге");
    }

    @Override
    public void drive() {
        System.out.println("Едет долго и некомфортно.");
    }

    @Override
    public void traveler(int passenger) {
        System.out.println("Перевозит " + passenger + " пассажиров.");
    }

    @Override
    public double refuel(int fuel) {
        double price = 100;
        return fuel * price;
    }
}
