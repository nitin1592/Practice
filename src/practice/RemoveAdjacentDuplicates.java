package practice;

public class RemoveAdjacentDuplicates {
	
	public String removeDuplicates(String str) {
		int k = 0;
		char[] chars = str.toCharArray();
		char prev = chars[0];
		int len = chars.length;
		int i = 1;
		
		while (i < len) {
			if (chars[i] != prev) {
				chars[++k] = chars[i++];
				prev = chars[k];
			}
			else {
				while (i<len && prev==chars[i])
					i++;
				
				k--;
				if (k>=0) {
					prev = chars[k];
				}
			}
		}
		if (k < 0)
			return "";
		return new String(chars).substring(0, k+1);
	}

}
