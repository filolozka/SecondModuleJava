package hotelAtClass;

public class Node {
    private Node next;
    private Node prev;
    private Booking booking;

    public Node(Booking booking) {
        this.booking = booking;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public Booking getBooking() {
        return booking;
    }
}
