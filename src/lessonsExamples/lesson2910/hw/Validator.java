package lessonsExamples.lesson2910.hw;

import java.util.List;

public class Validator {
    public static void validate(List<Customer> customerList, List<ValidationRule> rules) {
        for (Customer customer : customerList){
            validateCustomer(customer, rules);
        }
    }

    private static void validateCustomer(Customer customer, List<ValidationRule> rules){
        for (int i = 0; i < rules.size(); i++) {
            try {
                rules.get(i).checkTheRule(customer);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

}
