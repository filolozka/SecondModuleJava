package lessonsExamples.lesson2910.hw;

public interface ValidationRule {
    boolean checkTheRule(Customer customer) throws ClientAgesException, InvalidIbanLengthException, IncorrectIbanBankAccountException;
}
