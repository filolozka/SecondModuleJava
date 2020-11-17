package lessonsExamples.lesson2910.hw;

import java.util.Arrays;

public class Main {
    //Клиент должен быть не моложе 17 лет
    //Банковский iban должен быть длиной 16
    //Первые два символа iban должны быть "DE"

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("DE121209");
        BankAccount b2 = new BankAccount("12120909");
        BankAccount b3 = new BankAccount("DE12120");

        Customer c1 = new Customer("Pavel", 30, b1);
        Customer c2 = new Customer("Lena", 16, b2);
        Customer c3 = new Customer("Emma", 18, b3);
        
        Validator.validate(Arrays.asList(c1, c2, c3), Arrays.asList(new ValidationCustomerAge(), new ValidationIbanName(), new ValidationIbanLength()));
    }
}
