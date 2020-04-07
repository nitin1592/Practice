package practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class N_MaxPairCombinations {
	
	static class Pair {
        int first, second;
        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
    
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
    	
    	ArrayList<Integer> result = new ArrayList<Integer>();
        Collections.sort(A, Collections.reverseOrder());
        Collections.sort(B, Collections.reverseOrder());
        //HashMap<Integer, Pair> hm = new HashMap<Integer, Pair>();
        HashSet<Pair> hs = new HashSet<Pair>();
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
        
        hs.add(new Pair(0, 0));
        pq.add(new Pair(0,0));
        
        for(int count=0; count<A.size(); count++) {
        	Pair p = pq.peek();
        	pq.remove();
        	
        	//result.add();
        	pq.remove();
        	
        	int i=0, j=0;
        	
        	Pair p1 = new Pair(i+1, j);
        	Pair p2 = new Pair(i, j+1);
        	
        	if (!hs.contains(p1)) {
        		//pq.add(e)
        	}
        }
        
        return result;
    }

}
