package java8_3.chap09_java_lang;

public class CloneMain {
    public static void main(String[] args) throws CloneNotSupportedException {

        final Clone_Point original = new Clone_Point(3, 5);
        final Clone_Point clone = (Clone_Point) original.clone();
        System.out.println(original);
        System.out.println(clone);
        System.out.println(original.hashCode());
        System.out.println(clone.hashCode());

    }
}
