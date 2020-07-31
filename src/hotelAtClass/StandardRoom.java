package hotelAtClass;

public class StandardRoom extends Room {
    private final double priceCoefficient = 1.0;


    public StandardRoom(String number, int capacity) {
        super(number, capacity);
    }

    @Override
    public double getPrice() {
        return getBasePrise() * priceCoefficient;
    }

    @Override
    public String toString() {
        return "StandardRoom{" + getNumber() +
                "price=" + getBasePrise() * priceCoefficient +
                '}';
    }
}
