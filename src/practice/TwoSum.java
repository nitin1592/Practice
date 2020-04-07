package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
	
	public ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<A.size(); i++)
        {
        	int current = A.get(i);
        	
        	if(hm.containsKey(B-current)) {
        		result.add(hm.get(B-current) + 1);
        		result.add(i+1);
        		return result;
        	}
        	if(!hm.containsKey(current))
        		hm.put(current, i);
        }
		return result;
        
    }

}
