package java8_3.chap09_.lang.StringBuffer;

import java.util.Arrays;

public class StringBufferEx {
    public static void main(String[] args) {

        final StringBuilder stringBuilder = new StringBuilder("123");

        stringBuilder.insert(1, "d");
        System.out.println("stringBuilder = " + stringBuilder);
        System.out.println("stringBuilder.length() = " + stringBuilder.length());

        stringBuilder.replace(0, 2, "gg");
        System.out.println("stringBuilder = " + stringBuilder);

        System.out.println("stringBuilder.reverse = " + stringBuilder.reverse());
        System.out.println("stringBuilder = " + stringBuilder);
        stringBuilder.setCharAt(0, 'P');
        System.out.println("stringBuilder.setCharAt(0,'P'); = " + stringBuilder);
        stringBuilder.setLength(2);
        System.out.println("stringBuilder.setLength(2) = " + stringBuilder);

        stringBuilder.setLength(5);
        System.out.println("stringBuilder.setLength(5) = " + stringBuilder);
        System.out.println("stringBuilder.toString() = " + stringBuilder.toString());
        final String substring1 = stringBuilder.substring(0);
        final String substring = stringBuilder.substring(0, 2);
        System.out.println("substring = " + substring);

    }
}
