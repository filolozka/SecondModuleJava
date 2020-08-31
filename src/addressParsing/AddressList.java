package addressParsing;

public class AddressList {
    private String billingAddress;
    private String email;
    private String deliveryAddress;

    public AddressList(String billingAddress, String deliveryAddress, String email) {
        this.billingAddress = billingAddress;
        this.deliveryAddress = deliveryAddress;
        this.email = email;
    }

    public AddressList(String email, String deliveryAddress) {
        this.email = email;
        this.deliveryAddress = deliveryAddress;
    }


    public AddressList() {
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
