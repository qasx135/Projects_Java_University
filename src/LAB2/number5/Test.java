package LAB2.number5;

public class Test {
    public static void main(String[] args) {
        DogKennel dogKennel = new DogKennel(new Dog("Charli", 1),
                new Dog("James", 2), new Dog("Alf", 10));
        dogKennel.show();
    }
}
