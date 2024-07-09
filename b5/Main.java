package homework.b5;

public class Main {
    public static void main(String[] args) {
        FindEvenNumber f = new FindEvenNumber();
        FinOddNumber f1 = new FinOddNumber();
        Thread thread = new Thread(f);
        Thread thread1 = new Thread(f1);
        thread.start();
        thread1.start();
    }
}
