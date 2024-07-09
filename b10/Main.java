package homework.b10;

import java.util.Scanner;

public class Main {
    public static long timeInput = 0;
    public static void main(String[] args) {
        System.out.println("Enter time to wait");
        Scanner sc = new Scanner(System.in);
        timeInput = Long.parseLong(sc.nextLine());

        SleepWithTime sl = new SleepWithTime();
        Thread t1 = new Thread(sl);
        t1.start();
    }
}
