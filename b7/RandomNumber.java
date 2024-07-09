package homework.b7;

import java.util.List;
import java.util.Random;

public class RandomNumber extends Thread {
    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100); // Generate a random number between 0 and 99
            System.out.println("Random Number: " + randomNumber);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Random number generation completed.");

    }
}
