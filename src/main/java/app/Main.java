package app;
import model.DesignViva;
import model.Manager;
import model.ProgrammingProject;
import model.ProgrammingTest;
import ui.Grid;
import assesments.AssessmentFeed;

import javax.swing.*;

/
public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Manager manager = new Manager();
            manager.addExams(new ProgrammingProject());
            manager.addExams(new ProgrammingTest());
            manager.addExams(new DesignViva());

            Grid grid = new Grid();
            grid.refresh(manager);

        });
    }
}