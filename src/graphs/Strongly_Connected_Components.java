package graphs;

import java.util.LinkedList;
import java.util.Stack;

public class Strongly_Connected_Components {
	
	private int v;
	private LinkedList<Integer> [] adj;
	private Graph g, gT;
	
	public void stronglyConnectedComponents(Graph g) {
		this.g = g;
		this.v = g.v;
		this.adj = g.adj;
		
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visited = new boolean[v];
		
		for (int i=0; i<v; i++) {
			if (!visited[i])
				storeDFS(i, stack, visited);
		}
		
		gT = findTranspose(g);
		
		for (int i=0; i<v; i++)
			visited[i] = false;
		
		while (!stack.isEmpty()) {
			int node = stack.pop();
			
			if (!visited[node]) {
				gT.DFS_Impl(node, visited);
				System.out.println();
			}
		}
	}
	
	public void DFS_Impl(int v, boolean[] visited) {
		visited[v] = true;
		System.out.print(v + " ");
		
		for (Integer u : adj[v]) {
			if (!visited[u]) {
				DFS_Impl(u, visited);
			}
		}
	}
	
	public Graph findTranspose(Graph g) {
		Graph gNew = new Graph(v);
		
		for (int i=0; i<v; i++) {
			for (Integer x : adj[i]) {
				gNew.adj[x].add(i);
			}
		}
		
		return gNew;
	}
	
	public void storeDFS(int u, Stack<Integer> stack, boolean[] visited) {
		visited[u] = true;
		
		for (Integer i : adj[u]) {
			if (!visited[i])
				storeDFS(i, stack, visited);
		}
		
		stack.push(u);
	}

}
