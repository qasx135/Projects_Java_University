package LAB3.Formating.number3;

public class Test {
    public static void main(String[] args) {
        Employee[] emparray = new Employee[5];
        emparray[0] = new Employee("Jhon", 111000.0);
        emparray[1] = new Employee("Michael", 22200.0);
        emparray[2] = new Employee("Ark", 11823470.21312);
        emparray[3] = new Employee("Daniel", 909090.345);
        emparray[4] = new Employee("Jame", 3842345345.234);
        Report.info(emparray);
    }
}
