package lessonsExamples.lesson2910.hw;

import java.util.function.Predicate;

public class Main {
    //Клиент должен быть не моложе 17 лет
    //Банковский iban должен быть длиной 16
    //Первые два символа iban должны быть "DE"

    public static void main(String[] args) throws ClientAgesException {
       // ("Pavel", 16);
    }

    public static void validation(){

    }

    public static void newCustomer(String name, int age, String iban) throws ClientAgesException {
        if (checkIban(iban)){
            BankAccount bankAccount1 = new BankAccount(iban);
        }

        if (checkAge(age)){
       //     Customer c1 = new Customer(name, age);
        }
        else {
            throw new ClientAgesException("Sorry, the customer must be at least 17 years old");
        }
    }

    public static boolean checkAge(int ages) {
        Predicate<Integer> isAdult = ages1 -> ages1 > 17;
        return isAdult.test(ages);
    }

    public static boolean checkIban(String iban) {
        return iban.startsWith("DE") && (iban.length() == 16);
    }
}
