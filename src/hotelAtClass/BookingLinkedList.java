package hotelAtClass;

public class BookingLinkedList {
    private Node start = null;
    private Node finish = null;
    private int size = 0;

    public void add(Booking booking) {
        Node node = new Node(booking);
        if (start == null) {
            start = node;
            finish = node;
        } else {
            node.setPrev(finish);
            finish.setNext(node);
        }
        finish = node;
        size++;
    }

    public void remove() {
        if (finish != null) {
            if (finish == start) {
                finish = null;
                start = null;
                size = 0;
            }
        } else {
            finish.getPrev().setNext(null);
            finish.setBooking(null);
            finish = finish.getPrev();
            size--;
        }
    }
}
