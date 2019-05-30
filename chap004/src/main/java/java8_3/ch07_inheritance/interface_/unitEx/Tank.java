package java8_3.ch07_inheritance.interface_.unitEx;

public class Tank extends GroundUnit implements Repairable {

    public Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    @Override
    public String toString() {
        return "Tank";
    }
}
