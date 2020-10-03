package lessonsExamples.lesson2509.hw2709.BeginnerAssignments2;

public class Task4 {
    //Даны три целых числы a b c, вернуть наибольшее.

    public static void main(String[] args) {
        System.out.println("Method intMax: " + intMax2(10, 5, 15));
        System.out.println("Method intMax2: " + intMax2(5, 15, 25));
    }

    public static int intMax(int a, int b, int c){
        if (a >= b && a >= c){
            return a;
        }
        else if (b >= a && b >= c){
            return b;
        }
        else {
            return c;
        }
    }

    public static int intMax2(int a, int b, int c){
        return Math.max(Math.max(a, b), c);
    }
}
