package thisisjava.sec06.exam02_reflection;

public class Car {

    private String model;
    private String owner;

    public Car() {
    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String owner) {
        this.model = model;
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    private void setOwner(String owner) {
        this.owner = owner;
    }
}
