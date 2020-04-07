package practice;

import java.util.ArrayList;

public class TusharBdayBombs {
	
	static class Pair {
        int index, value;
        public Pair (int x, int y) {
            index = x;
            value = y;
        }
    }
    
    public ArrayList<Integer> solve(int A, ArrayList<Integer> B) {
        ArrayList<Pair> al = new ArrayList<Pair>();
        int minVal = Integer.MAX_VALUE;
        
        for (int i=0; i<B.size(); i++) {
            if (B.get(i) < minVal) {
                al.add(new Pair(i, B.get(i)));
                minVal = B.get(i);
            }
        }
        
        int n = al.size();
        int minStrength = al.get(n-1).value;
        int i = 0;

        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while (i<n) {
            int index = al.get(i).index;
            int value = al.get(i).value;
            
            if (value<=A && ((A-value)/minStrength)+1 == A/minStrength) {
                result.add(index);
                A -= value;
            }	
            else
                i++;
        }
        return result;
    }

}
