package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class EqualPairs {
	public static class Pair {
		private int first;
		private int second;
		public Pair(int first, int second) {
			this.first = first;
			this.second = second;
		}
	}
	
	public ArrayList<Integer> findEqualPairs(ArrayList<Integer> A) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		HashMap<Integer, Pair> hm = new HashMap<Integer, Pair>();
		
		ArrayList<Integer> r = new ArrayList<Integer>();
		for(int i=0; i<A.size(); i++) {
			for(int j=i+1; j<A.size(); j++) {
				int sum = A.get(i)+A.get(j);
				
				if(!hm.containsKey(sum)) {
					hm.put(sum, new Pair(i, j));
					continue;
				}
				
				Pair p = hm.get(sum);
				if(p.first!=i && p.first!=j && p.second!=i && p.second!=j) {
					r.clear();
					r.add(p.first); r.add(p.second);
					r.add(i); r.add(j);
				}
				if(result.size()==0)
					result.addAll(r);
				else {
					for(int x=0; x<r.size(); x++) {
						if(result.get(x) < r.get(x))
							break;
						if(r.get(x) < result.get(x)) {
							result.clear();
							result.addAll(r);
							break;
						}
					}
				}
			}
		}
		return result;
	}

}
