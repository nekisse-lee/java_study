package java8_3.ch07_inheritance;

public class Child extends Parent {
    int x = 20;

    void method() {
        System.out.println("this.x = " + this.x);
        System.out.println("super.x = " + super.x);

    }

    public static void main(String[] args) {
        new Child().method();

    }
}
