package homework.b6;

public class Main {
    public static void main(String[] args) {
        long numberToFactorize = 123456789L; // Example number to factorize
        OptimizedPrimeFactorization task = new OptimizedPrimeFactorization(numberToFactorize);
        Thread thread = new Thread(task);
        thread.start();
    }
}
