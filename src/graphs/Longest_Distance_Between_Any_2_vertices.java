package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import practice.Pair;

public class Longest_Distance_Between_Any_2_vertices {
	
	int V;
	LinkedList<Pair>[] adj;
	static int maxLen = Integer.MIN_VALUE;
	
	public int longestDistance (LinkedList<Pair>[] adj, int V) {
		this.V = V;
		this.adj = adj;
		
		boolean[] visited = new boolean[V+1];
		
		for (int i=1; i<=V; i++) {
			Arrays.fill(visited, false);
			DFS (adj, i, 0, visited);
		}
		return maxLen;
	}
	
	public static void DFS (LinkedList<Pair>[] adj, int source, int length, boolean[] visited) {
		visited[source] = true;
		int currLen = 0;
		
		for (Pair p : adj[source]) {
			if (!visited[p.first]) {
				currLen = length + p.second;
				DFS (adj, p.first, currLen, visited);
			}
			maxLen = Math.max(maxLen, currLen);
			currLen = 0;
		}
	}
}
