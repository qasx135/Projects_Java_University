package LAB1;

import java.util.Scanner;

public class lab1 {
    public static void exercise1() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a length of array: ");
        int length = in.nextInt();
        int sum = 0;
        int[] mas = new int[length];
        for (int i = 0; i < mas.length; i ++) {
            int k = in.nextInt();
            mas[i] = k;
        }
        for (int ma : mas) {
            sum += ma;
        }

        System.out.println("Sum: " + sum + "\n" + "Average: " + (double)sum / (double)length );
    }

    public static void exercise2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a length of array: ");
        int length = in.nextInt();
        int[] mas = new int[length];
        int sum = 0;
        int min = 1000000000;
        int max = 0;
        System.out.print("Enter elements of array: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = in.nextInt();
        }
        int index = 0;
        do {
            sum += mas[index];
            if (mas[index] > max) {
                max = mas[index];
            }
            if (mas[index] < min) {
                min = mas[index];
            }
            index++;
        } while (index < mas.length);
        System.out.println("Sum: " + sum +
                "\n" + "Min: " + min +
                "\n" + "Max: " + max);
    }

    public static void exercise3(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }

    public static void exercise4() {
        System.out.print(1 + " ");
        for (int i = 2; i < 10; i++) {
            System.out.print(1 + "/" + (i) + " ");

        }
    }

    public static void exercise5(int n) {
        int k;
        k = Factorial.factorial(n);
        System.out.println("LAB1.Factorial is : " + k);
    }
}
