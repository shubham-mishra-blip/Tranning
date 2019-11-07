class Count extends Thread{
    Count(){
        super("Count Thread");
        System.out.println("Count Thread is going to start"+ this);
        start();
    }

    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Count ="+ i);
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Count classess ENded");
    }

}
public class MultithreadExtendsThread2 {

    public static void main(String[] args) throws InterruptedException{
        Count c = new Count();
        while(c.isAlive()) {
            System.out.println("Main Thread has been alived till Count class is alive");
            Thread.sleep(5000);
        }
        System.out.println("Main Thread ENded");

    }

}
