package lessonsExamples.lesson0809;

public class lesson0809 {
    public static void main(String[] args) {
        PersonN n = new PersonN("wdfgbdfgnt", 23);
        PersonN n1 = new PersonN("erfghtwt", 75);
        PersonN n2 = new PersonN("wrtyt", 20);
        PersonN n3 = new PersonN("wrtyt", 20);

        System.out.println(n.hashCode());
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());
        System.out.println(n3.hashCode());
    }
}
