package threading;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {
	
	private int maxQueueSize;
	private List<Object> queue;
	
	public BlockingQueue(int maxQueueSize) {
		this.maxQueueSize = maxQueueSize;
		queue = new LinkedList<Object>();
	}
	
	public synchronized void enqueue(Object obj) throws InterruptedException {
		while (queue.size() == this.maxQueueSize) {
			wait();
		}
		queue.add(obj);
		if (queue.size() == 1) {
			notifyAll();
		}
	}
	
	public synchronized Object dequeue() throws InterruptedException {
		while (queue.size() == 0)
			wait();
		if (queue.size() == this.maxQueueSize) {
			notifyAll();
		}
		return this.queue.remove(0);
	}

}
