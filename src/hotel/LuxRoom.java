package hotel;

public class LuxRoom extends Room {
    String name = "Lux room";
    boolean booked = false;
    int metres = 50;
    int numberRooms = 2;

    public LuxRoom(int numberPerson) {
        setNumberPeople(numberPerson);
    }

    @Override
    public void setNumberPeople(int numberPeople) {
        if (numberPeople <= 4) {
            this.numberPeople = numberPeople;
        } else {
            System.out.println("Error! Only 1 to 4 person can be checked in in this room");
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
        return "LuxRoom{" +
                "name='" + name + '\'' +
                ", numberRooms=" + numberRooms +
                ", numberPeople=" + numberPeople +
                ", metres=" + metres +
                '}';
    }
}
