package LAB3.RandomAndMath.number2;

public class Point {
    final private int x;
    final private int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "X: " + x +
                " Y: " + y;
    }
}
