package LAB4_1.number1;

public class Tester {
    public static void main(String[] args) {
        Shape[] figures = new Shape[3];
        figures[0] = new Circle("Круг", 13.0);
        figures[1] = new Rectangle("Прямоугольник", 12.0, 5.5);
        figures[2] = new Square("Квадрат", 45.0);
        for (Shape s : figures) {
            System.out.println(s.toString() + " " + s.getArea());
        }
    }
}
