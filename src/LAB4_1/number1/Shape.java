package LAB4_1.number1;

public class Shape {
    private double area;
    private double perimeter;
    private String type;

    public Shape(String type) {
        this.type = type;
    }
    public double getArea() {
        return 0.0;
    }

    public double getPerimeter() {
        return 0.0;
    }

    public String getType() {
        return this.type;
    }

    public String toString() {
        return "From parent 'Shape' class !";
    }
}
