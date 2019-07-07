package thisisjava.chap13_generic.sec02.exam02_generic_type;

public class BoxExample {
    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();

        stringBox.set("hello");

        String greet = stringBox.get();

        Box<Integer> box2 = new Box<>();

        box2.set(6);

        Integer valueInteger = box2.get();



    }
}
