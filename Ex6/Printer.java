package Ex6;

public class Printer {
    private static final String RESET = "\u001B[0m";
    void print(String value){
        System.out.println(value);
        resetColor();
    }
    void resetColor(){
        System.out.print(RESET);
    }
}
