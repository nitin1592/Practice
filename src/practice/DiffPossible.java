package practice;

import java.util.ArrayList;
import java.util.Collections;

public class DiffPossible {
	
	public int diffPossible(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        
        int i=0, j=1;
        while(i<A.size() && j<A.size()) {
        	int diff = A.get(j)-A.get(i);
        	if(i !=j && diff == B)
        		return 1;
        	else if(diff < B)
        		j++;
        	else
        		i++;
        }
        return 0;
    }

}
