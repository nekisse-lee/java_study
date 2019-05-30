package java8_3.ch07_inheritance.interface_.unitEx;

public class SCV extends GroundUnit implements Repairable {

    public SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r) {
        if (r instanceof Unit) {
            Unit u = (Unit) r;
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
        }
    }
}
