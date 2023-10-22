package LAB12.number1;

import java.awt.*;

public class Shape {
    protected Color color;
    protected int x;
    protected int y;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
