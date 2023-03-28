package Ex6;

public class GreenPrinter extends Printer {
    private static final String GREEN = "\u001B[32m";
    public void print(String value) {
        System.out.println(GREEN + value);
        resetColor();
    }
}
