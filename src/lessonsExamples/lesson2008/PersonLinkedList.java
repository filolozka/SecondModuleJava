package lessonsExamples.lesson2008;

public class PersonLinkedList {
    private Node start = null;
    private Node finish = null;
    private int size = 0;

    public void add(PersonLinked person) {
        Node node = new Node(person);
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
            if (finish == start) { // в данном случае проверяем на то, что финиш и старт смотрят именно на один и тот же объект
                finish = null;
                start = null;
                size = 0;
            } else {
                finish.getPrev().setNext(null);
                finish.setPerson(null);
                finish = finish.getPrev();
                size--;
            }
        }
    }

    public void removeFromIndex(int index) {
        if (index > 0 || index < size) {
            if (index == size - 1) {
                remove();
                return;
            } else if (index == 0) {
                start.getNext().setPrev(null);
                start = start.getNext();
                size--;
                return;
            } else {
                Node node = getNodeByIndex(index);
                if (node != null){
                    node.getPrev().setNext(node.getNext());
                    node.getNext().setPrev(node.getPrev());
                    node.setPrev(null);
                    node.setNext(null);
                    node.setPrev(null);
                }
            }
        }
    }

    private Node getNodeByIndex(int index) {
        Node currentNode = start;
        int i = 0;
        while (currentNode != null) { //можно сделать с цифлом фор
            if (i == index) {
                return currentNode;
            } else {
                i++;
                currentNode = currentNode.getNext();
            }
        }
        return null;
    }

    public int findFromPerson(PersonLinked person) {
        Node currentNode = start;
        int res = -1; //нужна, чтобы если ничего не нашел, вернул -1
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getPerson().equals(person)) {
                res = index;
                break;
            } else {
                currentNode = currentNode.getNext();
                index++;
            }
        }
        return res;
    }

    public Node getStart() {
        return start;
    }

    public Node getFinish() {
        return finish;
    }

    public int getSize() {
        return size;
    }

    public String toString() {
        Node currentNode = start;
        String resString = "";
        while (currentNode != null) {
            resString += currentNode.getPerson().toString() + '\n';
            currentNode = currentNode.getNext();
        }
        return resString;
    }
}
