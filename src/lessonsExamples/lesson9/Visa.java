package lessonsExamples.lesson9;

public class Visa extends Card {
    public Visa(String number, Person person) {
        super(number, person);
    }

    @Override
    public String toString() {
        return "Visa{" +
                "number='" + getNumber() + '\'' +
                ", person=" + getPerson() +
                '}';
    }

    @Override
    public String securePrint() {
        return "Visa: person = " + getPerson() + ", number = " + getSecureNumber();
    }

    private String getSecureNumber() {
        String stars = "";
        for (int i = 4; i < getNumber().length() - 2; i++) {
            stars += "*";
        }
        return getNumber().substring(0, 3) + stars + getNumber().substring(getNumber().length()-2);
    }
}
