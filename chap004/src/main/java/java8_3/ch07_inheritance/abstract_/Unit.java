package java8_3.ch07_inheritance.abstract_;

abstract class Unit {
    private int x, y;

    String name;

    public Unit(String name) {
        this.name = name;
        System.out.println("생성된 유닛 :  " + name + "   현재 위치 : " + x + ", "+ y);
    }

    abstract void move(int x, int y);

    void show() {
        System.out.println("현재 위치 x = " + x + " y = " + y);
    }

    abstract void skill();

    void stop() {
        System.out.println("정지 ");
    }

}
