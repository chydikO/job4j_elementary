package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int monthly, double percent) {
        int year = 0;
        while (amount > 0) {
            amount = (int) ((amount + amount * percent / 100) - monthly);
            year++;
        }
        return year;
    }
}