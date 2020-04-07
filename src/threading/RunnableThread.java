package threading;

public class RunnableThread implements Runnable {
	ThreadExample threadExample = null;
	public RunnableThread(ThreadExample threadExample) {
		this.threadExample = threadExample;
	}

	@Override
	public void run() {
		threadExample.add(2);
	}

}
