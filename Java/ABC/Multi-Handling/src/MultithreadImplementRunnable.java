import java.util.Scanner;

class Demo9 implements Runnable{

	public void run() {
		System.out.println("adding Started");
		int i = 10;
		int j = 30;
		System.out.println(i+j);
		System.out.println("adding Ended");
	}
}
class Demo10 implements Runnable{
	public void run() {
		System.out.println("Printing Started");
		try {
			int i = 0;
			while (i < 5) {
				System.out.println("Hello Java");
				Thread.sleep(3000);
				i ++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Printing Ended");
	}
}
class Demo11 implements Runnable{
	public void run() {
		System.out.println("Banking Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		int u = sc.nextInt();
		System.out.println("ENter Password");
		int p = sc.nextInt();
		System.out.println("Successful Login! Take your money");
		System.out.println("Banking Ended");
	}
}     
    
}
public class MultithreadImplementRunnable {

	public static void main(String[] args) {
		Demo9 d1 = new Demo9();
		Demo10 d2 = new Demo10();
		Demo11 d3 = new Demo11();
		
		Thread t1 = new Thread(d1);
		Thread t2 = new Thread(d2);
		Thread t3 = new Thread(d3);
		
		t1.start();
		t2.start();
		t3.start();

	}

}
