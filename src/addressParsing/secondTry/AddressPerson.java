package addressParsing.secondTry;

public class AddressPerson {
    private AddressesTypes type;
    private String address;

    public AddressPerson(AddressesTypes type, String address) {
        this.type = type;
        this.address = address;
    }

    public AddressesTypes getType() {
        return type;
    }

    public String getAddress() {
        return address;
    }

    public String addAddress(String newAddress){
        if (newAddress != null){
            this.address = newAddress;
        }
        return this.address;
    }

    @Override
    public String toString() {
        return type + " address= '" + address;
    }
}
