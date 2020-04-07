package graphs;

public class GraphEdges {
	int V, E;
	Edge[] edges;
	
	public GraphEdges(int v, int e) {
		V = v;
		E = e;
		edges = new Edge[e];
		for (int i=0; i<e; i++)
			edges[i] = new Edge();
	}
	
	public boolean isCyclic() {
		int[] parent = new int[V];
		for (int i=0; i<V; i++)
			parent[i] = -1;
		
		for (int i=0; i<E; i++) {
			int x = find (parent, edges[i].src);
			int y = find (parent, edges[i].dest);
			
			if (x==y)
				return true;
			
			union(parent, x, y);
		}
		return false;
	}
	
	public void union (int[] parent, int x, int y) {
		int xRoot = find (parent, x);
		int yRoot = find (parent, y);
		parent[yRoot] = xRoot;
	}
	
	public int find (int[] parent, int i) {
		if (parent[i] == -1)
			return i;
		return find (parent, parent[i]);
	}
}