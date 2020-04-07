package threading;

import java.util.HashMap;

public class ReadWriteReentrantLock {
	private int writeAccesses = 0;
	private int writeRequests = 0;
	private HashMap<Thread, Integer> readingThreads = new HashMap<Thread, Integer>();
	private Thread writingThread = null;
	
	public synchronized void lockRead() throws InterruptedException {
		Thread callingThread = Thread.currentThread();
		while (!canGrantReadAccess(callingThread))
			wait();
		readingThreads.put(callingThread, getReadAccessCount(callingThread)+1);
	}
	
	public synchronized void unLockRead() {
		Thread callingThread = Thread.currentThread();
		if (!isReader(callingThread)) {
			throw new IllegalMonitorStateException("Calling thread does not hold read lock");
		}
		int readAccessCount = getReadAccessCount(callingThread);
		if (readAccessCount == 1)
			this.readingThreads.remove(callingThread);
		else
			this.readingThreads.put(callingThread, readAccessCount-1);
		notifyAll();
	}
	
	public synchronized void lockWrite() throws InterruptedException {
		Thread callingThread = Thread.currentThread();
		writeRequests++;
		while (!canGrantWriteAccess(callingThread))
			wait();
		writeRequests--;
		writeAccesses++;
		writingThread = callingThread;
	}
	
	public synchronized void unLockWrite() {
		Thread callingThread = Thread.currentThread();
		if (!isWriter(callingThread)) {
			throw new IllegalMonitorStateException("Calling thread does not hold write lock");
		}
		writeAccesses--;
		if (writeAccesses == 0) {
			this.writingThread = null;
		}
		notifyAll();
	}
	
	private boolean canGrantReadAccess(Thread callingThread) {
		if (isWriter(callingThread))	return true;
		if (hasWriter())				return false;
		if (isReader(callingThread))	return true;
		if (this.writeRequests>0)		return false;
		return true;
	}
	
	private boolean canGrantWriteAccess(Thread callingThread) {
		if (isOnlyReader(callingThread))	return true;
		if (hasReaders(callingThread))		return false;
		if (this.writingThread == null)		return true;
		if (isWriter(callingThread))		return true;
		return true;
	}
	
	private boolean isOnlyReader(Thread callingThread) {
		return (readingThreads.size()==1 && readingThreads.containsKey(callingThread));
	}
	
	private boolean hasReaders(Thread callingThread) {
		return (readingThreads.size() > 0);
	}
	
	private int getReadAccessCount(Thread callingThread) {
		if (!this.readingThreads.containsKey(callingThread))
			return 0;
		return this.readingThreads.get(callingThread);
	}
	
	private boolean isReader(Thread callingThread) {
		return (this.readingThreads.containsKey(callingThread));
	}
	
	private boolean isWriter(Thread callingThread) {
		return (this.writingThread == callingThread);
	}
	
	private boolean hasWriter() {
		return (this.writingThread != null);
	}
	
	public static void main(String[] args) {
		ReadWriteReentrantLock obj1 = new ReadWriteReentrantLock();
		ReadWriteReentrantLock obj2 = new ReadWriteReentrantLock();
		
		
	}

}
