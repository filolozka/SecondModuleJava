package lessonsExamples.lesson0309;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

class TaskHandlerTest {

    @Test
    public void taskHandler_listEngineers_listTaskWithResponsible(){
        Engineer p1 = new Engineer("Ivan", "Ivanov",
                Arrays.asList(new Task ("1", "1", Status.PENDING),
                new Task ("2", "2", Status.NOTACCEPTED),
                new Task ("3", "3", Status.READY),
                new Task ("4", "4", Status.PENDING)));
        Engineer p2 = new Engineer("Maria", "Ivanova",
                Arrays.asList(new Task ("12", "12", Status.PENDING),
                        new Task ("13", "13", Status.NOTACCEPTED),
                        new Task ("14", "14", Status.READY),
                        new Task ("15", "15", Status.PENDING)));
        Engineer p3 = new Engineer("Petya", "Petrov",
                Arrays.asList(new Task ("20", "20", Status.PENDING),
                        new Task ("21", "21", Status.NOTACCEPTED),
                        new Task ("22", "22", Status.NOTACCEPTED),
                        new Task ("23", "23", Status.PENDING)));

        List<Engineer> engineers = new ArrayList<>();
        engineers.add(p1);
        /*engineers.add(p2);
        engineers.add(p3);*/

        TaskWithResponsible task1 = new TaskWithResponsible(new Task ("2", "2", Status.NOTACCEPTED), p1);
        TaskWithResponsible task2 = new TaskWithResponsible(new Task ("13", "13", Status.NOTACCEPTED), p2);
        TaskWithResponsible task3 = new TaskWithResponsible(new Task ("21", "21", Status.NOTACCEPTED), p3);
        TaskWithResponsible task4 = new TaskWithResponsible(new Task ("22", "22", Status.NOTACCEPTED), p3);

        List<TaskWithResponsible> expectedList = new ArrayList<>();
        expectedList.add(task1);
//        expectedList.add(task2);
//        expectedList.add(task3);
//        expectedList.add(task4);

       // assertEquals(expectedList, TaskHandler.taskHandler(engineers));
        assertEquals(expectedList, TaskHandler.taskHandler(engineers));

        //дописать другие тесты тоже
    }

}