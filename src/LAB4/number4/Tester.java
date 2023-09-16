package LAB4.number4;

public class Tester {
    public static void main(String[] args) {
        Computer[] c = new Computer[4];
        c[0] = new Computer(Names.HP, new Processor(Processors.AMD), new Memory(Names.SAMSUNG), new Monitor(Names.HP));
        c[1] = new Computer(Names.ASUS, new Processor(Processors.INTEL), new Memory(Names.ASUS), new Monitor(Names.ASUS));
        c[2] = new Computer(Names.MSI, new Processor(Processors.INTEL), new Memory(Names.ASUS), new Monitor(Names.MSI));
        c[3] = new Computer(Names.SAMSUNG, new Processor(Processors.INTEL), new Memory(Names.SAMSUNG), new Monitor(Names.SAMSUNG));

        for (Computer comp : c) {
            System.out.println(comp.toString());
        }
    }
}
