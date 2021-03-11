package hotel;

import java.util.ArrayList;
import java.util.Arrays;

public class BookingManager {
    private Booking[] bookings;
    private ArrayList <Booking> bookingsList;

    public BookingManager(Booking... bookings) {
        this.bookings = bookings;
    }

    //вариант первый
    public Booking[] getBookings(Booking... bookings) {
        this.bookings = new Booking[getNumberOfBookings(bookings)];
        for (int i = 0; i < getNumberOfBookings(bookings) - 1; i++) {
            this.bookings[i] = bookings[i];
        }
        return bookings;
    }

    //вариант второй, его использую в дальнейших методах
    public ArrayList<Booking> getBookingsList(Booking... bookings) {
        this.bookingsList = new ArrayList <Booking>();
        for (Booking b : bookings) {
            bookingsList.add(b);
        }
        return bookingsList;
    }


    private int getNumberOfBookings(Booking... bookings) {
        int numberOfBookings = 0;
        for (Booking b : bookings) {
            numberOfBookings++;
        }
        return numberOfBookings;
    }

    public void setNewBooking(Booking booking) {
        bookingsList.add(booking);
    }

    public void deleteTheBooking(Booking booking){
        bookingsList.remove(booking);
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

    @Override
    public String toString() {
        return "BookingManager{" +
                "bookings=" + Arrays.toString(bookings) +
                '}';
    }
}
