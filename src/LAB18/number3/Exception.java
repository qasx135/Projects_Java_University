package LAB18.number3;

import java.util.Scanner;

public class Exception {
    public void exceptionDemo()
    {
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            try {
                System.out.println(2 / i);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Деление на 0");
            }
        }
        catch (NumberFormatException e)
        {
            System.out.println("Неверный ввод");
        }
    }
}
