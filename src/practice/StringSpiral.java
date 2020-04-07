package practice;

public class StringSpiral {

	public static void main(String[] args) {
		int rows=1, r=1, cols=8, c=8;
		int n =6;
		String s = "abcdef";
		char[][] result = new char[rows][cols];
		int index = 0;
		
		int rowCount=0, colCount=0;
		
		while (rowCount<rows && colCount<cols) {
			for (int i=colCount; i<cols; i++) {
				result[rowCount][i] = s.charAt(index%n);
				index++;
			}
			rowCount++;
			
			for (int i=rowCount; i<rows; i++) {
				result[i][cols-1] = s.charAt(index%n);
				index++;
			}
			cols--;
			
			for (int i=cols-1; i>=colCount; i--) {
				result[rows-1][i] = s.charAt(index%n);
				index++;
			}
			rows--;
			
			for (int i=rows-1; i>=rowCount; i--) {
				result[i][colCount] = s.charAt(index%n);
				index++;
			}
			colCount++;
		}
		
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++)
				System.out.print(result[i][j]);
			System.out.println();
		}
	}

}
