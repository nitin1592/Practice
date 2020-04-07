package threading;

public class Task implements Runnable{
	
	private String name;
	
	public Task(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			System.out.println("This is " + name);
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
