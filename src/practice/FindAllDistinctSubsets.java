package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class FindAllDistinctSubsets {
	
	HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
	
	public ArrayList<ArrayList<Integer>> subsetsWithDup(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		result.add(new ArrayList<Integer>());
		if(A.size()==0)
			return result;
		
		Collections.sort(A);
		subsetsWithDupImpl(A, new ArrayList<Integer>(), result, 0);
		return result;
    }
	public void subsetsWithDupImpl(ArrayList<Integer> A, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result, int x) {
		for(int i=x; i<A.size(); i++) {
			temp.add(A.get(i));
			if(!hs.contains(temp)) {
				result.add(new ArrayList<Integer>(temp));
				hs.add(new ArrayList<Integer>(temp));
			}
			subsetsWithDupImpl(A, temp, result, i+1);
			temp.remove(temp.size()-1);
		}
	}
	


	public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
        result.add(temp);
        
        if(A.size()==0)
        	return result;
        
        Collections.sort(A);
		subsetsImpl(A, new ArrayList<Integer>(), result, 0);
        return result;
    }
	public void subsetsImpl(ArrayList<Integer> A, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> result, int index) {
		for(int i=index; i<A.size(); i++) {
			temp.add(A.get(i));
			result.add(new ArrayList<Integer>(temp));
			subsetsImpl(A, temp, result, i+1);
			temp.remove(temp.size()-1);
		}
	}
}
