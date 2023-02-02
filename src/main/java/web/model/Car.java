package web.model;

public class Car {
    private String owner;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String owner, String model, int year) {
        this.owner = owner;
        this.model = model;
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Машина: " + model + ", " + year + ", владелец - " + owner;
    }
}
