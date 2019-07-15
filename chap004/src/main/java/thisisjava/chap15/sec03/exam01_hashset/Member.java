package thisisjava.chap15.sec03.exam01_hashset;

import java.util.Objects;

public class Member {

    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            return member.name.equals(this.name) && member.age == this.age;
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
//        return name.hashCode() + age;
        return Objects.hash(name, age);
    }
}
