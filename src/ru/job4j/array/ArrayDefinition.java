package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        String[] names = new String[4];

        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);

        names[0] = "Панкратов Матвей";
        names[1] = "Дмитриева Вера";
        names[2] = "Захарова Агата";
        names[3] = "Суслов Александр";

        for (String name: names) {
            System.out.println(name);
        }
    }
}
