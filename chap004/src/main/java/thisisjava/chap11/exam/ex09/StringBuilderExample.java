package thisisjava.chap11.exam.ex09;

public class StringBuilderExample {

    public static void main(String[] args) {

        String str = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= 100; i++) {
             stringBuilder.append(i);
        System.out.println(stringBuilder);
        }
    }

}
