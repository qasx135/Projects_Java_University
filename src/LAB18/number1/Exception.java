package LAB18.number1;

public class Exception {
    public void exceptionDemo() {
        try {
            System.out.println(2 / 0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Деление на ноль?");
        }
    }
}
