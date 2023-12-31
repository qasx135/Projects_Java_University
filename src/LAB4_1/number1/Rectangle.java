package LAB4_1.number1;

public class Rectangle extends Shape{

    private Double a;
    private Double b;
    public Rectangle(String type, Double a, Double b) {
        super(type);
        this.a = a;
        this.b = b;
        this.area = a * b;
        this.perimeter = 2 * (a + b);
    }

    @Override
    public Double getArea() {
        return super.getArea();
    }

    @Override
    public Double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public String toString() {
        return "From child class Rectangle !";
    }
}
