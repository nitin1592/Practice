package threading;

public class TwoSums {

	private int sum1 = 0;
	private int sum2 = 0;
	
	public synchronized void add(int val1, int val2) {
		this.sum1 += val1; 
		this.sum2 += val2;
	}
	public synchronized void subtract(int val1, int val2) {
		this.sum1 += val1; 
		this.sum2 += val2;
	}
	
	public static void main(String[] args) {
		TwoSums twoSums = new TwoSums();
		
		twoSums.add(1, 2);// thread1
		
		twoSums.add(3, 4); // thread2
	}
}