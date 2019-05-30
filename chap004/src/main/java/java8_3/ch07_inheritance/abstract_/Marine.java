package java8_3.ch07_inheritance.abstract_;

public class Marine extends Unit {


    public Marine(String name) {
        super(name);

    }

    @Override
    void move(int x, int y) {
        show();
        System.out.println(name + x+" " + y + "로 이동");
    }

    @Override
    void skill() {
        System.out.println(name + "이 총을 쏩니다.");
    }
}
