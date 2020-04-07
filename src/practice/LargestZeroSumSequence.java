package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class LargestZeroSumSequence {
	public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        int sum = 0;
        int start=0, end=0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i=0; i<A.size(); i++) {
            sum += A.get(i);
            
            if(!hm.containsKey(sum))
            	hm.put(sum, i);
            else {
        		if((i-hm.get(sum)) > (end-start)) {
        			start = hm.get(sum);
        			end = i;
        		}
            }
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=start+1; i<=end; i++) {
        	result.add(A.get(i));
        }
        return result;
    }

}
