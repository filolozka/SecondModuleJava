package lessonsExamples.lesson9;

import java.util.Arrays;

public class Main {
    //mc 12
    //visa 13
    // объекты разного типа
    //securePrint ****
    // master 12***09
    // visa 1234**********45

    public static void main(String[] args) {
        String[] bankDat = {
                "1234576487658953 Andy", //master
                "1244355635654234 Ivan", //master
                "1346567450945965 Vera" //visa
        };

        Card[] arrayCard = getCard(bankDat);
        printArrayCard(arrayCard);
        System.out.println(Arrays.toString(arrayCard));

    }

    public static Card[] getCard(String[] array) {
        Card[] cards = new Card[array.length];
        for (int i = 0; i < array.length; i++) {
            String[] temp = array[i].split(" "); //содержит регулярное выражение

            switch (checkType(temp[0])) {
                case 1:
                    cards[i] = new MasterCard(temp[0], new Person(temp[1]));
                    break;
                case 2:
                    cards[i] = new Visa(temp[0], new Person(temp[1]));
                    break;
                default:
                    System.out.println("There is mistake");
            }
        }
        return cards;
    }

    public static int checkType(String number) {
        int typeVisa = 1;
        int typeMaster = 2;
        if (number.startsWith("12"))
            return typeMaster; //метод, который определяет, начинается ли строка с заданного субстринга
        if (number.startsWith("13")) return typeVisa;
        return 0;
    }

    public static void printArrayCard(Card[] cards) {  //нужно было, тк стандартный Arrays.toString работает со стандартным методом, который переопределн у наследников. если мы хотим использовать другой метод, то надо писать ручками
        for (Card card : cards) {
            System.out.println(card.securePrint());
        }
    }
}
