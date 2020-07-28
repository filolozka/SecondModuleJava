package hotel;

//программа для ресепшн отеля: номера (могут быть разные), клиенты, отразить факт бронирования

//Комната стандарт -> улучшенный -> люкс
// - метраж, кровать, количество людей, ванная, статус свободна/занята/забронирована

// Гость -> постоянный гость ->вип-гость
// имя, фамилия, номер кредитки, аллергии, карта клиента, вип/нет, даты заезда?

// Пребывание в отеле/бронирование
// количество дней, гость/и, комната, оплачено/нет, дополнительные услуги, сумма оплаты

// Услуги стандартные -> дополнительные
// перечень и да,нет + ценник

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        StandardRoom number1 = new StandardRoom(2);
        DeluxeRoom number2 = new DeluxeRoom(3);
        LuxRoom number3 = new LuxRoom(4);
        StandardRoom number4 = new StandardRoom(2);
        DeluxeRoom number5 = new DeluxeRoom(3);

        Room[] miniHotel = new Room[]{number1, number2, number3, number4, number5};

        Guest guest1 = new Guest("Pavel", "Ivanov", "2359448945672345");
        Guest guest2 = new Guest("Maria", "Ivanova", "2355768303820556");
        Guest guest3 = new Guest("Volk", "Schwarzkopf", "123145672890");

        Booking booking1 = new Booking(
                guest1,
                number1,
                new Date(10, 9, 2020),
                new Date(20, 9, 2020),
                typeOfPay.CARD,
                2
        );

        Booking booking2 = new Booking(
                guest2,
                number3,
                new Date(5, 10, 2020),
                new Date(12, 10, 2020),
                typeOfPay.CARD,
                4
        );

        Booking booking3 = new Booking(
                guest3,
                number2,
                new Date(1, 8, 2020),
                new Date(3, 8, 2020),
                typeOfPay.CARD,
                3
        );

        Booking[] bookings = {booking1, booking2, booking3};

        System.out.println(Arrays.toString(bookings));
    }
}
