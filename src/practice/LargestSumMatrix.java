package practice;

import java.util.ArrayList;

public class LargestSumMatrix {
	
	public int solve(ArrayList<ArrayList<Integer>> A) {
        if(A.size()==0)
            return 0;
        
        int m = A.size();
        int n = A.get(0).size();
        int i, j;
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = A.get(m-1).get(n-1);
        int result = dp[m-1][n-1];
        
        for (i=m-2; i>=0; i--) {
            dp[i][n-1] = A.get(i).get(n-1) + dp[i+1][n-1];
            result = Math.max(result, dp[i][n-1]);
        }
        
        for (j=n-2; j>=0; j--) {
            dp[m-1][j] = A.get(m-1).get(j) + dp[m-1][j+1];
            result = Math.max(result, dp[m-1][j]);
        }
        
        for (i=m-2; i>=0; i--) {
            for (j=n-2; j>=0; j--) {
                dp[i][j] = A.get(i).get(j) + dp[i+1][j] + dp[i][j+1] - dp[i+1][j+1];
                result = Math.max( result, dp[i][j] );
            }
        }
        
        for (i=0; i<m; i++) {
        	for (j=0; j<n; j++)
        		System.out.print(dp[i][j] + " ");
        	System.out.println();
        }
        return result;
    }

}
