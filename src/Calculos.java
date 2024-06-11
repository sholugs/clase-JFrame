public class Calculos {

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static long factorial(int n) {
        if (n == 0) return 1;
        else return n * factorial(n-1);
    }
}
