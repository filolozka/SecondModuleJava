package hotel;

public class DeluxeRoom extends Room {
    String name = "Deluxe room";
    boolean booked = false;
    int metres = 30;
    int numberRooms = 1;
    private final double priceCoefficient = 1.3;
    private final double deLuxeTax = 50.0;

    public DeluxeRoom(String number, int capacity) {
        super(number, capacity);
    }

    public int getMetres() {
        return metres;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public boolean getBooked() {
        return booked;
    }

    public int getNumberRooms() { return numberRooms; }

    @Override
    public String toString() {
        return "DeluxeRoom{" +
                "priceCoefficient=" + priceCoefficient +
                ", deLuxeTax=" + deLuxeTax +
                '}';
    }

    @Override
    public double getPrice() {
        return getBasePrise() * priceCoefficient + deLuxeTax;
    }

    @Override
    public void setNumberPeople(int numberPeople) {

    }

    @Override
    public int getNumberPeople() {
        return 0;
    }
}
