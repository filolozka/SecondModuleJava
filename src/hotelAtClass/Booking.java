package hotelAtClass;

import java.time.Period;

public class Booking implements Comparable<Booking> {
    private Room room;
    private Person person;
    private DateInterval dateInterval;

    public Booking(Room room, Person person, DateInterval dateInterval) {
        this.room = room;
        this.person = person;
        this.dateInterval = dateInterval;
    }

    public Room getRoom() {
        return room;
    }

    public Person getPerson() {
        return person;
    }

    public DateInterval getDateInterval() {
        return dateInterval;
    }

    public double getPrice() {
        return this.room.getPrice() * this.dateInterval.getDays();
    }

    @Override
    public String toString() {
        return "Booking: " + room +
                ", person=" + person +
                ", " + dateInterval + "\n\tprice for " + dateInterval.getDays() + " days is " + getPrice() + " Euro";
    }

    @Override
    public int compareTo(Booking o) {
        //switch () и варианты с компаратором из классов
        return 0;
    }

    public int bookingSorting(){
        return 0;
    }
}
