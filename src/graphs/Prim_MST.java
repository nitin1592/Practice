package graphs;

public class Prim_MST {
	
	private static int V;
	private static int[][] g;
	
	public void prim_MST (int[][] graph, int vertices) {
		Prim_MST.V = vertices;
		Prim_MST.g = graph;
		
		int[] parent = new int[V];
		int[] key = new int[V];
		boolean[] included = new boolean[V];
		
		// Initially all vertices are not reachable
		for (int i=0; i<V; i++)
			key[i] = Integer.MAX_VALUE;
		
		key[0] = 0;
		parent[0] = -1;
		
		for (int i=0; i<V-1; i++) {
			int u = findMinKey (key, included);
			
			included[u] = true;
			
			for (int v=0; v<V; v++) {
				if ( g[u][v]!=0 && !included[v] && (key[u]+g[u][v]) < key[v] ) {
					key[v] = key[u] + g[u][v];
					parent[v] = u;
				}
			}
		}
		print_Graph(parent);
	}
	
	public static void print_Graph(int[] parent) {
		for (int i=1; i<V; i++) {
			System.out.println(parent[i] + "--" + i + " = " + g[i][parent[i]]);
		}
	}
	
	public static int findMinKey (int[] key, boolean[] included) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		
		for (int i=0; i<V; i++) {
			if (!included[i] && key[i]<min) {
				min = key[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
