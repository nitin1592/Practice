package threading;

public class MyThread extends Thread{
	public void run() {
		System.out.println("Thread is " + Thread.currentThread().getName());
	}

}
