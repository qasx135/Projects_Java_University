package LAB2.number2;

public class Ball {
    private double x = 0.0;
    private double y = 0.0;

    public Ball() {

    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp) {
        this.y += yDisp;
        this.x += xDisp;
    }

    @Override
    public String toString() {
        return "Coordinates of the ball: X= " + x +
                ", Y= " + y;
    }
}
