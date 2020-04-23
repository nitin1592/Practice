package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stone {
	
	public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i : stones)
            al.add(i);
        
        Collections.sort(al, Collections.reverseOrder());
        
        while (al.size() != 1) {
            int x = al.get(0);
            int y = al.get(1);
            
            if (x != y) {
                int val = x-y;
                System.out.println("New Stone val : " + val);
                int index = findPosition(al, val);
//                System.out.println("index : " + index);
                al.add(index, val);
//                System.out.println();
                System.out.print("before removal : ");
                PrintArrayList.printSingleArrayList(al);
                System.out.println();
                al.remove(0);
                al.remove(0);
            }
            else {
            	al.remove(0);
            	al.remove(0);
            }
        }
        return al.get(0);
    }
    
    public int findPosition(ArrayList<Integer> al, int x) {
        int low = 0;
        int high = al.size()-1;
        int mid = low + (high-low)/2;
        
//        System.out.println("low = " + low + "  mid = " + mid + "  high = " + high);
        while(low+1 < high) {
//        	System.out.println("in while");
//        	PrintArrayList.printSingleArrayList(al);
//        	System.out.println();
        	System.out.println("low = " + low + "  mid = " + mid + "  high = " + high);
            if (al.get(mid) == x)
                return mid;
            else if (al.get(mid) > x)
                low = mid;
            else
                high = mid;
            
            mid = low + (high-low)/2;
        }
        return mid;
    }

}
