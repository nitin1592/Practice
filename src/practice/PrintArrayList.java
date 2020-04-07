package practice;

import java.util.ArrayList;

public class PrintArrayList {
	
	public static void printSingleArrayList(ArrayList<Integer> al) {
		
		for(int i=0; i<al.size(); i++) {
			System.out.print(al.get(i) + " ");
		}
	}
	
	public static void printDoubleArrayList(ArrayList<ArrayList<Integer>> al) {
		
		for(int i=0; i<al.size(); i++) {
			for(int j=0; j<al.get(i).size(); j++)
				System.out.print(al.get(i).get(j) + " ");
			System.out.println();
		}
	}

}
