package java8_3.ch07_inheritance.abstract_;

public class Tank extends Unit {
    public Tank(String name) {
        super(name);
    }

    @Override
    void move(int x, int y) {
        show();
        System.out.println(name + x+" " + y + "로 이동");
    }

    @Override
    void skill() {
        System.out.println(name+ "이 포를 발사합니다.");
    }
}
