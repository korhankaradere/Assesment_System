package model;

public class ProgrammingTest extends Examinations {
    public ProgrammingTest(){
        super("PROGRAMMING_TEST",100);
    }

    public boolean isExplanationSuccess(){
        return isSuccesfull;
    }
}

// final grade is the tests grade if explanation is successsfull