package LAB2.number5;

public class Dog {
    private String name;
    private double age;

    public Dog(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void toAge() {
        System.out.println("The dog's age: " + getAge() + ", to human: " + getAge()*7);
    }

    @Override
    public String toString() {
        return "Dog's name: " + getName() +
                ", Dog's age: " + getAge();
    }
}
