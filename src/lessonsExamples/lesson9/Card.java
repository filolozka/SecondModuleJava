package lessonsExamples.lesson9;

abstract class Card {
    private String number;
    private Person person;

    public Card(String number, Person person) {
        this.number = number;
        this.person = person;
    }

    public String getNumber() {
        return number;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return "Card{" +
                "number='" + number + '\'' +
                ", person=" + person +
                '}';
    }

    abstract String securePrint();
}
