package ru.job4j.tracker.cast;

public class Main {
    public static void main(String[] args) {
        Vehicle airplane = new AirPlane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{airplane, train, bus};
        for (Vehicle object : vehicles) {
            object.move();
        }
    }
}
