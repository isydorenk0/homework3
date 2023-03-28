package Ex6;

public class BluePrinter extends Printer {
    private static final String BLUE = "\u001B[34m";
    public void print(String value) {
        System.out.println(BLUE + value);
        resetColor();
    }
}
