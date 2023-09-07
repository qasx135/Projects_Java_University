package LAB2.number4;

public class Shop implements ShopInterface{

    private Computer[] computers;
    private int count = 5;
    private int countComputers = 0;

    public Shop(int count) {
        computers = new Computer[count];
    }

    @Override
    public void addPc(String namePc, int numberPc) {

        if (countComputers == count) {
            Computer[] newComputers = new Computer[count*2];
            count += 1;
            System.arraycopy(computers, 0, newComputers, 0, computers.length);
            computers = newComputers;
            computers[countComputers] = new Computer(namePc, numberPc);
            countComputers += 1;
        } else {
            computers[countComputers] = new Computer(namePc, numberPc);
            countComputers += 1;
        }
    }

    @Override
    public void delPCByNumber(int number) {
        for (int i = 0; i < computers.length; i++) {
            if((computers[i].number) == number && i != computers.length - 1) {
                for (int j = i; j < computers.length - 1; j++) {
                    computers[j] = computers[j + 1];
                }
                break;
            } if ((computers[i].number) == number && i == computers.length - 1) {
                computers[i] = null;
                break;
            }

        }
    }

    @Override
    public String findPcByName(String namePc) {
        for (int i = 0; i < computers.length; i++) {
            if((computers[i].name).equals(namePc)) {
                return "Found PC with index: " + (i + 1);
            }
        }
        return "PC didn't found in the store";
    }

    @Override
    public String findPcByNumber(int numberPc) {
        for (int i = 0; i < computers.length; i++) {
            if((computers[i].number) == numberPc) {
                return "Found PC with index: " + (i + 1);
            }
        }
        return "PC didn't found in the store";
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        for (Computer computer : computers) {
            if(computer != null)
                System.out.println(computer.name + " : " + computer.name);
            else
                break;
        }
        return null;
    }
}
