package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Sort_Array_By_Frequency {
	
	public ArrayList<Integer> sortArray(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for (int x : arr) {
			if (hm.containsKey(x))
				hm.put(x, hm.get(x)+1);
			else
				hm.put(x, 1);
			result.add(x);
		}
		
		Collections.sort(result, (i1, i2) -> {
			if (hm.get(i1) == hm.get(i2))
				return i1.compareTo(i2);
			else
				return hm.get(i2).compareTo(hm.get(i1));
		});
		
//		Collections.sort(result, new Comparator<Integer>() {
//			public int compare(Integer i1, Integer i2) {
//				int valCompare = i1.compareTo(i2);
//				int freqCompare = hm.get(i2).compareTo(hm.get(i1));
//				
//				if (freqCompare == 0)
//					return valCompare;
//				else
//					return freqCompare;
//			}
//		});
		
		return result;
	}

}
