package LAB4_1.number1;

public class Square extends Shape{
    private Double a;
    public Square(String type, Double a) {
        super(type);
        this.a = a;
        this.perimeter = 4 * a;
        this.area = a * a;
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
        return "From child class Square !";
    }
}
