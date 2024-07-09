package homework.b2;

public class CountNumberTo1000 implements Runnable{
    @Override
    public void run() {
        int count =0;
        while(count<=1000){
            try {
                System.out.println("count: "+count);
                count=count+50;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Finish count: "+(count-50));
    }
}
