package LAB4_1.number1;

public class Circle extends Shape{

    private Double radius;

    public Circle(String type, Double radius) {
        super(type);
        this.radius = radius;
        this.area = 3.14 * radius * radius;
    }

    @Override
    public Double getArea() {
        return area;
    }

    @Override
    public Double getPerimeter() {
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
