package practice;

public class PrintAllPathsMatrix {
	
	public void printAllPaths(int[][] mat, int m, int n, int i, int j, int[] arr, int index) {
		arr[index] = mat[i][j];
		
		if (i == m-1) {
			for (int k=j+1; k<n; k++) {
				arr[index+k-j] = mat[i][k];
			}
			for (int k=0; k<index+n-j; k++)
				System.out.print(arr[k] + " ");
			System.out.println();
			return;
		}
		
		if (j == n-1) {
			for (int k=i+1; k<m; k++) {
				arr[index+k-i] = mat[k][j];
			}
			for (int k=0; k<index+m-i; k++)
				System.out.print(arr[k] + " ");
			System.out.println();
			return;
		}
		
		printAllPaths(mat, m, n, i+1, j, arr, index+1);
		printAllPaths(mat, m, n, i, j+1, arr, index+1);
	}

}
