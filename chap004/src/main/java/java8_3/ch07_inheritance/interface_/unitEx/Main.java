package java8_3.ch07_inheritance.interface_.unitEx;

public class Main {

    public static void main(String[] args) {
        final Tank tank = new Tank();
        final Marine marine = new Marine();
        final SCV scv = new SCV();

        scv.repair(tank);
//        scv.repair(marine);
        scv.repair(scv);
    }


}
