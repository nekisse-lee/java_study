package java8_3.chap09_java_lang;

public class CircleMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        final Circle circle = new Circle(new Clone_Point(1, 2), 2);

        Circle c2 = (Circle) circle.clone();
        System.out.println("circle = " + circle);
        System.out.println("c2 = " + c2);

        circle.p.x = 10;
        System.out.println("circle = " + circle);
        System.out.println("c2 = " + c2);
    }
}
