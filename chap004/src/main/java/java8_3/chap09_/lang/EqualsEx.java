package java8_3.chap09_.lang;

import java.util.Objects;

public class EqualsEx {
    public static void main(String[] args) {

        final Member member1 = new Member("이", 1);
        final Member member2 = new Member("이", 2);
        System.out.println("member1.hashCode() + \" \"+ member2.hashCode() = " + member1.hashCode() + " "+ member2.hashCode());

        System.out.println("equals, hashcode 재정의 안함 = " + member1.equals(member2));
        System.out.println("member1==member2 = " + (member1 == member2) + "\n");

        final Member2 member3 = new Member2("김", 2);
        final Member2 member4 = new Member2("김", 2);
        

        System.out.println("equals, hashcode 재정의 함 = " + member3.equals(member4));
        System.out.println("(member3==member4) = " + (member3==member4));
        System.out.println("member3.hashCode() +\" \"+ member4.hashCode() = " + member3.hashCode() +" "+ member4.hashCode());

        System.out.println(System.identityHashCode(member3));
        System.out.println(System.identityHashCode(member4));

    }


}

class Member {

    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }


}

class Member2 {
    String name;
    int age;

    public Member2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member2 member2 = (Member2) o;
        return age == member2.age &&
            Objects.equals(name, member2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
