package thisisjava.chap13_generic.sec02.exam01_none_generic;

public class BoxExample {
    public static void main(String[] args) {

        Box box = new Box();
        box.setObject("홍길동");
        System.out.println("box.get() = " + box.get());

        String str = (String) box.get();
        System.out.println("str = " + str);


        box.setObject(new Apple());
        Apple apple = (Apple) box.get();
    }
}
