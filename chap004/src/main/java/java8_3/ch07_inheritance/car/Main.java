package java8_3.ch07_inheritance.car;

public class Main {
    public static void main(String[] args) {

        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;

        fe2 = (FireEngine) car;
        fe2.water();


    }
}
