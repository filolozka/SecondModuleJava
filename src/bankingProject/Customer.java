package bankingProject;

abstract class Customer {
    String name;
    String iban;

    public String getName() {
        return name;
    }

    public String getIban() {
        return iban;
    }

    abstract String toStringIt();

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
