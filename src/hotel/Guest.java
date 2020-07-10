package hotel;

// имя, фамилия, номер кредитки, аллергии, карта клиента, вип/нет, даты заезда

public class Guest {
    private String firstName;
    private String secondName;
    private double creditCard;
    private boolean regularCustomer;
    private boolean vip;

    public Guest(String firstName, String secondName, double creditCard) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.creditCard = creditCard;
    }

    public Guest() {
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

    public double getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }
}
