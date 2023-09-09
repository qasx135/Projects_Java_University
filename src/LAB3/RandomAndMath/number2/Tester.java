package LAB3.RandomAndMath.number2;

import java.util.Random;

public class Tester {

    private Circle[] mas;
    private final int size;

    public Tester() {
        Random random = new Random();
        int size = random.nextInt(1, 100);
        this.size = size;
        this.mas = new Circle[size];
        for (int i = 0; i < size; i++) {
            mas[i] = new Circle(random.nextInt(-100, 100), random.nextInt(-100, 100));
        }
    }

    public int getSize() {
        return size;
    }

    public String showSmallest() {
        int s = 100000000;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (mas[i].getRadius() < s) {
                index = i;
                s = mas[i].getRadius();
            }
        }
        return mas[index].toString();
    }

    public String showBiggest() {
        int s = 0;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (mas[i].getRadius() > s) {
                index = i;
                s = mas[i].getRadius();
            }
        }
        return mas[index].toString();
    }
    public void sortCircles() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (mas[j].getRadius() >= mas[j + 1].getRadius()) {
                    Circle tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
    }
    public void show() {
        for (Circle c : mas) {
            System.out.println("Circle{" + c.toString() + "}");
        }
    }
}
