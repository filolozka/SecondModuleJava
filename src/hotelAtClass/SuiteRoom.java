package hotelAtClass;

public class SuiteRoom extends Room {
    private final double priceCoefficient = 1.2;

    public SuiteRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrise() * priceCoefficient;
    }

    @Override
    public String toString() {
        return "SuiteRoom{" +
                "price=" + getBasePrise() * priceCoefficient +
                '}';
    }
}
