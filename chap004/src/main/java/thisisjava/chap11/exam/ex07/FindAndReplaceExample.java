package thisisjava.chap11.exam.ex07;

public class FindAndReplaceExample {

    public static void main(String[] args) {


        String str = "모든 프로그램은 자바 언어로 개발될 수 있다.";
        int index = str.indexOf("자바");

        if (index == -1) {
            System.out.println("문자열 포함 XXXX");
        } else {
            System.out.println("포함 OOOOOOOO");
            str = str.replace("자바","Java");
            System.out.println("--> " + str );
        }



    }

}
