package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        for (boolean v:data
        ) {
            if (data[0] != v) {
                return false;
            }
        }
        return true;
    }
}
