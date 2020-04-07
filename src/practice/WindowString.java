package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;

public class WindowString {

	public String minWindow(String A, String B) {
		int i;
		HashMap<Character, Integer> pattern_Map = new HashMap<Character, Integer>();
		HashMap<Character, Integer> string_Map = new HashMap<Character, Integer>();
		
		for (i=0; i<B.length(); i++) {
			char key = B.charAt(i);
			if(!pattern_Map.containsKey(key))
				pattern_Map.put(key, 1);
			else
				pattern_Map.put(key, pattern_Map.get(key)+1);
		}
		
		int start = 0;
		int count = 0;
		int startIndex = -1, min_Length = Integer.MAX_VALUE;
		
		for (i=0; i<A.length(); i++) {
			char key = A.charAt(i);
			
			if (!string_Map.containsKey(key))
				string_Map.put(key, 1);
			else
				string_Map.put(key, string_Map.get(key)+1);

			if (pattern_Map.containsKey(key) && string_Map.get(key) <= pattern_Map.get(key) )
				count++;
			
			if (count == B.length()) {
				while ( !pattern_Map.containsKey(A.charAt(start)) || string_Map.get(A.charAt(start)) > pattern_Map.get(A.charAt(start)) ) {
					if ( pattern_Map.containsKey(A.charAt(start)) && string_Map.get(A.charAt(start)) > pattern_Map.get(A.charAt(start)) )
							string_Map.put(A.charAt(start), string_Map.get(A.charAt(start))-1);
					start++;
				}
				
				int length = i-start+1;
				if (length < min_Length) {
					min_Length = length;
					startIndex = start;
				}
			}
		}
		
		if (startIndex == -1) {
			return "";
		}
		
		return A.substring(startIndex, startIndex+min_Length);
    }
}
