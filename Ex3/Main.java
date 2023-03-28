package Ex3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(1_000_000_000.00, 951, 2023, 105.55, 100);
        Car car = new Car(45_354.55, 250, 2022);
        Ship ship = new Ship(564_564.56, 150, 2021, "Odessa", 50);
        System.out.println(car);
        System.out.println(plane);
        System.out.println(ship);
    }
}
