package homework.b9;

public class Main {
    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        Thread thread = new Thread(reverseNumber);
        thread.start();
    }
}
