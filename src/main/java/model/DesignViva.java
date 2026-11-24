package model;

public class DesignViva extends Examinations {
    private double explanation;
    private double designUnderstanding;
    private double finalPercentage;

    public DesignViva(){
        super("DESIGN_VIVA",100);
    }
    @Override
    public boolean isForMasters() {
        return true;
    }

    public double calculateAssesmentMark(double explanation, double designUnderstanding){
        double finalPercentage = 0.5 * explanation + 0.5 * designUnderstanding;
        return finalPercentage;
    }

}
