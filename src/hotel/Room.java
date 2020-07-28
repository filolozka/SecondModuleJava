package hotel;

abstract public class Room {
    int numberRooms;
    int numberPeople;
    int metres;

    abstract public void setNumberPeople(int numberPeople);
    abstract public int getNumberPeople();
}
