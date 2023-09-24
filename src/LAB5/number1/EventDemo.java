package LAB5.number1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventDemo {
    JLabel jlabone;
    JLabel jlabtwo;
    JLabel jlabres;
    JLabel jlabscore;
    JLabel jlabwinner;
    int scoreOne = 0;
    int scoreTwo = 0;
    String scorer = "N/A";
    String winner = "DRAW";

    EventDemo() {
        jlabone = new JLabel("AC Milan");
        jlabtwo = new JLabel("Real Madrid");
        jlabres = new JLabel("Result: " + scoreOne + " X " + scoreTwo);
        jlabscore = new JLabel("Last Scorer: " + scorer);
        jlabwinner = new JLabel("Winner: " + jlabwinner);
        JFrame jfrm = new JFrame("An Event Example");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(150, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton milan = new JButton("AC Milan");
        JButton madrid = new JButton("Real Madrid");
        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreOne += 1;
                scorer = "AC Milan";
                jlabres.setText("Result: " + scoreOne + " X " + scoreTwo);
                jlabscore.setText("Last Scorer: " + scorer);
                if (scoreOne > scoreTwo) {
                    winner = "AC Milan";
                } else if (scoreOne < scoreTwo) {
                    winner = "Real Madrid";
                } else {
                    winner = "DRAW";
                }
                jlabwinner.setText("Winner: "+ winner);
            }
        });
        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                scoreTwo += 1;
                scorer = "Real Madrid";
                jlabres.setText("Result: " + scoreOne + " X " + scoreTwo);
                jlabscore.setText("Last Scorer: " + scorer);
                if (scoreOne > scoreTwo) {
                    winner = "AC Milan";
                } else if (scoreOne < scoreTwo) {
                    winner = "Real Madrid";
                } else {
                    winner = "DRAW";
                }
                jlabwinner.setText("Winner: "+ winner);
            }
        });
        jfrm.add(milan);
        jfrm.add(madrid);
        jfrm.add(jlabres);
        jfrm.add(jlabscore);
        jfrm.add(jlabwinner);
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new EventDemo();
            }
        });
    }
}
