package java8_3.ch07_inheritance.abstract_;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        final Marine marine = new Marine("마린");
        final Tank tank = new Tank("탱크");
        marine.show();
        tank.show();

        marine.move(1, 2);
        tank.move(5, 8);

        final Tank tank1 = new Tank("tank1");

        final Dropship2 dropship2 = new Dropship2("수송선");
        dropship2.move(10, 30);
        dropship2.skill();
        dropship2.skillTransport();
    }
}
