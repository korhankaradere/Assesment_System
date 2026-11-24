package model;

public abstract class Examinations {
    private String title;
    private double maxMark;
    protected boolean isSuccesfull;

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

}
