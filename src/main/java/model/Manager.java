package model;
import java.util.ArrayList;

import assesments.AssessmentFeed;
import model.Examinations;

public class Manager {
    private final ArrayList<Examinations> exams = new ArrayList<>();
    private final AssessmentFeed feed = new AssessmentFeed();

    public void addExams(Examinations stus){
        exams.add(stus);
    }

    public void calculateOverallWeighted(){
        if(AssessmentFeed.getStudentType());

    }

    public void calculateOverallUnweighted(){

    }


    public String printLog (feed) {    // this method is for the module administrator
        System.out.println("Information for this Student is" + studentname)
    }
}
