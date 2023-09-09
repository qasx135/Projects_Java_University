package LAB3.RandomAndMath.number2;

import java.util.Random;

public class Circle {
    private Point point;
    private int radius;
    public Circle (int x, int y) {
        this.point = new Point(x, y);
        Random ran = new Random();
        this.radius = ran.nextInt(1, 200);
    }

    public int getRadius() {
        return radius;
    }

    private String showCenter() {
        return point.toString();
    }

    @Override
    public String toString() {
        return "radius: " + getRadius() +
                ", center: " + showCenter();
    }
}
