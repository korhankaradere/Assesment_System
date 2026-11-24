package model;
import java.util.ArrayList;
import model.Examinations;

public class Manager {
    private final ArrayList<Examinations> exams = new ArrayList<>();
    String[] students= AssesmentFeed.getStudentName()

    public void addExams(Examinations stus){
        exams.add(stus);
    }
}
