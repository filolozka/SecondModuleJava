package hotelAtClass;

public class ArrayBookingList implements BookingList {
    private Booking[] bookings;
    private int size = 0;
    private int capacity = 3;

    public ArrayBookingList(int capacity) {
        this.capacity = capacity;
        bookings = new Booking[this.capacity];
    }

    @Override
    public void addBooking(Booking booking) {
        if (size < capacity){
            bookings[size++] = booking;
        }
        else {
            capacity = capacity * 2;
            Booking[] temp = new Booking[capacity];
            for (int i = 0; i < bookings.length; i++) {
                temp[i] = bookings[i];
            }
            bookings = temp;
            bookings[size++] = booking;
        }
    }


    public Booking getBookingByIndex(int index){
        return bookings[index];
    }

    public boolean find(Booking booking){
        boolean found = false;
        for (int i = 0; i < bookings.length; i++) {
            if (bookings[i].equals(booking)){
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void printBooking() {
        for (int i = 0; i < size; i++) {
            System.out.println(bookings[i]);
        }
    }
}
