package hotelAtClass;

import java.util.Random;

public class DateInterval {
    private Date checkin;
    private Date checkout;
    private static Random random = new Random(System.currentTimeMillis());
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
        int min = 1;
        int max = 100;
        if (days == 0) {
            days = min + random.nextInt(max - min + 1);
        }
        return days;
    }

    @Override
    public String toString() {
        return "[" + checkin + "-" + checkout + "]"; //если скобки одинарные - это char
    }
}
