package model;

public class ProgrammingTest extends Examinations {
    private double programMark;
    private double finalPercentage;
    public ProgrammingTest(){
        super("PROGRAMMING_TEST",100);
    }

    public boolean isExplanationSuccess(){
        return isSuccesfull;
    }

    public double calculateAssesmentMark(double programMark) {
        if (isExplanationSuccess()) {
            double finalPercentage = programMark;
        } else if  (programMark<40) {
            double finalPercentage = programMark;
        } else {
            double finalPercentage = 40;
        }
        return finalPercentage;
    }
}

// final grade is the tests grade if explanation is successsfull