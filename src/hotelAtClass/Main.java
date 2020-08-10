package hotelAtClass;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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

        //Arrays.sort(bookingList, );
        System.out.println(b1.compareTo(b2));

//        System.out.println(b1); //ожидаем date interval = 11
//        System.out.println(b2); //ожидаем data interval = 2
//        System.out.println(b3); //ожидаем d.inteval = 6
//        System.out.println(b4); //ожидаем d.inteval = 9

    }
}
