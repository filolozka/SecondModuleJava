package bankingProject;

public class Individuals extends Customer {

    public Individuals(String name, String iban) {
        super.name = name;
        super.iban = iban;
    }

    @Override
    public String toStringIt() {
        return "Individuals{" +
                "name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
