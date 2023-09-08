package LAB2.number9;

import java.util.Scanner;

public class TestPoker {
    public static void main(String[] args) {
        Poker poker = new Poker();
        Scanner in = new Scanner(System.in);
        int x;
        System.out.print("Enter number of persons: ");
        x = in.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println(poker.formDeck());
        }
    }
}
