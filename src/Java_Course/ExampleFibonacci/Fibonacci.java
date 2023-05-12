package Java_Course.ExampleFibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        fibo(1);
        fibo(2);
        fibo(6);
        fibo(10);
    }

    public static void fibo(int n) {
        long n1 = 1;
        long n2 = 1;
        for (int i=3; i<=n; i++) {
            long temp = n2 + n1;
            n1 = n2;
            n2 = temp;
        }
        System.out.println(n2);
    }
}
