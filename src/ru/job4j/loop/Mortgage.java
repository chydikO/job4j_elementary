package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int monthly, double percent) {
        int year = 0;
        double balance;
        percent = percent / 100;
        balance = amount + amount * percent;
        while (balance > 0) {
            balance = balance - monthly;
            balance += balance * percent;
            year++;
        }
        return year;
    }
}
