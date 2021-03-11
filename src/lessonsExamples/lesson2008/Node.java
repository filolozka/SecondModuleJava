package lessonsExamples.lesson2008;

public class Node {
    private Node next;
    private Node prev;
    private PersonLinked person;

    public Node(PersonLinked person) {
        this.person = person;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setPerson(PersonLinked person) {
        this.person = person;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public PersonLinked getPerson() {
        return person;
    }
}
