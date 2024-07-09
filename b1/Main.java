package homework.b1;

public class Main {
    public static void main(String[] args) {
//        CountSecondToOut countSecondToOut = new CountSecondToOut();
//        countSecondToOut.run();
        CountSecondToOut countSecondToOut = new CountSecondToOut();
        Thread thread = new Thread(countSecondToOut);
        thread.start();
    }
}
