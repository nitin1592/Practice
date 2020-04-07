package practice;

import practice.HotelReviews.TrieNode;

public class Trie {
	
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
	static void displayContents(TrieNode root, String s) {
		if(root.isEndOfWord == true)
			System.out.println(s);
		
		for(int i=0; i<26; i++) {
			if(root.children[i] != null) {
				s += (char)(97+i);
				displayContents(root.children[i], s);
				s = s.substring(0, s.length()-1);
			}
		}
	}
	static boolean isEmpty(TrieNode root) {
		for(int i=0; i<26; i++) {
			if(root.children[i] != null)
				return false;
		}
		return true;
	}
	static TrieNode delete(TrieNode root, String key, int index) {
		if(root==null || key=="")
			return null;
		if(index == key.length()) {
			if(root.isEndOfWord)
				root.isEndOfWord = false;
			if(isEmpty(root))
				root=null;
			return root;
		}
		
		if(index<key.length()) {
			int i = key.charAt(index) - 'a';
			root.children[i] = delete(root.children[i], key, index+1);
			
			if (isEmpty(root) && root.isEndOfWord == false) 
		        root = null;
		}
		return root;
	}
	
	public static void main(String[] args) {
		root = new TrieNode();
		insert("nitin");
		insert("hi");	insert("hello");	insert("hell");	insert("helloworld");
		//System.out.println(isPresent("helloworld"));
		delete(root, "hell", 0);
		displayContents(root, "");
	}

}
