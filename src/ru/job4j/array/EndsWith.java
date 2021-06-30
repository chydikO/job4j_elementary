package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        for (int i = 0; i < post.length; i++) {
            if (word[(word.length - 1) - i] == post[(post.length - 1) - i]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}
