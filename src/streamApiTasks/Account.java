package streamApiTasks;

public class Account {
    String iban;
    Person person;

    public Account(String iban) {
        this.iban = iban;
    }

    public Account(String iban, Person person) {
        this.iban = iban;
        this.person = person;
    }

    @Override
    public String toString() {
        return "iban='{' " + iban + '}';
    }
}
