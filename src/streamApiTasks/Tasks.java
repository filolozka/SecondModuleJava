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
    public static boolean isTheStringIsInteger(String str){
        return str.chars()
                .allMatch(Character::isDigit);
    }
}
