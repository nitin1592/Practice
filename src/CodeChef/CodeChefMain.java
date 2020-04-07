package CodeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CodeChefMain {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String testCases = br.readLine().trim();
		
		int T = Integer.parseInt(testCases);
		
		while (T > 0) {
			
			String[] next = br.readLine().split(" ");
			int N = Integer.parseInt(next[0]);
			int K = Integer.parseInt(next[1]);
			
			next = br.readLine().split(" ");
			
			int[] arr = new int[N];
			for (int i=0; i<N; i++) {
				arr[i] = Integer.parseInt(next[i]);
			}
			
			new Interesting_SubSequence().countSubSequences(arr, K);
			
			T--;
		}

	}

}
