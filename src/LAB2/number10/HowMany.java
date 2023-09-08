package LAB2.number10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = in.nextLine();
        int count = 0;
        if (!line.isEmpty()) {
            count++;
            if (line.charAt(line.length() - 1) != ' ') {
                for (int i = 0; i < line.length();i++) {
                    if(line.charAt(i) == ' ') {
                        count++;
                    }
                }
            } else {
                for (int i = 0; i < line.length() - 1;i++) {
                    if(line.charAt(i) == ' ') {
                        count++;
                    }
                }
            }
        }
        System.out.print("You entered " + count + " words");
    }
}
