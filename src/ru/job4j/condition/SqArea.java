package ru.job4j.condition;

public class SqArea {
    /**
     * h = p / (2 * (k + 1));
     * L = h * k;
     * s = L * h;
     */
    public static double square(int p, double k) {

        double h = p / (2 * (k + 1));
        double l = k * h;
        double rsl = h * l;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
    }
}