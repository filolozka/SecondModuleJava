package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

public class Task3 {
    //Дана строка, вернуть новую строку, где последние 3 символа в верхнем регистре
    //(заглавные). Если строка длины меньше 3, перевести это в заглавные.

    public static void main(String[] args) {
        System.out.println(endUp("Hello"));
        System.out.println(endUp("hi there"));
        System.out.println(endUp("hi"));
    }

    public static String endUp(String str) {
        int indexForReplace = str.length() - 3;
        if (indexForReplace > 0){
           return str.substring(0, indexForReplace).concat(str.substring(indexForReplace).toUpperCase());
        }
        return str.toUpperCase();
    }
}
