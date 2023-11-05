package LAB17.number2;

import java.util.Scanner;

public class EmployeeView {
    public static Scanner in = new Scanner(System.in);

    public void showMessage(String msg){
        System.out.println("Salary for weak: " + msg);
    }

    public EmployeeModel getEmployeeInfo(){
        EmployeeModel employee = new EmployeeModel();
        System.out.print("Enter name: ");
        employee.setName(in.nextLine());
        System.out.print("Enter number of working days: ");
        employee.setNumberOfWorkingDays(in.nextInt());
        System.out.print("Enter number of salary: ");
        employee.setSalary(in.nextLong());
        return employee;
    }

}
