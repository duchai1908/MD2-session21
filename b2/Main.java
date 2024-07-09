package homework.b2;

import homework.b1.CountSecondToOut;

public class Main {
    public static void main(String[] args) {
        CountNumberTo1000 counter = new CountNumberTo1000();
        Thread thread = new Thread(counter);
        thread.start();
    }
}
