package thisisjava.chap11.exam04_clone;

public class MemberExample {
    public static void main(String[] args) {

        Member original = new Member("blue", "홍길동", "12345", 25, true);

        Member cloned = original.getMember();
        cloned.password = "789789";

        System.out.println("original.toString() = " + original.toString());

        System.out.println("cloned.toString() = " + cloned.toString());
        
    }
}
