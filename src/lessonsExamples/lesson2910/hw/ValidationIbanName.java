package lessonsExamples.lesson2910.hw;

public class ValidationIbanName implements ValidationRule {
    @Override
    public boolean checkTheRule(Customer customer) throws IncorrectIbanBankAccountException {
        if (!customer.getAccount().getIban().startsWith("DE")) {
            throw new IncorrectIbanBankAccountException("Incorrect iban name " + customer.getAccount().getIban());
        }
        return true;
    }
}
