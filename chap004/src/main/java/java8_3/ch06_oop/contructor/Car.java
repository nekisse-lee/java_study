package java8_3.ch06_oop.contructor;

public class Car {

    String color;
    String gearType;
    int door;

    public Car() {
        this("white", "auto", 10);

    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    private Car(Car car) {
        this(car.color, car.gearType, car.door);
    }


    @Override
    public String toString() {
        return "Car{" +
            "color='" + color + '\'' +
            ", gearType='" + gearType + '\'' +
            ", door=" + door +
            '}';
    }



    public static void main(String[] args) {
        final Car car = new Car();
        car.color = "red";
        car.door = 2;
        car.gearType = "auto";
        System.out.println("car = " + car);
        System.out.println("car.toString() = " + car.toString());

        final Car car1 = new Car("blue", "auto", 5);
        System.out.println("car1 = " + car1);


        final Car car2 = new Car();
        System.out.println("car2 = " + car2);

        final Car cloneCar2 = new Car(car2);
        System.out.println("cloneCar2 = " + cloneCar2);

        car2.color = "blue";
        System.out.println("car2 = " + car2);
        System.out.println("cloneCar2 = " + cloneCar2);
    }

}
