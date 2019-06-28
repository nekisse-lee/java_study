package thisisjava.chap11.exam05_deepclone;

@SuppressWarnings("Duplicates")
public class MemberExample {

    public static void main(String[] args) {


        Member original = new Member("홍길동", 25, new int[]{90, 90}, new Car("소나타"));

        Member cloned = original.getMember();
        cloned.scores[0] = 100;
        cloned.car.model = "그랜저";



        System.out.println("원본객체");
        System.out.print("{");
        for (int i = 0; i < original.scores.length; i++) {
            System.out.print(original.scores[i]);
            System.out.print((i==(original.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("original.car.model = " + original.car.model);

        System.out.println();
        System.out.println("복사객체");
        System.out.print("{");
        for (int i = 0; i < cloned.scores.length; i++) {
            System.out.print(cloned.scores[i]);
            System.out.print((i==(cloned.scores.length-1))?"":",");
        }
        System.out.println("}");
        System.out.println("cloned.car.model = " + cloned.car.model);

    }


}
