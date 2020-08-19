package lessonsExamples.lesson1708.arrayHandler;

import lessonsExamples.lesson1708.arrayHandler.actions.ReverseStringAction;
import lessonsExamples.lesson1708.arrayHandler.actions.ToUpperCaseAction;
import lessonsExamples.lesson1708.arrayHandler.conditions.LengthCondition;
import lessonsExamples.lesson1708.arrayHandler.conditions.ReverseCondition;

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
        stringArrayHandler.stringsHadler();
        System.out.println(stringArrayHandler.stringsHadler().toString());

        System.out.println("----------------");

        StringArrayHandler stringArrayHandler2 = new StringArrayHandler(strings,
                new ReverseStringAction(),
                new LengthCondition(1));
        stringArrayHandler2.stringsHadler();
        System.out.println(stringArrayHandler2.stringsHadler().toString());

        System.out.println("----------------");

        StringArrayHandler stringArrayHandler3 = new StringArrayHandler(strings,
                new ToUpperCaseAction(),
                new LengthCondition(2));
        stringArrayHandler3.stringsHadler();
        System.out.println(stringArrayHandler3.stringsHadler().toString());


        System.out.println("----------------");

        ActionAndConditionExample example = new ActionAndConditionExample();
        StringArrayHandler stringArrayHandler4 = new StringArrayHandler(strings,
                example,
                example);
        stringArrayHandler4.stringsHadler();
        System.out.println(stringArrayHandler4.stringsHadler().toString());
    }
}


