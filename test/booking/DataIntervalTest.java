package booking;

import hotelAtClass.Date;
import hotelAtClass.DateInterval;
import org.junit.Assert;
import org.junit.Test;

public class DataIntervalTest {

    @Test
    public void dateFinishShouldBeAfterStart() {
        Date d1 = new Date(30, 8, 2020);
        Date d2 = new Date(10, 8, 2020);
        DateInterval dateInterval = new DateInterval(d1, d2);
        boolean res = dateInterval.getCheckin().equals(d2) &&
                      dateInterval.getCheckout().equals(d1);
        Assert.assertTrue(res);
    }

    @Test
    public void dateFinishShouldBeAfterStart2() {
        Date d2 = new Date(30, 8, 2020);
        Date d1 = new Date(10, 8, 2020);
        DateInterval dateInterval = new DateInterval(d1, d2);
        boolean res = dateInterval.getCheckin().equals(d1) &&
                dateInterval.getCheckout().equals(d2);
        Assert.assertTrue(res);
    }
    @Test
    public void isIntersectTest() {
        Date start1 = new Date(10, 8, 2020);
        Date finish1 = new Date(30, 8, 2020);
        DateInterval dateInterval = new DateInterval(start1, finish1);

        Date start2 = new Date(15, 8, 2020);
        Date finish2 = new Date(15, 9, 2020);
        DateInterval dateInterval1 = new DateInterval(start2, finish2);

        Assert.assertFalse(DateInterval.isIntersect(dateInterval, dateInterval1));

    }
}
