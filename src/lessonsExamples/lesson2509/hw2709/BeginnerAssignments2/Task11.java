package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

public class Task11 {
    //Дана строка четной длины.Вернуть строку из двух центральных символов. Длина входной строки минимум 2.

    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    public static String middleTwo(String str) {
        if (str == null || str.length() < 2) return "";
        return str.substring(getIndexToStart(str), getIndexToStart(str) + 2);
    }

    public static int getIndexToStart(String str){
        return ((str.length() / 2) - 1);
    }
}
