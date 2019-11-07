class Thread1 implements Runnable{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 5; i ++){
                System.out.println("Hii User I'm Running");
                Thread.sleep(5000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class JoinExampleMultiInheritance {
    public static void main(String[] args) throws InterruptedException {
    Thread1 t1 = new Thread1();

    Thread t = new Thread(t1);

    t.setName("Child Thread");

    t.start();
    t.join();    //wait for thread to terminate

        System.out.println("Main class ended");

    }
}
