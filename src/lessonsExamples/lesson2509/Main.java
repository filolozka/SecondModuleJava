package lessonsExamples.lesson2509;

public class Main {
    public static void main(String[] args) {
        //Параметр weekday имеетзначение true
        // если это рабочий день недели, и параметр
        //vacation имеет значение true если у нас каникулы.
        // Мы спим, если это не рабочий день
        //или у нас каникулы. Вернуть значение true, когда мы спим

    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }
}
