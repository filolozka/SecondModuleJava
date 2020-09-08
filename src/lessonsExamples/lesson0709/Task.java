package lessonsExamples.lesson0709;

import java.util.Objects;

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
        return priority.getPriorityInt();
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id &&
                priority == task.priority &&
                Objects.equals(description, task.description) &&
                status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, priority, description, status);
    }

    @Override
    public int compareTo(Task o) {
       // return new ComparatorPriority().compare(this, o);
        //int answer = this.getPriorityInt() - o.getPriorityInt();
        //return Integer.compare(0, answer);

        return this.getPriority().compareTo(o.getPriority());
    }
}
