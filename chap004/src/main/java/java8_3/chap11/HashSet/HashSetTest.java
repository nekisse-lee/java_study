package java8_3.chap11.HashSet;

import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {
    public static void main(String[] args) {

        HashSet<Object> set = new HashSet<>();

        set.add(new Person("Lee", 10));
        set.add(new Person("Lee", 10));
        System.out.println("set = " + set);

        Person person = new Person("가", 1);
        Person person2 = new Person("가", 1);
        System.out.println(person.equals(person2));
        System.out.println(person.age == person2.age);
        int i = person.hashCode();
        int i2 = person2.hashCode();
        System.out.println("i==i2 = " + (i == i2));



    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ":" + age;
    }

    public boolean equals(Object object) {
        if (object instanceof Person) {
            Person person = (Person) object;
            return name.equals(person.name) && this.age == person.age;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }


}
