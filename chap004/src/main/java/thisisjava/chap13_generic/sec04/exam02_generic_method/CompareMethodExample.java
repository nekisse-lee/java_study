package thisisjava.chap13_generic.sec04.exam02_generic_method;

@SuppressWarnings("Duplicates")
public class CompareMethodExample {
    public static void main(String[] args) {
        Pair<Integer, String> p1 = new Pair<>(1, "사과");

        Pair<Integer, String> p2 = new Pair<>(1, "사과");

        boolean result1 = Util.<Integer, String>compare(p1, p2);

        if (result1) {

            System.out.println("동등객체입니다.");
        } else {
            System.out.println("동등하지 않습니다.");
        }


        Pair<String, String> p3 = new Pair<>("user1", "홍길동");

        Pair<String, String> p4 = new Pair<>("user2", "홍길동");

        boolean result2 = Util.compare(p3, p4);

        if (result2) {

            System.out.println("동등객체입니다. = " + result2);
        } else {
            System.out.println("동등하지 않습니다. = " + result2
             );
        }


    }

}
