package homework.b8;

public class Main {
    public static void main(String[] args) {
        PlusNumber pl = new PlusNumber();
        Thread t = new Thread(pl);
        t.start();
    }
}
