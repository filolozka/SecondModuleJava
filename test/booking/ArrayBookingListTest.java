package booking;

import hotelAtClass.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Comparator;

public class ArrayBookingListTest {
    BookingList bookingList;
    Booking b1;
    Booking b2;
    Booking b3;

    @Before
    public void initBookingList() {
        b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Nick3"),
                new DateInterval(new Date(30, 7, 2020),
                        new Date(10, 8, 2020))
        );

        b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick1"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))
        );

        b3 = new Booking(
                new SuiteRoom("3", 2),
                new Person("Nick2"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))
        );

        bookingList = new ArrayBookingList(3);
        bookingList.addBooking(b1);
        bookingList.addBooking(b2);
        bookingList.addBooking(b3);

    }

    @Test
    public void getByIndexCorrectReturnBooking() {
        Assert.assertEquals("the first el. fail", b1, bookingList.getByIndex(0));
        Assert.assertEquals("get element fail", b2, bookingList.getByIndex(1));
        Assert.assertEquals("the last element fail", b3, bookingList.getByIndex(2));
    }

    @Test
    public void getByIndexNoCorrectIndexReturnNull() {
        Assert.assertTrue("negative index not ok", bookingList.getByIndex(-1) == null);
        Assert.assertTrue("bigger index not ok", bookingList.getByIndex(3) == null);
    }

    @Test
    public void addCorrectSizeIncrementAndBookingAdd() {
        Booking booking = new Booking(
                new SuiteRoom("4", 2),
                new Person("Nick222"),
                new DateInterval(new Date(15, 8, 2020),
                        new Date(16, 8, 2020))
        );
        bookingList.addBooking(booking);
        Assert.assertEquals(4, bookingList.size());
        Assert.assertEquals(booking, bookingList.getByIndex(3));
    }

    @Test
    public void addToEmptyBookingListCorrectAdded() {
        BookingList bookingList = new ArrayBookingList(1);
        bookingList.addBooking(b1);
        Assert.assertEquals(1, bookingList.size());
        Assert.assertEquals(b1, bookingList.getByIndex(0));
        bookingList.addBooking(b2);
        Assert.assertEquals(2, bookingList.size());
        Assert.assertEquals(b2, bookingList.getByIndex(1));
    }

    @Test
    public void getSortedByNameArrayTest() {
        Comparator<Booking> comparator = new BookingComparatorByName();
        Booking[] resArray = bookingList.getSortedArray(comparator);
        Booking[] shouldArray = {b2, b3, b1};
        Assert.assertArrayEquals(resArray, shouldArray);

    }
}
