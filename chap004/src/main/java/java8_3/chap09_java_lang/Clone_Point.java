package java8_3.chap09_java_lang;

public class Clone_Point implements Cloneable {
    int x;
    int y;

    public Clone_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Clone_Point{" +
            "x=" + x +
            ", y=" + y +
            '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
