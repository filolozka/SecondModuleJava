package hotel;

abstract public class Room {
    private String number;
    private int numberPeople;
    private int metres;
    private int capacity;
    private final double basePrise = 100.0;

    public Room(String number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getBasePrise() {
        return basePrise;
    }

    @Override
    public String toString() {
        return "Room №" + number;
    }

    public abstract double getPrice();

    abstract public void setNumberPeople(int numberPeople);
    abstract public int getNumberPeople();
}
