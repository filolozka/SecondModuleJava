package streamApiTasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tasks {
    //1. Нужно написать функцию, которая по списку persons вернет список адресов тех
    //людей, чей возраст больше 17 лет.
    public static List<Address> task1(List<Person> personList) {

        return personList
                .stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
                .collect(Collectors.toList());
    }

    //2. Есть список имен, нужно написать функцию, которая вернет список имен без дупликатов
    public static List<String> task2(List<String> names) {
        return names
                .stream()
                .distinct()
                .collect(Collectors.toList());
    }

    //3. Есть список людей, нужно написать функцию, которая вернет мапу, где
    //ключом является возраст, а значением список людей этого возраста
    public static Map<Integer, List<Person>> task3(List<Person> personList) {
        return personList.stream().collect(Collectors.groupingBy(Person::getAge));
    }

    //4. Нужно написать функцию, которая возвращает мапу, где значением является Person, а
    //значением - список его банковских счетов.
    public static Map<Person, List<Account>> task4(List<Account> accounts) {
        return accounts.stream().collect(Collectors.groupingBy(Account::getOwner));
    }

    //5. Написать функцию, которая для списка счетов, возвращает список IBANNs,
    //где в каждом IBAN символы после 3-го и до конца заменены звездочками.
    public static List<String> task5(List<Account> accounts) {
        return accounts
                .stream()
                .map(account -> account.getIban().substring(0, 3) + "*******************")
                .collect(Collectors.toList());
    }

    //6. Написать функцию, которая принимает предложение, а возвращает
    //количество слов, начинающихся на заданную букву
    public static int task6(String sentence, String letter) {
        List<String> listFromSentence = Arrays.asList(sentence.split(" "));
        long numberOfWords = listFromSentence
                .stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith(letter))
                .count();
        return (int) numberOfWords;
    }

    //7. Написать функцию, которая проверяет, является ли заданная строка целым
    //числом. Подсказка - Character.isDigit() и Stream.allMatch().
    public static boolean isTheStringIsInteger(String str) {
        return str.chars()
                .allMatch(Character::isDigit);
    }


    //Не решила эту задачу:
    //8-9. Написать функцию, которая по списку persons возвращает список их
    //банковских счетов с звездочками с третьего символа. Подсказка - flatMap()
    public static List<String> getSecuredAccounts(List<Person> people) {
        return people.stream()
                .flatMap(person -> person.getBankAccounts().stream())
                .map(Account::getIban)
                .map(s -> allianateIban(s))
                .collect(Collectors.toList());
    }

    private static String allianateIban(String s) {
        return s.substring(0,2) + s.substring(2).replaceAll("\\d", "*");
    }


    //10. Для списка persons посчитать общий возраст тех, кому больше 17 лет.
    //Подсказка - reduce()
    public static Integer getTotalAge(List<Person> people) {
        return people.stream().filter(person -> person.getAge() > 17)
                .mapToInt(Person::getAge)
                .sum();
    }


    //Не решено

    //11. Написать функцию, которая для списка persons напечатает для тех, кто
    //старше 17 лет: In Germany <name1> and <name2> and …<nameN> are of legal
    //age. Подсказка - Collectors.joining();

    //public static void printPersonOlder17Age(List<Person> personList) {
    //List<Person> listAdults = (List<Person>) personList.stream().collect(Collectors.groupingBy(Person::getAge));
    //listAdults.forEach(System.out::println);
    //Map<Integer, List<Person>> temp = personList.stream().filter(person -> person.getAge() > 17)
    //       .collect(Collectors.groupingBy(Person::getAge));
    //List<Person> listAdults = temp.stream().collect(Collectors.joining(" , "));

}
