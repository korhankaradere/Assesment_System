package model;

public class ProgrammingProject extends Examinations {
    private double functionality;
    private double verification;
    private double finalPercentage;

    public ProgrammingProject(){
        super("AI_PROJECT",100.0);
    }

    public double calculateAssesmentMark(double functionality, double verification){
        double finalPercentage = 0.4 * functionality + 0.6 * verification;
        return finalPercentage;
    }
}
