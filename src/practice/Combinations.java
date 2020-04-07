package practice;

import java.util.ArrayList;

public class Combinations {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	
	public ArrayList<ArrayList<Integer>> combine(int A, int B) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		result.add(temp);
		
		if(B>A)
			return result;
		
		combineImpl(new ArrayList<Integer>(), A, 0, B);
		
		return result;
    }
	public void combineImpl(ArrayList<Integer> temp, int A, int index, int B) {
		
		if(B==0) {
			result.add(new ArrayList<Integer>(temp));
			return;
		}
		for(int i=index+1; i<=A; i++) {
			temp.add(i);
			combineImpl(temp, A, i, B-1);
			temp.remove(temp.size()-1);
		}
	}
}
