package lessonsExamples.lesson0309;

import java.util.ArrayList;
import java.util.List;

public class TaskHandler {
    public static List<TaskWithResponsible> taskHandler(List<Engineer> engineers){
        List<TaskWithResponsible> result = new ArrayList<>();
        for (Engineer iEngineer : engineers) {
            List<Task> tempTask = iEngineer.getTasks(Status.NOTACCEPTED);
            for (Task iTask: tempTask) {
                result.add(new TaskWithResponsible(iTask, iEngineer));
            }
        }
        return result;
    }
}
