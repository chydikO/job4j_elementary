package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140.0f);
        System.out.println("140 rubles are " + String.format("%.2f", euro) + " euro.");

        float usd = Converter.rubleToDollar(140.0f);
        System.out.println("140 rubles are " + String.format("%.2f", usd) + " usd.");

        float in = 140.0f;
        float expected = 2.0f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are" + expected + "usd. Test result : " + passed);

        expected = 2.3333333f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are " + expected + " eur. Test result : " + passed);
    }
}
