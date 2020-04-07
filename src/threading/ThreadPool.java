package threading;

import java.util.ArrayList;
import java.util.List;

public class ThreadPool {
	
	private BlockingQueue blockingQueue = null;
	private List<PoolThread> threads;
	private boolean isStopped = false;
	
	public ThreadPool(int maxQueueSize, int noOfThreads) {
		blockingQueue = new BlockingQueue(maxQueueSize);
		threads = new ArrayList<PoolThread>();
		
		for (int i=0; i<noOfThreads; i++) {
			threads.add(new PoolThread(blockingQueue));
		}
		
		for (PoolThread thread : threads) {
			thread.start();
		}
	}
	
	public synchronized void execute(Runnable task) throws InterruptedException {
		if (this.isStopped) {
			throw new IllegalStateException("Thread Pool is stopped");
		}
		this.blockingQueue.enqueue(task);
	}
	
	public synchronized void stop() {
		this.isStopped = true;
		for (PoolThread thread : threads) {
			thread.stopThread();
		}
	}
}
