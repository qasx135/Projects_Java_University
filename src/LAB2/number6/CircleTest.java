package LAB2.number6;

public class CircleTest {
    public static void main(String[] args) {
        Circle c = new Circle(20, "circle1");
        Circle b = new Circle(10, "circle2");
        String info1 = c.toString();
        System.out.println(info1);
        c.compare(b);
    }
}
