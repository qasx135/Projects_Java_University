package LAB3.RandomAndMath.number3;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] mas = new int[4];
        for (int i = 0; i < 4; i++) {
            mas[i] = ran.nextInt(10, 100);
        }
        boolean flag = true;
        int tmp = 0;
        for (int c : mas) {
            System.out.print(c + " ");
            if (c < tmp) {
                flag = false;
            }
            tmp = c;
        }
        if (flag) {
            System.out.println("\nПоследовательность строго возрастающая");
        } else {
            System.out.println("\nПоследовательность не строго возрастающая");
        }
    }
}
