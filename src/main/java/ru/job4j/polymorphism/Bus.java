package ru.job4j.polymorphism;

public class Bus implements Transport {
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
