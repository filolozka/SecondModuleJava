package hotelAtClass;

import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListForBooking implements BookingList {
    private ArrayList<Booking> list;

    public ArrayListForBooking(int capacity) {
        list = new ArrayList<Booking>();
    }

    @Override
    public void addBooking(Booking booking) {
        list.add(booking);
    }

    public void removeBooking(Booking booking) {
        list.remove(booking);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public void printBooking() {
        System.out.println(list);
    }

    @Override
    public Booking[] getSortedArray(Comparator<Booking> comparator) {
        list.sort(comparator);
        return listToArray();
    }

    @Override
    public Booking getByIndex(int i) {
        return list.get(i);
    }

    public Booking[] listToArray(){
        return list.toArray(new Booking[list.size()]);
    }

    public int findTheBooking(Booking booking) {
        return list.indexOf(booking);
    }
}
