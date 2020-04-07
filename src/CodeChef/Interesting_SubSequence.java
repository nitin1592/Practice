package CodeChef;

import java.util.Arrays;

public class Interesting_SubSequence {
	
	public void countSubSequences(int[] arr, int k) {
		int len = arr.length;
		
		Arrays.sort(arr);
		int ele = arr[k-1];
		int n=0, r=0;
		
		for (int i=0; i<len; i++) {
			if (ele == arr[i]) {
				if (i<k)
					r++;
				n++;
			}
		}
		
		System.out.println(findCombinations(n, r));
		
	}
	
	public static long findCombinations(int n, int r) {
		long num=1, den=1;
		
		if (n-r < r)
			r = n-r;
		
		while (r!=0) {
			num *= n;
			den *= r;
			
			long gcd = findGCD(num, den);
			
			num /= gcd;
			den /= gcd;
			
			n--;
			r--;
		}
		return num;
	}
	
	public static long findGCD(long a, long b) {
		if (a == 0)
			return b;
		return findGCD(b, a%b);
	}

}
