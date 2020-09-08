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
        return 0; //дописать в качестве дз
    }
}
