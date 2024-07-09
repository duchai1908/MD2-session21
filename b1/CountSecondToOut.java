package homework.b1;

import java.time.LocalTime;

public class CountSecondToOut implements Runnable {


    @Override
    public void run() {
        LocalTime startTime = LocalTime.now();
        LocalTime endTime = startTime.plusSeconds(10);
        while (LocalTime.now().isBefore(endTime)) {
            LocalTime currentTime = LocalTime.now();
            System.out.println("Second: " + currentTime.getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finished counting seconds.");
    }
}
