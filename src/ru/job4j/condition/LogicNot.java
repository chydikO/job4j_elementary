package ru.job4j.condition;

/**
 * 1. isEven() - проверяет, что число четное;
 * 2. isPositive() -  проверяет, что число положительное.
 * Вам необходимо дописать код в остальные методы и при этом использовать уже реализованные методы в:
 * - метод notEven(), проверяет, что число нечетное;
 * - метод notPositive(), проверяет, что число не положительное;
 * а также сочетания реализованных методов в указанных ниже методах:
 * - метод notEvenAndPositive(), проверяет, что число нечетное и положительное;
  * - метод evenOrNotPositive(), проверяет, что число четное или не положительное.
 */
public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notEven(num);
    }
}
