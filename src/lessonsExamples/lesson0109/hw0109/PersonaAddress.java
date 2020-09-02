package lessonsExamples.lesson0109.hw0109;

import java.util.Objects;

public class PersonaAddress {
    private AddressType type;
    private String address;

    public PersonaAddress(AddressType type, String address) {
        this.type = Objects.requireNonNull(type);
        this.address = Objects.requireNonNull(address);
    }

    public AddressType getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return type + " address='" + address;
    }
}
