package lessonsExamples.lesson11;

// фио, фи, ф
//задача из массива получить массив персон и распечатать
//Иванова И.И., Николаев Н., Петрова

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

        String[] secondNames = {"Иванов Иван Иванович", "Николаев Николай", "Петрова"};

        String name1 = "Иванов Иван Иванович";

        System.out.println(Arrays.toString(parsingNames(name1)));
        System.out.println(Arrays.toString(getPersonFromStringArray(secondNames)));
        System.out.println("-----------------------------");
        printPersons(getPersonFromStringArray(secondNames));
    }

    //решение Андрея

    public static Person[] getPersonFromStringArray(String[] names) {
        Person[] formatted = null; //если нам передадут null, то будет исключение из-за этой строчки, поэтому оборачиваем в if
        if (names != null) {
            formatted = new Person[names.length];
            for (int i = 0; i < names.length; i++) {
                String[] strings = names[i].split(" "); // делим наш стринг на массив из составляющих - через пробел

                switch (strings.length) { //в зависимости от количества элементов - разные действия
                    case 1:
                        formatted[i] = new Person(strings[0]);
                        break;
                    case 2:
                        formatted[i] = new Person(strings[0], strings[1]);
                        break;
                    case 3:
                        formatted[i] = new Person(strings[0], strings[1], strings[2]);
                        break;
                }
            }
        }
        return formatted;
    }

    public static void printPersons(Person[] people) {
        for (Person p : people) {
            System.out.println(p.toShortName());
        }
    }


    //мои попытки
    public static String getCutName(String name) {
        String point = ".";
        int space = name.indexOf(" ");
        return name.substring(space + 1, space + 2) + point;
    }

    public static String[] parsingNames(String name) {
        String[] fullName;
        String fN = "";
        String sN = "";
        String pN = "";
        int space1;
        int space2;
        if (name.contains(" ")) {
            space1 = name.indexOf(" ");
            space2 = name.lastIndexOf(" ");
            pN = name.substring(space2);
            fN = name.substring(space1, space2);
            sN = name.substring(0, space1);
        }
        fullName = new String[]{fN, sN, pN};
        return fullName;
    }


}
