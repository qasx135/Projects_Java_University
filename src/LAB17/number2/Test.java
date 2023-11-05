package LAB17.number2;

public class Test {
    public static void main(String[] args) {
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(view);
        System.out.println(controller.getSalaryMonth());
    }
}
