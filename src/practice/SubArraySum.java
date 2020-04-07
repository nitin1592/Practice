package practice;

public class SubArraySum {
	
	public void subArraySum(int arr[], int sum) {
		int n = arr.length;
		int start=0, i=0;
		int localSum = 0;
		
		while (i<n) {
			while (i<n && localSum<sum) {
				localSum += arr[i];
				i++;
			}
			if (sum==localSum) {
				System.out.println(start + " " + (i-1));
				return;
			}
			localSum -= arr[start];
			start++;
		}
	}

}
