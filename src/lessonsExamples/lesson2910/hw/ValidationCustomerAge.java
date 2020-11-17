package lessonsExamples.lesson2910.hw;

public class ValidationCustomerAge implements ValidationRule {
    @Override
    public boolean checkTheRule(Customer customer) throws ClientAgesException {
        if (customer.getAge() < 17){
            throw new ClientAgesException("Invalid age" + customer.getAge() + " for customer " + customer.getName());
        }
        return true;
    }
}
