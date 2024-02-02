package ru.job4j.tracker.oop;
/*up-casting*/

public class College {
    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        Student student = freshman;
        Object object = freshman;
    }
}
