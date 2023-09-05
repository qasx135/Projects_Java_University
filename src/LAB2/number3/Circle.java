package LAB2.number3;

public class Circle {
    Point center;
    double radius;

    public Circle(double x, double y, double radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }


    public void length() {
        System.out.println("The length of circle: "+2*3.14*radius);
    }
    public void square() {
        System.out.println("The square of circle: " + 3.14*radius*radius);
    }

    @Override
    public String toString() {
        return "Coordinates of center: X= "
                + center.toString();
    }
}
