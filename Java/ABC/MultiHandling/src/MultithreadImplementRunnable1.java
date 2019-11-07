class Count1 implements Runnable {
    Thread myThread;

    Count1() {
        myThread = new Thread(this, "ABC");
        System.out.println("Thread is Run" + myThread);
        myThread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello Thread");
                Thread.sleep(4000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("THread class is ended");
    }

}

public class MultithreadImplementRunnable1 {
    public static void main(String[] args) throws InterruptedException {
    Count1 c1 = new Count1();

    while (c1.myThread.isAlive()){
        System.out.println("Main Thread is RUnning");
        Thread.sleep(4000);
    }
        System.out.println("Main class is ended");
    }
}
