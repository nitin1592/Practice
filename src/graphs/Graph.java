package graphs;

import java.beans.Visibility;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	int v;
	LinkedList<Integer> adj[];
	
	Graph (int v) {
		this.v = v;
		adj = new LinkedList[v];
		
		for (int i=0; i<v; i++)
			adj[i] = new LinkedList<Integer>();
	}
	
	public void addUndirectedEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
	}
	
	public void addDirectedEdge (int u, int v) {
		adj[u].add(v);
	}
	
	public void disconnectingNodes(int src, int dest) {
		boolean[] visited = new boolean[v];
		
		disconnectingNodesImpl(src, dest, visited);
	}
	
	public void disconnectingNodesImpl(int src, int dest, boolean[] visited) {
		visited[src] = true;
		
		for (Integer u : adj[src]) {
			if (u == dest) {
				System.out.print(src + " ");
//				visited[src] = false;
				return;
			}
			if (!visited[u]) {
				disconnectingNodesImpl(u, dest, visited);
			}
		}
	}
	
	public boolean isCyclicDirected() {
		boolean[] visited = new boolean[v];
		
		for (int i=0; i<v; i++) {
			if (isCyclicDirectedImpl(i, visited))
				return true;
		}
		return false;
	}
	
	public boolean isCyclicDirectedImpl(int u, boolean[] visited) {
		visited[u] = true;
		
		for (Integer v : adj[u]) {
			if (visited[v])
				return true;
			
			if (isCyclicDirectedImpl(v, visited))
				return true;
		}
		visited[u] = false;
		return false;
	}
	
	public void kahnTopologicalSort() {
		int[] inDegree = new int[v];
		for (LinkedList<Integer> ll : adj) {
			for (int x : ll) {
				inDegree[x]++;
			}
		}
		
		int count = 0;
		Queue<Integer> q = new LinkedList<Integer>();
		
		for (int i=0; i<v; i++) {
			if (inDegree[i]==0)
				q.add(i);
		}
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while (!q.isEmpty()) {
			int u = q.poll();
			result.add(u);
			
			for (int x : adj[u]) {
				inDegree[x]--;
				if (inDegree[x]==0)
					q.add(x);
			}
			count++;
		}
		
		if (count != v) {
			System.out.println("Cycle in graph");
			return;
		}
		for (int x : result) {
			System.out.print(x + " ");
		}
	}
	
	public void topologicalSort() {
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] visited = new boolean[v];
		
		for (int i=0; i<v; i++) {
			if (!visited[i]) {
				topologicalSortImpl(i, stack, visited);
			}
		}
		
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
	
	public void topologicalSortImpl(int i, Stack<Integer> stack, boolean[] visited) {
		visited[i] = true;
		
		for (int u : adj[i]) {
			if (!visited[u]) {
				topologicalSortImpl(u, stack, visited);
			}
		}
		
		stack.push(i);
	}
	
	public void BFS (int source) {
		boolean visited[] = new boolean[v];
		Queue<Integer> q = new LinkedList<Integer>();
		
		visited[source] = true;
		q.add(source);
		
		while (!q.isEmpty()) {
			source = q.poll();
			System.out.print(source + " ");
			
			for (Integer i : adj[source]) {
				if (!visited[i]) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
	
	public void DFS () {
		boolean[] visited = new boolean[v];
		for (int i=0; i<v; i++) {
			if (!visited[i])
				DFS_Impl(i, visited);
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
}
