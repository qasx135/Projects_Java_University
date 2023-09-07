package LAB2.number6;

public class Circle {
    private double radius;
    private String name;

    public Circle(double radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double square() {
        return 3.14 * radius * radius;
    }

    public double circumferenceLength() {
        return 2 * 3.14 * radius;
    }
    public void compare(Circle obj) {
        if (this.radius > obj.radius) {
            System.out.println("Square of " + getName() + " > " + "square of " + obj.getName());
            System.out.println("Circumference of " + getName() + " > " + "circumference of " + obj.getName());
        } else if (this.radius < obj.radius) {
            System.out.println("Square of " + getName() + " < " + "square of " + obj.getName());
            System.out.println("Circumference of " + getName() + " < " + "circumference of " + obj.getName());
        } else {
            System.out.println("Square of " + getName() + " = " + "square of " + obj.getName());
            System.out.println("Circumference of " + getName() + " = " + "circumference of " + obj.getName());
        }
    }

    @Override
    public String toString() {
        return "Radius of " + getName() + ": " + getRadius() +
                ", square of " + getName() + ": " + square() +
                ", circumference of " + getName() + ": " + circumferenceLength();

    }
}
