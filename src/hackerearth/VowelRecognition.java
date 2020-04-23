package hackerearth;

public class VowelRecognition {
	
	public int countVowels (String s) {
		int result = 0;
		
		for (int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
					ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				result += (i+1) * (s.length()-i);
			}
		}
		
		return result;
	}

}
