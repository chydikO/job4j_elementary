package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int monthly, double percent) {
        int year = 0;
        double balance = amount;
        while (balance > 0) {
            balance = (balance + balance * percent / 100) - monthly;
            balance += balance * (percent / 100);
            year++;
        }
        return year;
    }
}