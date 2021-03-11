package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

public class Task2 {
    //Дано целое число n, вернуть абсолютную разницу между n и 21, но вернуть удвоенную разницу, если n больше 21

    public static void main(String[] args) {
        System.out.println("Static method diff21: ");
        System.out.println("If n = 25, result is " + diff21(25)); //8
        System.out.println("If n = 10, result is " + diff21(10)); //11
        System.out.println("If n = 19, result is " + diff21(19)); //2
        System.out.println("If n = -2, result is " + diff21(-2)); //23
        System.out.println("If n = 21, result is " + diff21(21)); //0

        System.out.println("Same task but object oriented decision: ");
        System.out.println("If n = 25, result is " + (new CompareTo21(25)).diff21());
        System.out.println("If n = 10, result is " + (new CompareTo21(10)).diff21());
        System.out.println("If n = 19, result is " + (new CompareTo21(19)).diff21());
        System.out.println("If n = -2, result is " + (new CompareTo21(-2)).diff21());
        System.out.println("If n = 21, result is " + (new CompareTo21(21)).diff21());
    }

    public static int diff21(int n) {
        int measure = 21;
        int diff = Math.abs(n - measure);
        if (n > measure) {
            diff *= 2;
        } else {
            return diff;
        }
        return diff;
    }
}
