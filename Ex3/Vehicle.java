package Ex3;

public class Vehicle {
    private Double price;
    private int speed;
    private int year;

    public Vehicle(Double price, int speed, int year) {
        this.price = price;
        this.speed = speed;
        this.year = year;
    }

    public Double getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getYear() {
        return year;
    }
}
