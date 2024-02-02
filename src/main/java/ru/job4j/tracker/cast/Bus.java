package ru.job4j.tracker.cast;

public class Bus implements Vehicle {
    private String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " Едет по дороге");
    }
}
