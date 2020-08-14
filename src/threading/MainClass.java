package threading;

public class MainClass {
	
	public static void main(String args[]) throws InterruptedException {
		
		Thread t = new MyThread() {
			public void run() {
				System.out.println("hi");
			}
		};
		t.start();
		
//		ThreadPool threadPool = new ThreadPool(4, 2);
//		
//		Runnable r1 = new Task("Task:1");
//		Runnable r2 = new Task("Task:2");
//		Runnable r3 = new Task("Task:3");
//		Runnable r4 = new Task("Task:4");
//		Runnable r5 = new Task("Task:5");
		
//		threadPool.execute(r1);		threadPool.execute(r2);
//		threadPool.execute(r3);		threadPool.execute(r4);
//		threadPool.execute(r5);
		
//		System.out.println(Thread.currentThread().getName());
//		ThreadExample te = new ThreadExample();
//		Thread thread1 = new Thread(new RunnableThread(te));
//		Thread thread2 = new Thread(new RunnableThread(te));
//		thread1.start();
//		thread2.start();
		
//		System.out.println(te.count);
//		Thread thread = new Thread(new RunnableThread());
//		thread.start();
//		for(int i=0; i<5; i++) {
//			MyThread thread = new MyThread();
//			thread.start();
//			try {
//				thread.sleep(100);
//			}
//			catch(InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
	}

}
