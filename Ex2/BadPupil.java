package Ex2;

public class BadPupil extends Pupil {
    void study() {
        System.out.println("Bad in reading");
    }
    void read(){
        System.out.println("Bad in reading");
    };
    void write(){
        System.out.println("Bad in writing");
    }
    void relax(){
        System.out.println("Bad in relaxing");
    }

    public String toString(){
        return "----- Bad pupil -----";
    }
}
