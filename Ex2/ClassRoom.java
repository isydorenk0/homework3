package Ex2;

import java.util.ArrayList;

public class ClassRoom {
    private ArrayList<Pupil> classRooms = new ArrayList<>();

    //public ClassRoom() {}
    public ClassRoom(Pupil pupil) {
        this.classRooms.add(pupil);
    }

    public ClassRoom(Pupil pupil, Pupil pupil1) {
        this(pupil);
        this.classRooms.add(pupil1);
    }

    public ClassRoom(Pupil pupil, Pupil pupil1, Pupil pupil2) {
        this(pupil, pupil1);
        this.classRooms.add(pupil2);
    }

    public void addPupil(Pupil pupil) {
        this.classRooms.add(pupil);
    }

    public static void main(String[] args) {
        ClassRoom classRooms = new ClassRoom(new ExcelentPupil(), new GoodPupil(), new ExcelentPupil());
        classRooms.addPupil(new BadPupil());
        for (Pupil pupil : classRooms.classRooms) {
            System.out.println(pupil);
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
        }
    }
}

