package practice;

public class NumberConversion {
	public String integerToRoman(int n) {
		String result = "";
		int arr[] = new int[] {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String roman[] = new String[] {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
		
		int i = 12;
		while(n>0) {
			int x = n/arr[i];
			n = n%arr[i];
			while(x>0) {
				result += roman[i];
				x--;
			}
			i--;
		}
		return result;
	}

}
