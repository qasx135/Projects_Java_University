package LAB4_1.number1;

public class Shape {
    protected Double area = 0.0;
    protected Double perimeter = 0.0;
    protected String type;

    public Shape(String type) {
        this.type = type;
    }
    public Double getArea() {
        return area;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "From parent 'Shape' class !";
    }
}
