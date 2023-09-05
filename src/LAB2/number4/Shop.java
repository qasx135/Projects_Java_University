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
        countComputers += 1;
        if (countComputers == count) {
            Computer[] newComputers = new Computer[count*2];
            System.arraycopy(computers, 0, newComputers, 0, computers.length);
            computers = newComputers;
        }
    }

    @Override
    public String findPcByName(String namePc) {
        return null;
    }

    @Override
    public String findPcByNumber(int numberPc) {
        return null;
    }
}
