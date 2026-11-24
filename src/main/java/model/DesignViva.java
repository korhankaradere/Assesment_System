package model;

public class DesignViva extends Examinations {
    public DesignViva(){
        super("DESIGN_VIVA",100);
    }
    @Override
    public boolean isForMasters() {
        return true;
    }
}
