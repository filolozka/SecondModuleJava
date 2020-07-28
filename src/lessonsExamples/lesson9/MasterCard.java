package lessonsExamples.lesson9;

public class MasterCard extends Card {
    public MasterCard(String number, Person person) {
        super(number, person);
    }

    @Override
    public String toString() {
        return "MasterCard{" +
                "number='" + getNumber() + '\'' +
                ", person=" + getPerson() +
                '}';
    }

    @Override
    public String securePrint() {
        return "MasterCard: person = " + getPerson() + ", number = " + getSecureNumber();
    }

    private String getSecureNumber() {
        String stars = "";
        for (int i = 2; i < getNumber().length() - 2; i++) {
            stars += "*";
        }
        return getNumber().substring(0, 2) + stars + getNumber().substring(getNumber().length()-2);
    }
}
