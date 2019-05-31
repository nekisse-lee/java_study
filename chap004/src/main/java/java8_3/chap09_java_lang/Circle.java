package java8_3.chap09_java_lang;

public class Circle implements Cloneable {

    Clone_Point p;
    double r;

    public Circle(Clone_Point p, double r) {
        this.p = p;
        this.r = r;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = null;
        obj = super.clone();
        Circle c = (Circle) obj;
        c.p = new Clone_Point(this.p.x, this.p.y);
        return obj;
    }

    @Override
    public String toString() {
        return "Circle{" +
            "p=" + p +
            ", r=" + r +
            '}';
    }
}
