package homework.b4;

public class NumberGenerator implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < Thread.MAX_PRIORITY; i++) {
            System.out.println("Number: " + i + " from " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
