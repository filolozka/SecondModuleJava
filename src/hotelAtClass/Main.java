package hotelAtClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DateInterval test = new DateInterval(
                new Date (24, 8, 20),
                new Date (24, 8, 20));

        System.out.println(test);  //ожидаем nulls

        DateInterval test2 = new DateInterval(
                new Date (11, 8, 20),
                new Date (12, 8, 20)
        );

        System.out.println(test2); //ожидаем [11-8-20;12-8-20]


        Booking b1 = new Booking(
                new StandardRoom("1", 2),
                new Person("Masha"),
                new DateInterval(new Date(30, 7, 2020),
                                 new Date(10, 8, 2020))
        );

        Booking b2 = new Booking(
                new SuiteRoom("2", 2),
                new Person("Nick"),
                new DateInterval(new Date(11, 8, 2020),
                        new Date(13, 8, 2020))
        );

        Booking b3 = new Booking(
                new SuiteRoom("4", 1),
                new Person("Dasha"),
                new DateInterval(new Date (30, 12, 2019),
                        new Date (5, 1, 2020))
        );

        Booking b4 = new Booking(
                new StandardRoom("5", 1),
                new Person("Sasha"),
                new DateInterval(new Date (25, 2, 2020),
                        new Date (5, 3, 2020))
        );

        BookingList bookingList = new ArrayBookingList(2);
        bookingList.addBooking(b1);
        bookingList.addBooking(b2);
        bookingList.addBooking(b3);
        bookingList.printBooking();
    }
}
