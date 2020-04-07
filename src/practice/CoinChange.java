package practice;

public class CoinChange {
	
	public int no_Of_Ways(int[] arr, int m, int n) {
		
		int[][] dp = new int[n+1][m+1];
		
		for (int i=0; i<=m; i++)
			dp[0][i] = 1;
		
		for (int i=1; i<=n; i++)
			dp[i][0] = 0;
		
		for (int sum=1; sum<=n; sum++) {
			for (int j=1; j<=m; j++) {
				if (sum < arr[j-1])
					dp[sum][j] = dp[sum][j-1];
				else
					dp[sum][j] = dp[sum-arr[j-1]][j] + dp[sum][j-1];
			}
		}
		
		for (int i =0; i<dp.length; i++) {
			for (int j=0; j<dp[i].length; j++)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
		System.out.println();
		return dp[n][m];
	}
}
