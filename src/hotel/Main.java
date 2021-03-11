package hotel;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StandardRoom number1 = new StandardRoom("2", 2);
        DeluxeRoom number2 = new DeluxeRoom("3", 3);
        LuxRoom number3 = new LuxRoom("4", 3);
        StandardRoom number4 = new StandardRoom("5", 1);
        DeluxeRoom number5 = new DeluxeRoom("6", 2);

        Room[] miniHotel = new Room[]{number1, number2, number3, number4, number5};

        Guest guest1 = new Guest("Pavel", "Ivanov", "2359448945672345");
        Guest guest2 = new Guest("Maria", "Ivanova", "2355768303820556");
        Guest guest3 = new Guest("Volk", "Schwarzkopf", "123145672890");

        Booking booking1 = new Booking(
                guest1,
                number1,
                new DateInterval(
                        new Date(10, 9, 2020),
                        new Date(20, 9, 2020))
        );

        Booking booking2 = new Booking(
                guest2,
                number3,
                new DateInterval(
                        new Date(5, 10, 2020),
                new Date(12, 10, 2020))
        );

        Booking booking3 = new Booking(
                guest3,
                number2,
                new DateInterval(
                        new Date(1, 8, 2020),
                new Date(3, 8, 2020))
        );

        BookingManager theAugustBookings = new BookingManager(booking1, booking2, booking3);
        System.out.println(theAugustBookings.toString());

    }
}
