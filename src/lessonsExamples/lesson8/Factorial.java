package lessonsExamples.lesson8;

//5! = 1*2*3*4*5
//n! = 1*2*3*...(n-1)*n

//решение: факториал 5! = 4! * 5
//4! = 3! * 4
//3! = 2! * 3

public class Factorial {
    public static void main(String[] args) {
        int n = 7;
        int m = 5;
        System.out.println("Факториал числа " + n + " равен: " + findFactorial(n));
        System.out.println("Факториал числа " + m + " равен: " + fact(m));
    }

    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static int fact(int n) {
        if (n <= 1) return 1;
        return n * fact(n - 1);
    }
}
