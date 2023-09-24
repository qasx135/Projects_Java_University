package LAB8.number1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Class {
    public static void main(String[] args) {
        StringBuilder sr = mass(7, new StringBuilder());
        System.out.println(sr.reverse());
    }

    public static StringBuilder mass(int n, StringBuilder s) {
        int j = 0;
        if (n == 0) {
            return new StringBuilder();
        } else {
            j = n;
            for (int i = 0; i < n; i++) {
                s.append(j).append(' ');
            }
        }
        mass(--n, s);
        return s;
    }
}
