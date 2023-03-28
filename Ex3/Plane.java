package Ex3;

public class Plane extends Vehicle {
    private Double height;
    private int passengers;

    public Plane(Double price, int speed, int year, Double height, int passengers) {
        super(price, speed, year);
        this.height = height;
        this.passengers = passengers;
    }

    public Double getHeight() {
        return height;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Plane: " +
                "price = " + getPrice() +
                ", speed = " + getSpeed() +
                ", year = " + getYear() +
                ", height = " + getHeight() +
                ", passengers = " + getPassengers() +
                ';';
    }
}
