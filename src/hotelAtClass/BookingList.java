package hotelAtClass;

import java.util.Comparator;

public interface BookingList {
    void addBooking(Booking booking);
    int size();
    void printBooking();
    Booking[] getSortedArray(Comparator<Booking> comparator);

    Booking getByIndex(int i);
}
