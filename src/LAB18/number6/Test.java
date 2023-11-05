package LAB18.number6;

public class Test {
    public static void main(String[] args)
    {
        Exception throwsDemo = new Exception();
        throwsDemo.printMessage(null);

        throwsDemo.printMessage("0");
        throwsDemo.getDetails("0");
    }
}
