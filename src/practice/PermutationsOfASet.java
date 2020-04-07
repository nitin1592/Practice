package practice;

import java.util.ArrayList;

public class PermutationsOfASet {
	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	public ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		generatePermutations(A, 0, A.size()-1);
		
		return result;
    }
	public void generatePermutations(ArrayList<Integer> a, int l, int h) {
		if(l == h) {
			result.add(new ArrayList<Integer>(a));
			return;
		}
		
		for(int i=l; i<=h; i++) {
			
			int temp = a.get(i);
			a.set(i, a.get(l));
			a.set(l, temp);

			generatePermutations(a, l+1, h);
			
			temp = a.get(i);
			a.set(i, a.get(l));
			a.set(l, temp);

		}
	}
}
