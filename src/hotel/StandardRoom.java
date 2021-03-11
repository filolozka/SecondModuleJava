package hotel;

public class StandardRoom extends Room {
    private String name = "Standard room";
    private boolean booked;
    int metres = 20;
    int numberRooms = 1;
    private final double priceCoefficient = 1.0;

    public StandardRoom(String number, int capacity) {
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

    public int getNumberRooms() {
        return numberRooms;
    }

    @Override
    public String toString() {
        return "StandardRoom{" + getNumber() +
                "price=" + getBasePrise() * priceCoefficient +
                '}';
    }

    @Override
    public double getPrice() {
        return getBasePrise() * priceCoefficient;
    }

    @Override
    public void setNumberPeople(int numberPeople) {

    }

    @Override
    public int getNumberPeople() {
        return 0;
    }
}
