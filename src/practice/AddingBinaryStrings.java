package practice;


public class AddingBinaryStrings {
	
	public String addBinary(String A, String B) {
		String result = "";
		
		int aIndex = A.length()-1;
		int bIndex = B.length()-1;
		int sum = 0;
		while(aIndex>=0 && bIndex>=0) {
			sum += A.charAt(aIndex)-'0' + B.charAt(bIndex)-'0';
			result = (char)(sum%2+'0') + result;
			sum = sum/2;
			aIndex--;
			bIndex--;
		}
		while(aIndex>=0) {
			sum += A.charAt(aIndex)-'0';
			result = (char)(sum%2+'0') + result;
			sum = sum/2;
			aIndex--;
		}
		while(bIndex>=0) {
			sum += B.charAt(bIndex)-'0';
			result = (char)(sum%2+'0') + result;
			sum = sum/2;
			bIndex--;
		}
		if(sum==1)
			result = "1"+result;
		return result;
    }
}
