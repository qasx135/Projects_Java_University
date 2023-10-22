package LAB12.number1;

import javax.swing.*;
import java.awt.*;

public class Figures extends JFrame {
    Figures() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1080, 1080);
        setVisible(true);
    }

    public Shape randomShape() {
        int rand = (int) (Math.random() * 3);
        if (rand == 0) {
            return new Circle();
        } else if (rand == 1) {
            return new Rectangle();
        } else {
            return new Square();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        int x = 10;
        for (int i = 0; i < 15; i++, x+= 100) {
            int y = 20;
            for (int j = 0; j < 10; j++, y+= 90) {
                int red = (int)(Math.random() * 255);
                int green = (int)(Math.random() * 255);
                int blue = (int)(Math.random() * 255);

                Shape ns = randomShape();
                ns.setXY(x, y);
                ns.setColor(new Color(red, green, blue));

                g.setColor(ns.getColor());
                if (ns.getClass().getSimpleName().equals("Circle")) {
                    g.fillOval(ns.getX(), ns.getY(), 100, 100);
                } else if (ns.getClass().getSimpleName().equals("Square")) {
                    g.fillRect(ns.getX(), ns.getY(), 100, 100);
                } else if (ns.getClass().getSimpleName().equals("Rectangle")) {
                    g.fillRect(ns.getX(), ns.getY(), 100, 60);
                }
            }
        }
    }

    public static void main(String[] args) {
        Figures f = new Figures();
    }
}

