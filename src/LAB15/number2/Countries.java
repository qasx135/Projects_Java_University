package LAB15.number2;

import javax.swing.*;

public class Countries extends JFrame {
    String[] ct = { "Argentina", "China", "England", "Russia", "USA" };
    JComboBox cb = new JComboBox(ct);

    Countries(){
        super("JCOMBOBOX");
        setLayout(null);
        setSize(400,300);
        cb.setBounds(100,50,150,20);
        add(cb);
    }

    public static void main(String[] args) {
        new Countries().setVisible(true);
    }
}
