package lessonsExamples.lesson2508;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("str1");
        list1.add("qstr2");
        list1.add("qstr3");
        list1.add("str4");
        list1.add("qstr5");
        list1.add("str6");
        System.out.println(list1);

        //удалить элементы, которые начинаются с q
        /*for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i).startsWith("q")){
                list1.remove(i);
                i--;
            }
        }
*/
/*

        for (String s: list1) {
            if (s.startsWith("q")){ //выдает ошибку, в силу того, как устроен foreach - работает через итератор
                list1.remove(s);
            }
        }
*/
/*
        ListIterator<String> iterator = list1.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("q")){
                iterator.remove();
            }
        }*/

        Predicate<String> removeCondition = new ConditionForRemove(); //можно не заводить переменную, а сразу передать new...
        list1.removeIf(removeCondition);

        //list1.removeIf(s -> s.startsWith("q"));

        System.out.println("after removing: ");
        System.out.println(list1);

        String[] array = list1.toArray(new String[list1.size()]);
    }
}
