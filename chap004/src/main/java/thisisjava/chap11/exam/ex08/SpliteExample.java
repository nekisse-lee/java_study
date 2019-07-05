package thisisjava.chap11.exam.ex08;

import java.util.StringTokenizer;

public class SpliteExample {
    public static void main(String[] args) {

        String str = "아이디,이름,패스워드";

        //split()
        String[] split = str.split(",");
        for (String s : split) {
            System.out.println("s = " + s);
        }


        //StringTokenizer
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println("stringTokenizer.countTokens() = " + stringTokenizer.countTokens());

            System.out.println("stringTokenizer.nextToken() = " + stringTokenizer.nextToken());
        }

    }
    
    
}
