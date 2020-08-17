package hotelAtClass;

import java.util.Random;

public class DateInterval {
    private Date checkin;
    private Date checkout;
    private int days = 0;

    public DateInterval(Date checkin, Date checkout) {
        if (checkin.compareTo(checkout) > 0) {
            this.checkin = checkout;
            this.checkout = checkin;
        }
        else {
            this.checkin = checkin;
            this.checkout = checkout;
        }
    }

    public static boolean isIntersect(DateInterval dateInterval, DateInterval dateInterval1) {
        return !((dateInterval.checkin.compareTo(dateInterval1.checkout)) > 0) ||
            (dateInterval1.getCheckin().compareTo(dateInterval.getCheckout()) > 0);
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public int getDays() {
        if (checkin.getYear() == checkout.getYear()) {
            days = getNumberOfDay(checkout.getMonth(), checkout.getYear(), checkout.getDay()) - getNumberOfDay(checkin.getMonth(), checkin.getYear(), checkin.getDay());
        } else {
            days = (getDayInTheYear(checkin.getYear()) - getNumberOfDay(checkin.getMonth(), checkin.getYear(), checkin.getDay())) + getNumberOfDay(checkout.getMonth(), checkout.getYear(), checkout.getDay());
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

    public boolean findLeapYear(int year) {
        return (year % 4 == 0) ^ ((year % 100 == 0) & (year % 400 != 0));
    }

    public int getDayInTheYear(int year){
        int daysInYear = 365;
        if (findLeapYear(year)) {
            daysInYear = 366;
        }
        return daysInYear;
    }

    @Override
    public String toString() {
        return "[" + checkin + "-" + checkout + "]"; //если скобки одинарные - это char
    }
}
