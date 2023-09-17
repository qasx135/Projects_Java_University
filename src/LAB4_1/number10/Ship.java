package LAB4_1.number10;

public class Ship extends TransportVehicle {
    public Ship(int speed, int amountFuel, int amountPassenger, int st) {
        super(speed, amountFuel, amountPassenger, st);
    }

    @Override
    public int costOftrip(int dest) {
        return dest / speed * amountFuelPerHour;
    }
}
