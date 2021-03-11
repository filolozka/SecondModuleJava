package lessonsExamples.lesson0709;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Handler {

    public static Queue<Task> taskQueue(List<Task> tasks){
        Queue<Task> result = new PriorityQueue<>(tasks);

        return result;
    }
}
