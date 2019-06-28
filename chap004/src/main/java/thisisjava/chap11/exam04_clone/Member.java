package thisisjava.chap11.exam04_clone;

public class Member  implements Cloneable{
    private String id;
    private String name;
     String password;
    private int age;
    private boolean adult;

    public Member(String id, String name, String password, int age, boolean adult) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
    }


    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member)this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cloned;
    }

    @Override
    public String toString() {
        return "Member{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", password='" + password + '\'' +
            ", age=" + age +
            ", adult=" + adult +
            '}';
    }
}
