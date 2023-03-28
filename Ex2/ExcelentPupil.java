package Ex2;

public class ExcelentPupil extends Pupil {
    @Override
    void study() {
        System.out.println("Excellent in reading");
    }
    void read(){
        System.out.println("Excellent in reading");
    };
    void write(){
        System.out.println("Excellent in writing");
    }
    void relax(){
        System.out.println("Excellent in relaxing");
    }

    public String toString(){
       return "----- Excellent pupil -----";
    }
}
