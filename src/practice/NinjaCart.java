package practice;

public class NinjaCart {
	static class Triplet {
		int a, b, c;
	}
	
	public static int maximiseScore(Triplet[] arr, int n) {
        
        if (n==0)
            return 0;
        int flag = 1;
        int[][] dp = new int[n][3];
        dp[0][0] = arr[0].a;
        dp[0][1] = arr[0].b;
        dp[0][2] = arr[0].c;
        
        if (n==1)
            return max(dp[0][0], dp[0][1], dp[0][2]);
        
        dp[1][0] = arr[0].a + arr[1].a;
        dp[1][1] = arr[0].a + arr[1].b;
        dp[1][2] = arr[0].a + arr[1].c;
        
        if (n==2)
            return max(dp[1][0], dp[1][1], dp[1][2]);
        
        dp[2][0] = Math.max(dp[1][0], dp[0][1]) + arr[2].a;
        dp[2][1] = Math.max(dp[1][0], dp[0][1]) + arr[2].b;
        dp[2][2] = Math.max(dp[1][0], dp[0][1]) + arr[2].c;
        
        if (n==3)
            return max(dp[2][0], dp[2][1], dp[2][2]);
        
        for (int i=3; i<n; i++) {
            int value = max(dp[i-1][0], dp[i-2][1], dp[i-3][2]);
            dp[i][0] = value + arr[i].a;
            dp[i][1] = value + arr[i].b;
            dp[i][2] = value + arr[i].c;
        }
        return max (dp[n-1][0], dp[n-1][1], dp[n-1][2]);
    }
    
    public static int max (int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

}
