package LAB2.number5;

public class DogKennel {
    Dog[] kennel;
    public DogKennel(Dog...dogs) {
        kennel = new Dog[dogs.length];
        System.arraycopy(dogs, 0, kennel, 0, dogs.length);
    }
    public void show() {
        for (Dog dog : kennel) {
            System.out.println(dog.toString());
        }
    }
}
