package LAB4_1.number1;

public class Circle extends Shape{

    private double radius;
    private final double area;

    public Circle(String type, double radius) {
        super(type);
        this.radius = radius;
        this.area = 3.14 * radius * radius;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String toString() {
        return "From child class Circle !";
    }
}
