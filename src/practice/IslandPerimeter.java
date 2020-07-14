package practice;

class IslandPerimeter {
    int m, n;
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        if (m == 0)
            return 0;
        int n = grid[0].length;
        
        int count = 0;
        int[] X = {1, 0, -1, 0};
        int[] Y = {0, -1, 0, 1};
//        System.out.println("m=" + m + "n=" + n);
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (grid[i][j] == 1) {
                    count += 4;
                    for (int index=0; index<4; index++) {
//                    	System.out.println(index);
                        int x = i + X[index];
                        int y = j + Y[index];
                        
                        System.out.println("x=" + x + "y=" + y);
                        
                        if (x>=0 && x<m && y>=0 && y<n) {
                        	System.out.println("m=" + m + "n=" + n);
                        	System.out.println("x=" + x + "y=" + y);
                        	count -= grid[x][y];
                        }
                    }
                }
            }
        }
        return count;
    }
    
    public boolean isSafe(int x, int y) {
        if (x>=0 && x<m && y>=0 && y<n)
            return true;
        return false;
    }
}
