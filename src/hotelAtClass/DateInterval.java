package hotelAtClass;

import java.util.Random;

public class DateInterval {
    private Date checkin;
    private Date checkout;
    private int days = 0;

    public DateInterval(Date checkin, Date checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public int getDays() {
        int daysInYear = 365;
        if (findLeapYear(checkin.getYear())) {
            daysInYear = 366;
        }

        if (checkin.getYear() == checkout.getYear()) {
            days = getNumberOfDay(checkout.getMonth(), checkout.getYear(), checkout.getDay()) - getNumberOfDay(checkin.getMonth(), checkin.getYear(), checkin.getDay());
        } else {
            days = (daysInYear - getNumberOfDay(checkin.getMonth(), checkin.getYear(), checkin.getDay())) + getNumberOfDay(checkout.getMonth(), checkout.getYear(), checkout.getDay());
        }
        return days;
    }

    public int getNumberOfDay(int numberOfMonth, int year, int day) { //метод находит, сколько дней с начала года до указанной даты
        int daysFromNYtoDate = 0;
        for (int i = 1; i < numberOfMonth; i++) {
            switch (i) {
                case 2:
                    if (findLeapYear(year)) {
                        daysFromNYtoDate += 29;
                    } else {
                        daysFromNYtoDate += 28;
                    }
                    break;
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    daysFromNYtoDate += 30 + i % 2;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    daysFromNYtoDate += 30 + ((i + 1) % 2);
                    break;
            }
        }

        daysFromNYtoDate += day;

        return daysFromNYtoDate;
    }

    public static boolean findLeapYear(int year) {
        return (year % 4 == 0) ^ ((year % 100 == 0) & (year % 400 != 0));
    }

    @Override
    public String toString() {
        return "[" + checkin + "-" + checkout + "]"; //если скобки одинарные - это char
    }
}
