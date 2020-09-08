package lessonsExamples.lesson0709;

import java.util.Comparator;

public class ComparatorPriority implements Comparator<Task> {
    @Override
    public int compare(Task o1, Task o2) {
        int answer = o1.getPriorityInt() - o2.getPriorityInt();
        return Integer.compare(0, answer);
    }
}
