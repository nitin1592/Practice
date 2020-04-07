package threading;

public class ThreadExample {
	int count = 0;
	public void add(int value) {
		synchronized(this) {
			this.count = this.count + value;
		}
	}

}
