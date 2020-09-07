package lessonsExamples.lesson0309;

import java.util.Objects;

public class TaskWithResponsible {
    private Task task;
    private Engineer engineer;

    public TaskWithResponsible(Task task, Engineer engineer) {
        this.task = task;
        this.engineer = engineer;
    }

    public Task getTask() {
        return task;
    }

    public Engineer getEngineer() {
        return engineer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TaskWithResponsible that = (TaskWithResponsible) o;
        return Objects.equals(task, that.task) &&
                Objects.equals(engineer, that.engineer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, engineer);
    }

    @Override
    public String toString() {
        return "Task: " + task + ", responsible= " + engineer.getName() + '}';
    }
}
