package java8_3.ch07_inheritance.abstract_;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Unit> units = new ArrayList<>();

        units.add(new Marine("마린"));
        units.add(new Tank("땡크"));
        units.add(new Dropship2("드랍쉽"));

        units.forEach(Unit::skill);

        for (Unit unit : units) {
            unit.move(10, 20);
        }
    }
}
