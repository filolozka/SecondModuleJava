package lessonsExamples.lesson0309;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Engineer {
    private String name;
    private String secondName;
    private List<Task> tasks;

    public Engineer(String name, String secondName, List<Task> tasks) {
        this.name = name;
        this.secondName = secondName;
        this.tasks = tasks;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public List<Task> getTasks(Status status){
        List<Task> resList = new ArrayList<>();
        for (Task iTask : tasks) {
            if (iTask.getStatus().equals(Status.NOTACCEPTED)){
                resList.add(iTask);
            }
        }
        return resList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engineer engineer = (Engineer) o;
        return Objects.equals(name, engineer.name) &&
                Objects.equals(secondName, engineer.secondName) &&
                Objects.equals(tasks, engineer.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, tasks);
    }

    @Override
    public String toString() {
        return "Engineer: " +
                name + '\'' + secondName;
    }
}
