class ThreadExtra extends Thread{
	ThreadExtra(){
		super("ABC");
		System.out.println("Thread is "+ this);
	}
	void print() {
		Thread t2 = Thread.currentThread();
		System.out.print(t2);
	}
	
}
public class ThreadDemo{
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		//Extra THread
		ThreadExtra te = new ThreadExtra();
		te.print();
	}

}
