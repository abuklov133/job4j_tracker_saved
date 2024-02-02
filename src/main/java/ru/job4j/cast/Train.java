package ru.job4j.cast;

public class Train implements Vehicle {
   private String nameClass = getClass().getSimpleName();

    @Override
    public void move() {
        System.out.println(nameClass + " Едет по рельсам");
    }
}
