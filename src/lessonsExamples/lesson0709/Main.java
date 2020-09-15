package lessonsExamples.lesson0709;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task(1, Priority.HIGH, "1", Status.READY);
        Task task2 = new Task(2, Priority.LOW, "2", Status.DONTREADY);
        Task task3 = new Task(3, Priority.NORMAL, "3", Status.INPROGRESS);
        Task task4 = new Task(4, Priority.HIGH, "4", Status.READY);
        Task task5 = new Task(5, Priority.LOW, "5", Status.DONTREADY);
        Task task6 = new Task(6, Priority.HIGH, "6", Status.INPROGRESS);

        List<Task> tasks = new ArrayList<>();
        tasks.add(task1);
        tasks.add(task2);
        tasks.add(task3);
        tasks.add(task4);
        tasks.add(task5);
        tasks.add(task6);

       Queue<Task> queue = Handler.taskQueue(tasks);
        System.out.println(queue);
        Task iTask = queue.poll();
        while (iTask != null){
            System.out.println(iTask);
            iTask = queue.poll();
        }
        //System.out.println(queue);
    }
}
