package Ex3;

public class Car extends Vehicle {
    public Car(Double price, int speed, int year) {
        super(price, speed, year);
    }

    @Override
    public String toString() {
        return "Car: " +
                "price = " + getPrice() +
                ", speed = " + getSpeed() +
                ", year = " + getYear() +
                ';';
    }
}
