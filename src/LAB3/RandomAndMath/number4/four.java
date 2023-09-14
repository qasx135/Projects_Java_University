package LAB3.RandomAndMath.number4;

import java.util.*;
import java.util.regex.Pattern;

public class four {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String regex = "[0-9]*";
        String line;
        do {
            System.out.print("Введите число: ");
            line = in.nextLine();
        }while(!Pattern.matches(regex, line));
        int n = Integer.parseInt(line);
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
