package lessonsExamples.lesson0709;

public enum Priority implements Comparable<Priority> {
    HIGH (1),
    NORMAL (2),
    LOW (3);

    Priority(int i) {
    }

    public int getPriorityInt() {
        switch (this){
            case HIGH: return 1;
            case NORMAL: return 2;
            case LOW:return 3;
        }
        return 0;
    }
}
