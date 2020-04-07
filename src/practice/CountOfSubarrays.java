package practice;

import java.util.ArrayList;

public class CountOfSubarrays {
	
	public int numRange(ArrayList<Integer> A, int B, int C) {
		int x = count(A, B-1);
		int y = count(A, C);
		return y-x;
	}
	
	public int count(ArrayList<Integer> A, int x) {
		int count = 0;
		int sum = 0;
		int start = 0;
		int i = 0;
		
		while(i < A.size()) {
			sum += A.get(i);
			
			while(sum>x && start<=i) {
				sum -= A.get(start);
				start++;
			}
			count += i-start+1;
			i++;
		}
		
		return count;
	}

}
