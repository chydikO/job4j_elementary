package ru.job4j.condition;

public class StringEq {
    public static void main(String[] args) {
        String first = new String();
        String one = new String();
        compareStrings(first, one);

        first = new String("one");
        one = new String("one");

        compareStrings(first, one);
    }

    private static void compareStrings(String first, String one) {
        System.out.println("first HASH is - " + StringEq.getHash(first));
        System.out.println("one HASH is - " + StringEq.getHash(one));
        if (first == one) {
            System.out.println("first equals one");
        } else {
            System.out.println("first does not equal one");
        }
        System.out.println();
    }

    private static int getHash(String string) {
            return string.hashCode();
    }
}
