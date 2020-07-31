package hotelAtClass;

public class DeluxeRoom extends Room {
    private final double priceCoefficient = 1.3;
    private final double deLuxeTax = 50.0;

    public DeluxeRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrise() * priceCoefficient + deLuxeTax;
    }

    @Override
    public String toString() {
        return "DeluxeRoom{" +
                "priceCoefficient=" + priceCoefficient +
                ", deLuxeTax=" + deLuxeTax +
                '}';
    }
}
