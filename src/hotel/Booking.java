package hotel;

// количество дней, гость/и, комната, оплачено/нет, дополнительные услуги, сумма оплаты

public class Booking {
    private Guest guest;
    private Room room;
    private boolean paid;
    private DateInterval dateInterval;


    public Booking(Guest guest, Room room, DateInterval dateInterval) {
        this.guest = guest;
        this.room = room;
        this.dateInterval = dateInterval;
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

    protected void setRoom(Room room) {
        this.room = room;
    }

    public boolean isPaid() {
        return paid;
    }

    protected void setPaid(boolean paid) {
        this.paid = paid;
    }

    public double getPrice() {
        return this.room.getPrice() * this.dateInterval.getDays();
    }

    @Override
    public String toString() {
        return "Booking: " + room +
                ", guest=" + guest +
                ", " + dateInterval + "\n\tprice for " + dateInterval.getDays() + " days is " + getPrice() + " Euro";
    }
}
