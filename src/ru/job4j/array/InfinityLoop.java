package ru.job4j.array;

/**
 * 2. Какой оператор вызывает вечный цикл? Напишите об этом в комментарии.
 *    index = index - 1; - вызывает вечный цикл, тк счетчик index не увеличивается и завершение цикла не возможно
 */
public class InfinityLoop {
    public static void main(String[] args) {
        for (int index = 0; index < 10; index++) {
            System.out.println("infinity");
            index = index - 1;
        }
    }
}
