package practice;

import java.util.ArrayList;

public class AbsoluteDifference {
	
	public int absDiff(ArrayList<Integer> A, ArrayList<Integer> B, ArrayList<Integer> C) {
		int minDiff = Integer.MAX_VALUE;
        int i=0, j=0, k=0;
        while(i<A.size() && j<B.size() && k<C.size()) {
            int a = A.get(i);
            int b = B.get(j);
            int c = C.get(k);
            int minElement = Math.min(a, Math.min(b, c));
            int maxElement = Math.max(a, Math.max(b, c));
            int diff = maxElement - minElement;
            
            if(diff < minDiff)
                minDiff = diff;
            
            if(diff==0)
                break;
            
            if(minElement == a)
                i++;
            else if(minElement == b)
                j++;
            else
                k++;
        }
        return minDiff;
	}

}
