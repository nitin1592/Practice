package graphs;

import java.util.ArrayList;
import java.util.Collections;

import practice.Pair;

public class Min_Swaps {
	
	public int countMinSwaps (int[] arr) {
		int count = 0;
		int n = arr.length;
		
		ArrayList<Pair> al = new ArrayList<Pair>();
		
		for (int i=0; i<n; i++) {
			al.add(new Pair(arr[i], i));
		}
		
		al.sort( (o1, o2) -> {
			return o1.first-o2.first;
		});
		
		boolean[] visited = new boolean[n];
		
		for (int i=0; i<n; i++) {
			if (visited[i] || al.get(i).second==i)
				continue;
			
			int j = i;
			int cycleSize = 0;
			
			while (!visited[j]) {
				visited[j] = true;
				j = al.get(j).second;
				cycleSize++;
			}
			
			count += cycleSize-1;
		}
		for (Pair p : al)
			System.out.println(p.first + " " + p.second);
		
		return count;
	}

}
