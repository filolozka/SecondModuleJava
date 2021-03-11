package lessonsExamples.lesson0709;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @Test
    void compareTo() {
        Task t1 = new Task(1, Priority.HIGH, "1", Status.READY);
        Task t2 = new Task(2, Priority.LOW, "1", Status.READY);
        Task t3 = new Task(3, Priority.NORMAL, "1", Status.READY);
        Task t4 = new Task(4, Priority.HIGH, "1", Status.READY);

        assertEquals(0, t1.compareTo(t4));
        assertTrue(t1.compareTo(t2) < 0);
        assertTrue(t1.compareTo(t3) < 0);
        assertTrue(t2.compareTo(t3) < 0);
        assertTrue(t2.compareTo(t4) < 0);
        assertTrue(t4.compareTo(t2) > 0);
    }
}