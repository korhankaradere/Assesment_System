package model;

public abstract class Examinations {
    private String title;
    private double maxMark;
    protected boolean isSuccesfull;
    private double assesmentMark;

    public Examinations(String title, double maxMark){
        this.title = title;
        this.maxMark = maxMark;
    }
    private boolean isExplanationSucess() {
        return true;
    }
    public boolean isForMasters() {
        return false;
    }

    public double calculateAssesmentMark(){}

}

//class was called Examinations instead of Assesment or Assesments to avoid any conflicts with assesments package