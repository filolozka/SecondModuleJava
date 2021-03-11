package hotel;

public class LuxRoom extends Room {
    String name = "Lux room";
    boolean booked = false;
    int metres = 50;
    int numberRooms = 2;
    private final double priceCoefficient = 2;

    public LuxRoom(String number, int capacity) {
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
        return "LuxRoom{" +
                "name='" + name + '\'' +
                ", numberRooms=" + numberRooms +
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
