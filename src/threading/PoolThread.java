package threading;

public class PoolThread extends Thread {
	
	private BlockingQueue blockingQueue = null;
	private boolean isStopped = false;
	
	public PoolThread(BlockingQueue blockingQueue) {
		this.blockingQueue = blockingQueue;
	}
	
	public void run() {
		while (!isStopped) {
			try{
                Runnable runnable = (Runnable) blockingQueue.dequeue();
                runnable.run();
            }
			catch(Exception e) {
            }
		}
	}
	
	public synchronized void stopThread() {
		this.isStopped = true;
		this.interrupt();
	}

}
