package lessonsExamples.lesson1708;

public class Task1 {
    public static void main(String[] args) {
        //массив строк, для всех строк длиннее 4 символов, заменить их новой строкой в обратном порядке
        //write your code here
        //etirw

        /*1. перебрать массив
        2. выбрать нужные элементы (условие length > 4)
        3. реверс (действие)
        4.
        * */

        String[] strings = {"12", "qwerty", "123456", "13", "abc", ""};
        StringArrayHandler stringArrayHandler = new StringArrayHandler(strings,
                new ReverseStringAction(),
                new ReverseCondition());
        System.out.println(stringArrayHandler.stringsHadler().toString());

        System.out.println("----------------");

               StringArrayHandler stringArrayHandler2 = new StringArrayHandler(strings,
                new ReverseStringAction(),
                new LengthCondition(1));
        System.out.println(stringArrayHandler2.stringsHadler().toString());

        System.out.println("----------------");

        StringArrayHandler stringArrayHandler3 = new StringArrayHandler(strings,
                new ToUpperCaseAction(),
                new LengthCondition(2));
        System.out.println(stringArrayHandler3.stringsHadler().toString());
    }
}
