package hotel;

public class StandardRoom extends Room {
    private String name = "Standard room";
    private boolean booked;
    int metres = 20;
    int numberRooms = 1;

    public StandardRoom(int numberPerson) {
        setNumberPeople(numberPerson);
    }

    @Override
    public void setNumberPeople(int numberPeople) {
        if (numberPeople < 3) {
            this.numberPeople = numberPeople;
        } else {
            System.out.println("Error! Only 1 or 2 person can be checked in in this room");
        }
    }

    @Override
    public int getNumberPeople() {
        return numberPeople;
    }

    public int getMetres() {
        return metres;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public boolean getBooked() {
        return booked;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    @Override
    public String toString() {
        return "StandardRoom{" +
                "name='" + name + '\'' +
                ", numberRooms=" + numberRooms +
                ", numberPeople=" + numberPeople +
                ", metres=" + metres +
                '}';
    }
}
