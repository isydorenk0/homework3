package Ex6;

public class RedPrinter extends Printer {
    private static final String RED = "\u001B[31m";
    public void print(String value) {
        System.out.println(RED + value);
        resetColor();
    }
}
