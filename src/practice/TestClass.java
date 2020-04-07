package practice;

public class TestClass {
    public static void main(String args[] ) throws Exception {
        int T = 1;
        
        while (T-- > 0) {
            int shops = 6;
            int people = 5;
            
            int[] visited = new int[shops];
            int[] X = {3, 2, 4, 1, 5};
            int[] Y = {5, 3, 6, 6, 6};
            
            for (int i=0; i<people; i++) {
                int x = X[i];
                int y = Y[i];
                
                for (int j=x-1; j<=y-1; j++) {
                    visited[j] += 1;
                }
            }
            
            for (int x : visited)
            	System.out.print(x + " ");
            
            int max1, max2, max3;
            int i1, i2, i3;
            max1 = max2 = max3 = Integer.MIN_VALUE;
            i1 = i2 = i3 = -1;
            
            for (int i=0; i<shops; i++) {
                if (visited[i] > max1) {
                    max3 = max2;
                    i3 = i2;
                    max2 = max1;
                    i2 = i1;
                    max1 = visited[i];
                    i1 = i;
                }
                else if (visited[i] > max2) {
                    max3 = max2;
                    i3 = i2;
                    max2 = visited[i];
                    i2 = i;
                }
                else if (visited[i] > max3) {
                    max3 = visited[i];
                    i3 = i;
                }
            }
            System.out.println();
            System.out.println((i3+1) + " " + (i2+1) + " " + (i1+1));
        }
    }

}
