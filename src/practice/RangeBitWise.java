package practice;

public class RangeBitWise {
	
	public int rangeBitwiseAnd(int m, int n) {
        int result = 0;
        int x = 1;
        for (int i=0; i<32; i++) {
            int shift = 1<<i;
            x = 1;
//            System.out.println(shift);
            for (int j=m; j<=n && j>=0; j++) {
                if ((j&shift) == 0) {
                    x = 0;
                    break;
                }
            }
            if (x == 1) {
            	result |= shift;
//            	System.out.println("result : " + result);
            }
//            System.out.println(result);
        }
        return result;
    }

}
