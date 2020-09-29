package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

public class Task10 {
    //Даны две строки,вернуть их конкатенацию, но без первого символа в каждой. Строки
    //ненулевой длины.

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }

    public static String nonStart(String a, String b) {
        if (a == null | b == null) return "";
        return a.substring(1).concat(b.substring(1));
    }
}
