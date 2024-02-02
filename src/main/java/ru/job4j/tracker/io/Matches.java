package ru.job4j.tracker.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            if (count < matches) {
                System.out.println("Ошибка. Введите число не больше остатка.");
                continue;
            }
            if (matches > 3) {
                System.out.println("Ошибка. Введите число согласно условию.");
                continue;
            }
            turn = !turn;
            count -= matches;
            System.out.println("Осталось " + count + " спичек");

        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}
