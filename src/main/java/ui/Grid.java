package ui;

import assesments.AssessmentFeed;
import model.Manager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Grid {
    private final JFrame frame = new JFrame("Children's Wing Monitor");
    private final JLabel[] labels;

    public Grid(){
        labels = new JLabel[4];
        frame.setLayout(new GridLayout(4, 1, 7, 3));
        for (int i = 0; i < labels.length; i++) {
            JPanel cell = new JPanel(new BorderLayout());
            cell.setBorder(BorderFactory.createLineBorder(Color.GRAY));
            labels[i] = new JLabel("", SwingConstants.CENTER);
            labels[i].setOpaque(true);
            labels[i].setBackground(Color.WHITE);
            cell.add(labels[i], BorderLayout.CENTER);
            frame.add(cell);
        }
        frame.setSize(1100, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void refresh(Manager manager) {   // this method is for the module leader
        for (int i = 0; i < 4; i++) {
            labels[i].setText("<html><center><b>" + AssessmentFeed.getStudentName() + "</b>"
                    + "<br>Results:" + String.format("%.2f", AssessmentFeed.getResult()) + " C"
                    + "<br> cid" +AssessmentFeed.getCIDs() + " C"
                    + "<br> type" +AssessmentFeed.getStudentType() + " C");
        }
    }
    }
