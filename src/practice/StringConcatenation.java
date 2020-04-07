package practice;

import java.util.ArrayList;
import java.util.HashMap;

public class StringConcatenation {
	
	public ArrayList<Integer> findSubstring(String A, final ArrayList<String> B) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int word_Size = B.get(0).length();
		int total_Words = B.size();
		int l = word_Size*total_Words;
		
		// Return empty arraylist if combined length of all strings is greater than the length of given string
		if(l>A.length())
			return result;
		
		//Populating the hash map
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int i=0; i<total_Words; i++) {
			String key = B.get(i);
			
			if(hm.containsKey(key))
				hm.put(key, hm.get(key)+1);
			else
				hm.put(key, 1);
		}

		HashMap<String, Integer> temp = new HashMap<String, Integer>();
		
		// Iterating String for occurences
		for(int i=0; i<=A.length()-l; i++) {
			// copied the map into temporary map
			temp.clear();
			temp.putAll(hm);
			
			int index = i;
			int count = total_Words;
			
			while(index < i+l) {
				String s = A.substring(index, index+word_Size);
				if(!temp.containsKey(s) || temp.get(s)==0)
					break;
				else {
					count--;
					temp.put(s, temp.get(s)-1);
				}
				index += word_Size;
			}
			if(count==0)
				result.add(i);
		}
		
		return result;
	}

}
