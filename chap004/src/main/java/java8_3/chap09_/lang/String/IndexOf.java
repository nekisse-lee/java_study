package java8_3.chap09_.lang.String;

import java.util.Arrays;

public class IndexOf {
    public static void main(String[] args) {

        String s = "ABCDE";
        final int cd = s.indexOf("CD");
        if (cd != 2) {
            System.out.println("위치다름");
        }
        System.out.println(cd);

        String s1 = "java.lange";
        System.out.println(s1.lastIndexOf('a'));
        final String replace = s1.replace("java", "C");
        System.out.println("replace = " + replace);

        final String replace1 = s1.replace('j', 'a');
        System.out.println("replace1 = " + replace1);

        String ab = "aaBBccaaDD";
        System.out.println("ab = " + ab.replaceFirst("aa", "JJ"));

        String split = "aa,dd,cc,bb";

        final String[] split1 = split.split(",");
        Arrays.stream(split1).forEach(System.out::println);
        System.out.println();

        String animal = "cat,dog,bear";
        final String[] animals = animal.split(",", 2);
        for (String animal1 : animals) {
            System.out.println(animal1);
        }

        final String substring = animal.substring(1, animal.length()-1);
        System.out.println("substring = " + substring);


    }
}
