package practice;

import java.util.List;

public class TusharBdayParty {
	
	public int solve(final List<Integer> A, final List<Integer> B, final List<Integer> C) {
		
		int max = 0;
		for (Integer value : A) {
			max = Math.max(max, value);
		}
		int r = max;
		int c = B.size();
		int[][] dp = new int[r][c];
		
		dp[0][0] = (B.get(0) >= 1) ? C.get(0) : 0;
		
		for (int i=1; i<r; i++) {
			dp[i][0] = (B.get(0) >= i+1) ? C.get(0) : 0;
		}
		
//		for (int j=1; j<c; j++) {
//			dp[0][j] = (B.get(j) >=1) ? Math.min(dp[0][j-1], C.get(j)) : dp[0][j-1];
//		}
		
		for (int i=1; i<r; i++) {
			for (int j=1; j<c; j++) {
				
			}
		}
		
		return 0;
    }

}
