package LAB15.number1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FirstCalc extends JFrame implements ActionListener {
    private final JTextField tfResult;
    private double kq = 0;
    private String phep = "=";
    private boolean click = true;

    public FirstCalc() {
        setTitle("Calculator");
        setSize(400, 500);
        setLayout(new BorderLayout());

        tfResult = new JTextField("0");
        tfResult.setEditable(false);
        add(tfResult, "North");
        Panel panel = new Panel();
        panel.setLayout(new GridLayout(4, 4));
        String[] arr = {"7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"};
        for (String s : arr) {
            Button button = new Button(s);
            panel.add(button);
            button.addActionListener(this);
        }
        add(panel, "Center");

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if ('0' <= s.charAt(0) && s.charAt(0) <= '9'
                || s.equals(".")) {
            if (click) {
                tfResult.setText(s);
            } else {
                tfResult.setText(tfResult.getText() + s);
            }

            click = false;
        } else {
            if (click) {
                if (s.equals("-")) {
                    tfResult.setText(s);
                    click = false;
                } else {
                    phep = s;
                }
            } else {
                double x = Double.parseDouble(tfResult.getText());
                calculator(x);
                phep = s;
                click = true;
            }
        }
    }

    public void calculator(double n) {
        switch (phep) {
            case "+" -> kq += n;
            case "-" -> kq -= n;
            case "*" -> kq *= n;
            case "/" -> kq /= n;
            case "=" -> kq = n;
        }

        tfResult.setText(kq + "");
    }

    public static void main(String[] args) {
        new FirstCalc() .setVisible(true);
    }
}
