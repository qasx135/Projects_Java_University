package LAB12.number2;

import javax.swing.*;
import java.awt.*;

public class Executable extends JFrame {
    private int width = 450;
    private int height = 450;

    private Image img;
    Executable() {
        setSize(width, height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public void imageLoad(String path) {
        img = new ImageIcon(path).getImage();
    }
    public void drawIcon() {
        Graphics g = getGraphics();
        g.drawImage(img, 0, 0, width, height, null);
    }
    public static void main(String[] args) {
        Executable test = new Executable();
        test.imageLoad("C:/Users/qasx1/Pictures/Anime/umbrella.jpg");
        test.drawIcon();
    }
}
