package Ex6;

public class Main {
    public static void main(String[] args) {

        RedPrinter redPrinter = new RedPrinter();
        redPrinter.print("This is red text");
        GreenPrinter greenPrinter = new GreenPrinter();
        greenPrinter.print("This is green text");
        BluePrinter bluePrinter = new BluePrinter();
        bluePrinter.print("This is blue text");

        System.out.println("This is white text");
    }
}
