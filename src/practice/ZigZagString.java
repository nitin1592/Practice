package practice;

public class ZigZagString {
	public String convert(String A, int B) {
        if (A.length()==1 || B==1)
            return A;
        
        String result = "";
        int x = B-1;
        for(int i=0; i<B; i++) {
            int j = i;
            
            if (i==0 || i==B-1) {
                while (j<A.length()) {
                    result += String.valueOf(A.charAt(j));
                    j += 2*(B-1);
                }
                System.out.println(result);
            }
            else {
                while (j < A.length()) {
                    if (j<A.length()) {
                        result += String.valueOf(A.charAt(j));
                        j += 2*x;
                    }
                    if (j<A.length()) {
                        result += String.valueOf(A.charAt(j));
                        j += 2*i;
                    }
                }
                System.out.println(result);
            }
            x--;
        }
        
        return result;
    }
}
