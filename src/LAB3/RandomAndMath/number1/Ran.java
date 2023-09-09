package LAB3.RandomAndMath.number1;

import java.util.Random;

public class Ran {
    public static void main(String[] args) {
        Random rand = new Random();
        int size = rand.nextInt(1, 100);
        Double[] mas = new Double[size];
        for (int i = 0; i < size; i++) {
            mas[i] = Math.random();
        }
        for (int i=0; i < size; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println("\n"+size);
    }
}
