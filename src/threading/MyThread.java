package threading;

public class MyThread extends Thread{
	MyThread() {
		System.out.println("My thread");
	}
	public void run() {
		System.out.println("run ");
	}
	
	public void run(String s) {
		System.out.println("run with para");
	}

}
