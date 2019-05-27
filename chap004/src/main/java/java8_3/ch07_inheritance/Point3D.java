package java8_3.ch07_inheritance;

public class Point3D extends Point {
    private int z;



    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    @Override
    String getLocation() {
//        return "x : " + x + "y : " + y + "z : " + z;
        return super.getLocation()+ ", z : " + z;
    }

    public static void main(String[] args) {
        System.out.println(new Point3D().getLocation());
    }
}
