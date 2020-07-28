package hotel;

// имя, фамилия, номер кредитки, аллергии, карта клиента, вип/нет, даты заезда

public class Guest {
    private String firstName;
    private String secondName;
    private String creditCard;
    private boolean vip;

    public Guest(String firstName, String secondName, String creditCard) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.creditCard = creditCard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", vip=" + vip +
                '}';
    }
}
