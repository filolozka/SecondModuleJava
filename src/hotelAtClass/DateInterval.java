package hotelAtClass;

import java.util.Random;

public class DateInterval implements Comparable<DateInterval> {
    private Date start;
    private Date finish;
    //private static  Random rnd = new Random(System.currentTimeMillis());
    private int days=0;


    public DateInterval(Date start, Date finish) {
        if (start.compareTo(finish) != 0) {
            this.start = start;
            this.finish = finish;
        }
        else {
            System.out.println("Sorry, the date interval is wrong and couldn't be create");
        }
    }

    public Date getStart() {
        return start;
    }

    public Date getFinish() {
        return finish;
    }


    public int getDays(){
        if (days == 0){
            for(int i = start.getYear();i<finish.getYear();i++){
                days+=Date.getDaysPerYear(i);
            }
            days-=start.daysFromNewYear();
            days+=finish.daysFromNewYear();
        }

        return days;
    }

    @Override
    public String toString() {
        return "["+ start+';' + finish +']';
    }

    @Override
    public int compareTo(DateInterval dates) {
        return this.start.compareTo(dates.finish);
    }
}
