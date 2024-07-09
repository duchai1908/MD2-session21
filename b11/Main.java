package homework.b11;

public class Main {
    public static void main(String[] args) {
        PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder();
        Thread thread = new Thread(primeNumberFinder);
        thread.start();
    }
}
