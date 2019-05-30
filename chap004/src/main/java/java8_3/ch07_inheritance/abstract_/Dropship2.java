package java8_3.ch07_inheritance.abstract_;

public class Dropship2 extends Dropship {

    public Dropship2(String name) {
        super(name);
    }

    @Override
    void move(int x, int y) {
        System.out.println(name + "의 현재위치 : " + x + ", " + y);
    }

    @Override
    void skill() {
        System.out.println(name + "이 유닛을 태웁니다.");
    }

    @Override
    void skillTransport() {
        System.out.println(name + "이 목적지에 운송을 시작합니다.");
    }
}
