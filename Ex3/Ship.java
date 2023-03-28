package Ex3;

public class Ship extends Vehicle {
    private String port;
    private int passengers;

    public Ship(Double price, int speed, int year, String port, int passengers) {
        super(price, speed, year);
        this.port = port;
        this.passengers = passengers;
    }

    public String getPort() {
        return port;
    }

    public int getPassengers() {
        return passengers;
    }

    @Override
    public String toString() {
        return "Ship: " +
                "price = " + getPrice() +
                ", speed = " + getSpeed() +
                ", year = " + getYear() +
                ", port='" + getPort() + '\'' +
                ", passengers=" + getPassengers() +
                ';';
    }
}
