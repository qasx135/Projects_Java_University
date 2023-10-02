package LAB9_10;

public class Student implements Comparable {
    private int number;
    private String name;
    private double gpa;

    public Student(int number, String name, double gpa) {
        this.number = number;
        this.name = name;
        this.gpa = gpa;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student obj) {
        String name1 = this.getName();
        String name2 = obj.getName();
        for (int i = 0; i < name1.length() && i < name2.length(); i++) {
            if (name1.charAt(i) == name2.charAt(i)) {
                continue;
            } else {
                return name1.charAt(i) < name2.charAt(i) ? 1 : 0;
            }
        }
        return -1;
    }
}
