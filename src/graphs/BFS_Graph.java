package graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Graph {
	
	private int v;
	private LinkedList<Integer>[] adjacency;
	
	public BFS_Graph(int v) {
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
		LinkedList<Integer> q = new LinkedList<Integer>();
		visited[src] = true;
		q.add(src);
		
		while(!q.isEmpty()) {
			src = q.remove();
			System.out.println(src + " ");
			
			Iterator<Integer> itr = adjacency[src].listIterator();
			while(itr.hasNext()) {
				int x = itr.next();
				if(!visited[x]) {
					visited[x] = true;
					q.add(x);
				}
			}
		}
	}
}
