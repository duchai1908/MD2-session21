package homework.b10;

public class SleepWithTime implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(Main.timeInput);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Sleep finished" + Main.timeInput);
    }
}
