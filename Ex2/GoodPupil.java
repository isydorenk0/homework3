package Ex2;

public class GoodPupil extends Pupil {

    void study() {
        System.out.println("Good in reading");
    }
    void read(){
        System.out.println("Good in reading");
    };
    void write(){
        System.out.println("Good in writing");
    }
    void relax(){
        System.out.println("Good in relaxing");
    }

    public String toString(){
        return "----- Good pupil -----";
    }
}
