package hotelAtClass;

public interface BookingList {
    void addBooking(Booking booking);
    int size();
    void printBooking();
    boolean find(Booking booking);
    Booking getBookingByIndex(int index);
}
