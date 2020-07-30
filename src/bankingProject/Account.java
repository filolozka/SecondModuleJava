package bankingProject;

public class Account {
    private Customer customer;
    private String owner; //не уверена, не избыточные ли эти переменные класса, если есть Client
    private String iban;

    public Account(Customer customer) {
        this.customer = customer;
        this.owner = customer.getName();
        this.iban = customer.getIban();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Account{" +
                "customer=" + customer +
                ", owner='" + owner + '\'' +
                ", iban='" + iban + '\'' +
                '}';
    }
}
