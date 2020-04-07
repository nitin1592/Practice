package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class FourSum {
	
	static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
	
    public ArrayList<ArrayList<Integer>> fourSum(ArrayList<Integer> A, int B){
    	
    	ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    	HashSet<ArrayList<Integer>> hs = new HashSet<ArrayList<Integer>>();
    	
    	Collections.sort(A);
    	
    	ArrayList<Integer> temp = null;
    	
    	for(int i=0; i<A.size(); i++) {
    		for(int j=i+1; j<A.size(); j++) {
    			int k = j+1;
    			int l = A.size()-1;
    			
    			while(k<l) {
    				int sum = A.get(i) + A.get(j) + A.get(k) + A.get(l);

    				if(sum<B)
    					k++;
    				else if(sum>B)
    					l--;
    				else {
    					temp = new ArrayList<Integer>();
    					temp.add(A.get(i)); temp.add(A.get(j));
    					temp.add(A.get(k)); temp.add(A.get(l));
    					
    					if(!hs.contains(temp)) {
        					result.add(temp);
        					hs.add(temp);
        				}
    					k++;
    					l--;
    				}
     			}
    		}
    	}
    	
    	return result;
    }


}
