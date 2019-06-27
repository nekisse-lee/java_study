package java8_3.ch06_oop;

public class DocumentTest {
    static int count;
    String name;

    public DocumentTest() {
        this("제목없음" + (++count));
    }

    public DocumentTest(String name) {
        this.name = name;
        System.out.println(name + " 가 생성");
    }

    public static void main(String[] args) {

        DocumentTest documentTest1 = new DocumentTest();
        DocumentTest documentTest2 = new DocumentTest();
        DocumentTest documentTest3 = new DocumentTest();
        DocumentTest documentTest4 = new DocumentTest("해리포터");
        new DocumentTest();
    }
}
