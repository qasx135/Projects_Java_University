package LAB3.RandomAndMath.number4;

import LAB3.RandomAndMath.number3.Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex = "[0-9]*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        String line;
        do {
            System.out.print("Введите число: ");
            line = in.nextLine();
            matcher = pattern.matcher(line);
        }while(!Pattern.matches(regex, line));
        Integer n = Integer.parseInt(line);
        Integer[] mas = new Integer[n];
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mas[i] = random.nextInt(0, n + 1);
        }
        for (int c : mas) {
            System.out.print(c + " ");
            if (c % 2 == 0) {
                list.add(c);
            }
        }
        System.out.println("\n");
        if(!list.isEmpty()) {
            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }
    }
}
