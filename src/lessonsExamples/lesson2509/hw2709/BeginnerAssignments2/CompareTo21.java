package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;
//Дано целое число n, вернуть абсолютную разницу между n и 21, но вернуть
//удвоенную разницу, если n больше 21. Например:
//diff21(19) → 2
//diff21(10) → 11
//diff21(21) → 0
//diff21(25) → 8

public class CompareTo21 {
    private int measure = 21;
    private int difference = 0;
    private int numberToCompare = 0;

    public CompareTo21(int measure, int numberToCompare){
        this.numberToCompare = numberToCompare;
        this.measure = measure;
    }

    public CompareTo21(int numberToCompare){
        this.numberToCompare = numberToCompare;
    }

    public int diff21() {
        this.difference = Math.abs(numberToCompare - measure);
        if (compareTo() > 0){
            return difference * 2;
        }
        return difference;
    }

    public int compareTo() {
        return numberToCompare - measure;
    }
}
