package lessonsExamples.lesson2910.hw;

public class ValidationIbanLength implements ValidationRule {
    @Override
    public boolean checkTheRule(Customer customer) throws InvalidIbanLengthException {
        if (customer.getAccount().getIban().length() != 8) {
            throw new InvalidIbanLengthException("Invalid iban length " + customer.getAccount().getIban());
        }
        return true;
    }
}
