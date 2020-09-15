package hotelAtClass;

import java.util.Comparator;

public class BookingComparatorByDateCheckin implements Comparator<Booking> {

    @Override
    public int compare(Booking o1, Booking o2) {
        int comparingYear = o1.getDateInterval().getCheckin().getYear() - o2.getDateInterval().getCheckin().getYear();
        int comparingMonth = o1.getDateInterval().getCheckin().getMonth() - o2.getDateInterval().getCheckin().getMonth();
        int comparingDay = o1.getDateInterval().getCheckin().getDay() - o2.getDateInterval().getCheckin().getDay();
        if (comparingYear == 0) {
            if (comparingMonth == 0) {
                return comparingDay;
            }
            else {
                return comparingMonth;
            }
        } else {
            return comparingYear;
        }
    }
}
