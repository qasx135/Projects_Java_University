package LAB2.number3;

public class Tester {
    final private int len;
    final private Circle[] mas;

    public Tester() {
        this.len = 10;
        mas = new Circle[len];
        for (int i = 1; i <= mas.length; i++) {
            mas[i] = new Circle(i, i+ 1, i*i);
        }
    }
}
