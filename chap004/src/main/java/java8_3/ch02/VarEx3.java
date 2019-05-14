package java8_3.ch02;

public class VarEx3 {
    public static void main(String[] args) {
        int score = 100;
//        final int score = 100;
        System.out.println("score = " + score);

        score = 200;
        System.out.println("score = " + score);

        boolean power = true;
        System.out.println("power = " + power);
        power = false;
        System.out.println("power = " + power);
//        power = 0; type mismatch

        byte b = 127;
//        byte b = 128; type mismatch 범위초과
        System.out.println("b = " + b);

        int oct = 010; //8진수, 10진수로 8
        int hex = 0x10;//16진수, 10진수로 16
        System.out.println("oct = " + oct);
        System.out.println("hex = " + hex);

        long l = 10_000_000_000L;
        System.out.println("l = " + l);

        float f = 3.14f;
        double d = 3.14f;
        System.out.println("f + \" \" + d = " + f + " " + d);
        System.out.println(10.);
        System.out.println(.10);
        System.out.println(10f);
        System.out.println(1e3);
        System.out.println();
        char ch = 'A';
//        ch = 'AB';
        System.out.println("ch = " + ch);
        int i = 'A';
        System.out.println("i = " + i);

        String emptyStr = "";
        String str1 = "ABCD";
        String str2 = "123";
        String str3 = str1 + str2;
        System.out.println("emptyStr = " + emptyStr);
        System.out.println("str1 = " + str1);
        System.out.println("str3 = " + str3);
        System.out.println("" + 7 + 7);
        System.out.println(7 + 7 + "");
    }
}
