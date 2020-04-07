package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class DFS_Graph {
	
	private int v;
	private LinkedList<Integer>[] adjacency;
	
	public DFS_Graph(int v) {
		this.v = v;
		
		adjacency = new LinkedList[v];
		for(int i=0; i<v; i++)
			adjacency[i] = new LinkedList<Integer>();
	}
	
	public void addEdge(int source, int dest) {
		adjacency[source].add(dest);
	}
	
	public void traverse(int src) {
		boolean[] visited = new boolean[v];
		traverseImpl(src, visited);
	}
	public void traverseImpl(int src, boolean[] visited) {
		visited[src] = true;
		System.out.println(src + " ");
		
		Iterator<Integer> itr = adjacency[src].iterator();
		while(itr.hasNext()) {
			int x = itr.next();
			if(!visited[x]) {
				traverseImpl(x, visited);
			}
		}
	}
}
