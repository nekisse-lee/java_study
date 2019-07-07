package thisisjava.chap13_generic.sec04.exam01_generic_method;

public class BoxMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.<Integer>boxing(100);
        Integer intValue = box1.get();

        System.out.println("intValue = " + intValue);


        Box<String> box2 = Util.boxing("홍길동");
        String strValue = box2.get();
        System.out.println("strValue = " + strValue);


    }

}
