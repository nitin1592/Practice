package practice;

import java.util.HashSet;

public class GenerateAnagrams {
	HashSet<String> hs = new HashSet<String>();
	
	public HashSet<String> printAnagramsEfficiently(String s) {
		HashSet<String> result = new HashSet<String>();
		if (s.length() == 0) {
			result.add("");
			return result;
		}
		
		char ch = s.charAt(0);
		String remainingString = s.substring(1);
		
		HashSet<String> words = printAnagramsEfficiently(remainingString);
		
		for (String word : words) {
			for (int i=0; i<=word.length(); i++) {
				String prefix = word.substring(0, i);
				String suffix = word.substring(i);
				String str = prefix + ch + suffix;
				
				if (!result.contains(str)) {
					result.add(str);
				}
			}
		}
		return result;
	}
	
	public void printAnagrams(StringBuffer sb, int n, int index) {
		
		if (index == n) {
			if (!hs.contains(sb.toString())) {
				hs.add(sb.toString());
				System.out.print(sb.toString() + " ");
			}				
		}
		else {
			for (int i=index; i<=n; i++) {
				char temp = sb.charAt(i);
				sb.setCharAt(i, sb.charAt(index));
				sb.setCharAt(index, temp);
				
				printAnagrams(sb, n, index+1);
				
				temp = sb.charAt(i);
				sb.setCharAt(i, sb.charAt(index));
				sb.setCharAt(index, temp);
			}
		}
		
//		for (int i=index; i<n; i++) {
//			for (int j=i+1; j<n; j++) {
//				char temp = sb.charAt(i);
//				sb.setCharAt(i, sb.charAt(j));
//				sb.setCharAt(j, temp);
//				
//				printAnagrams(sb, n, i+1);
//				
//				temp = sb.charAt(i);
//				sb.setCharAt(i, sb.charAt(j));
//				sb.setCharAt(j, temp);
//			}
//		}
	}

}
