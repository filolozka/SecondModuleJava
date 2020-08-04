package hotel;

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

        if (days == 0) {
            for (int i = checkin.getYear(); i < checkout.getYear(); i++) {
                days += hotelAtClass.Date.getDaysPerYear(i);
            }
        } else {
           // days -= checkin.daysFromNewYear; надо пошукать, почему не подтягивает
            // days += checkout.daysFromNewYear;
        }
        return days;
    }

    @Override
    public String toString() {
        return "[" + checkin + "-" + checkout + "]"; //если скобки одинарные - это char
    }
}
