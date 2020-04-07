package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class ZeroSumSubArrays {
	
	public void findArrays(int[] arr) {
		int n = arr.length;
		ArrayList<Pair> result = new ArrayList<Pair>();
		HashMap<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
		int sum = 0;
		
		for (int i=0; i<n; i++) {
			sum += arr[i];
			
			if (sum == 0) {
				result.add(new Pair(0, i));
			}
			ArrayList<Integer> al = new ArrayList<Integer>();
			if (hm.containsKey(sum)) {
				al = hm.get(sum);
				for (int j=0; j<al.size(); j++) {
					result.add(new Pair(al.get(j)+1, i));
				}
			}
			al.add(i);
			hm.put(sum, al);
		}
		
		for (Pair p : result) {
			System.out.println(p.first + " " + p.second);
		}
	}

}
