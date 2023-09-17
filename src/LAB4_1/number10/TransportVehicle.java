package LAB4_1.number10;

public abstract class TransportVehicle {
    protected int speed;
    protected int FuelPerHour;
    protected int amountPassenger;
    protected int amountFuelPerHour;

    public TransportVehicle(int speed, int amountFuel, int amountPassenger, int amountFuelPerHour) {
        this.speed = speed;
        this.FuelPerHour = amountFuel;
        this.amountPassenger = amountPassenger;
        this.amountFuelPerHour = amountFuelPerHour;
    }

    public abstract int costOftrip(int dest);
}
