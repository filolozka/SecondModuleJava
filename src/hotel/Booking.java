package hotel;

// количество дней, гость/и, комната, оплачено/нет, дополнительные услуги, сумма оплаты

public class Booking {
    Guest guest;
    Room room;
    boolean paid = false;
    double invoiceAmount;
    Date checkIn;
    Date checkOut;

    public Booking(Guest guest, Room room, Date checkIn, Date checkOut) {
        this.guest = guest;
        this.room = room;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
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
}
