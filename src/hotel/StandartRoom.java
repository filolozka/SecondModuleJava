package hotel;

public class StandartRoom extends Room {
    String name = "Standart room";
    boolean booked = false;
    int numberRooms; //лучше сделать enum
    int numberPeople; //лучше сделать enum
    int metres; //тоже нужен енум
    boolean bath; //если false - shower

    public StandartRoom(boolean booked, boolean bath) {
        this.booked = booked;
        this.bath = bath;
    }

    public boolean isBooked() {
        return booked;
    }

    public int getNumberRooms() {
        return numberRooms;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public int getMetres() {
        return metres;
    }

    public boolean isBath() {
        return bath;
    }

    protected boolean makeBooking(){
        return booked = false;
    }
}
