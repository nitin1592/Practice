package practice;

public class PrintRectangles {
	
	public void printReactangle (int rows, int cols) {
		int r = rows, c=cols;
		int rowCount=0, colCount=0;
		int[][] arr = new int[rows][cols];
		int x = 1;
		
		while (rowCount<rows && colCount<cols) {
			for (int j=colCount; j<cols; j++) {
				arr[rowCount][j] = x;
			}
			rowCount++;
			
			for (int i=rowCount; i<rows; i++) {
				arr[i][cols-1] = x;
			}
			cols--;
			
			if (rowCount < rows) {
				for (int j=cols-1; j>=colCount; j--) {
					arr[rows-1][j] =x;
				}
				rows--;
			}
			
			if (colCount < cols) {
				for (int i=rows-1; i>=rowCount; i--) {
					arr[i][colCount] = x;
				}
				colCount++;
			}
			
			x ^= 1;
		}
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
	}
}
