package lessonsExamples.lesson0309;

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
    public String toString() {
        return "Task: " + task + ", responsible= " + engineer.getName() + '}';
    }
}
