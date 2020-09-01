package addressParsing;

public class AddressesList {
    private String billingAddress;
    private String email;
    private String deliveryAddress;

    public AddressesList(String billingAddress, String deliveryAddress, String email) {
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
        this.email = email;
    }

    public AddressesList(String email, String deliveryAddress) {
        this.email = email;
        this.deliveryAddress = deliveryAddress;
    }


    public AddressesList() {
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "AddressList{" +
                "billingAddress='" + billingAddress + '\'' +
                ", email='" + email + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
