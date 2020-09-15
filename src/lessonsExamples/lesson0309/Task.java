package lessonsExamples.lesson0309;

import java.util.Objects;

public class Task {
    private String taskID;
    private String description;
    private Status status;

    public Task(String taskID, String description, Status status) {
        this.taskID = taskID;
        this.description = description;
        this.status = status;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(taskID, task.taskID) &&
                Objects.equals(description, task.description) &&
                status == task.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskID, description, status);
    }

    @Override
    public String toString() {
        return "Task " + taskID + '\'' +
                " " + description + '\'' +
                ", status=" + status +
                '}';
    }
}
