package homework.b4;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        Thread thread = new Thread(generator);
        Thread thread2 = new Thread(generator);
        thread.setPriority(Thread.MAX_PRIORITY); // Set to maximum priority (10)
        thread2.setPriority(Thread.MIN_PRIORITY); // Set to minimum priority (1)
        thread.start();
        thread2.start();
    }
}
