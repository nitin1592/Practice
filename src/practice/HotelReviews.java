package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class HotelReviews {
	static class TrieNode {
		TrieNode[] children = new TrieNode[26];
		boolean isEndOfWord;
		public TrieNode() {
			isEndOfWord = false;
			for(int i=0; i<26; i++)
				children[i] = null;
		}
 	};
	static TrieNode root;
	
	static void insert(String key) {
		int length = key.length();
		TrieNode curr = root;

		for(int i=0; i<length; i++) {
			int index = key.charAt(i)-'a';
			if(curr.children[index] == null)
				curr.children[index] = new TrieNode();
			curr = curr.children[index];
		}
		curr.isEndOfWord = true;
	}
	
	static boolean isPresent(String key) {
		int length = key.length();
		TrieNode curr = root;
		for(int i=0; i<key.length(); i++) {
			int index = key.charAt(i)-'a';
			if(curr.children[index]==null)
				return false;
			curr = curr.children[index];
		}
		return(curr.isEndOfWord && curr!=null);
	}
	
	public ArrayList<Integer> solve(String A, ArrayList<String> B) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		TreeMap<Integer, ArrayList<Integer>> treeMap = new TreeMap<>();
		
		//inserting all good words in try
		root = new TrieNode();
		String[] str = A.split("_");
		for(String s : str)
			insert(s);
		
		for(int i=0; i<B.size(); i++) {
			String word = B.get(i);
			String newWord[] = word.split("_");
			int count = 0;
			for(String s : newWord) {
				if(isPresent(s))
					count++;
			}
			if(!treeMap.containsKey(count))
				treeMap.put(count, new ArrayList<>());
			treeMap.get(count).add(i);
		}
		
		for(int j=treeMap.lastKey();j>=treeMap.firstKey();j--){

            if(treeMap.containsKey(j)){
                result.addAll(treeMap.get(j));
            }
        }
		
		return result;
    }
}
