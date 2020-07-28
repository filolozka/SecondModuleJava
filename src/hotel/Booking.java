package hotel;

// количество дней, гость/и, комната, оплачено/нет, дополнительные услуги, сумма оплаты

public class Booking {
    private Guest guest;
    private Room room;
    private boolean paid;
    private double invoiceAmount;
    private Date checkIn;
    private Date checkOut;
    private typeOfPay howPay;
    private int numberOfPeople;

    public Booking(Guest guest, Room room, Date checkIn, Date checkOut, typeOfPay howPay, int howManyPeople) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.howPay = howPay;
        this.numberOfPeople = getNumberOfPeople();
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Room room, int numberOfPeople) {
        room.setNumberPeople(numberOfPeople);
        this.numberOfPeople = room.getNumberPeople();
    }

    public typeOfPay getHowPay() {
        return howPay;
    }

    public void setHowPay(typeOfPay howPay) {
        this.howPay = howPay;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guest=" + guest +
                ", room=" + room +
                ", paid=" + paid +
                ", invoiceAmount=" + invoiceAmount +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", howPay=" + howPay +
                '}';
    }
}
