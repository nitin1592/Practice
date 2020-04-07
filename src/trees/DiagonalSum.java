package trees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DiagonalSum {
	
	public void diagonalSum(Node root) {
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		diagonalSumImpl(root, 1, hm);
		
		for (Map.Entry<Integer, Integer> me : hm.entrySet()) {
			System.out.println(me.getKey() + "->" + me.getValue());
		}
	}
	
	public void diagonalSumImpl(Node root, int d, HashMap<Integer, Integer> hm) {
		if(root == null)
			return;
		
		Integer i = hm.get(d);
		if (i == null)
			hm.put(d, root.data);
		else
			hm.put(d, i+root.data);
		
		diagonalSumImpl(root.right, d, hm);
		diagonalSumImpl(root.left, d+1, hm);
	}

}
