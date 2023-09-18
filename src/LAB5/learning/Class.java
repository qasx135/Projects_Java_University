package LAB5.learning;

import javax.swing.*;
import java.awt.*;

public class Class {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Labels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        JLabel label = new JLabel("I'm a label", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
