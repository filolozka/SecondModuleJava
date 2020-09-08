package lessonsExamples.lesson0709;

public class Task implements Comparable<Task> {
    private int id;
    private Priority priority;
    private String description;
    private Status status;

    public Task(int id, Status status, String description) {
       this(id, Priority.LOW, description, status);
    }

    public Task(int id, Priority priority, String description, Status status) {
        this.id = id;
        this.priority = priority;
        this.description = description;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public Priority getPriority() {
        return priority;
    }

    public int getPriorityInt() {
        switch (priority){
            case HIGH: return 1;
            case NORMAL: return 2;
            case LOW:return 3;
        }
        return 0;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", priority=" + priority +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Task o) {
        return new ComparatorPriority().compare(this, o);
    }
}
