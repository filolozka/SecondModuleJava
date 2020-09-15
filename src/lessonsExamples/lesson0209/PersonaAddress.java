package lessonsExamples.lesson0209;

import java.util.Objects;

public class PersonaAddress {
    private AddressType type;
    private String address;

    public PersonaAddress(AddressType type, String address) {
        this.type = type;
        this.address = address;
    }

    public PersonaAddress(String type, String address) {
        this.address = address;
        try{
            this.type = AddressType.valueOf(type);
        } catch (Exception ex){
            System.out.println("Type is not correct!");
            throw ex;
        }
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
