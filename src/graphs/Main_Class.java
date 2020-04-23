package graphs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

import practice.Pair;

public class Main_Class {
	
	public static void main (String[] args) {
		
		/** Find cycle in undirected graph using union and find */
		
		int i = -17;
		System.out.println(i%16);
		
//		GraphEdges ge = new GraphEdges(3, 3);
//		ge.edges[0].src = 0;
//		ge.edges[0].dest = 1;
//		ge.edges[1].src = 1;
//		ge.edges[1].dest = 2;
//		ge.edges[2].src = 2;
//		ge.edges[2].dest = 0;
//		System.out.println(ge.isCyclic());
		
		/** Nodes to be deleted to disconnect 2 nodes */
//		Graph g = new Graph(6);
//		g.addDirectedEdge(0, 1);
//		g.addDirectedEdge(1, 2);
//		g.addDirectedEdge(0, 3);
//		g.addDirectedEdge(3, 4);
//		g.addDirectedEdge(1, 3);
//		g.addDirectedEdge(4, 2);
//		g.addDirectedEdge(5, 2);
//		g.disconnectingNodes(0, 2);

		/** Cycle in directed graph */
//		Graph g = new Graph(4);
//		g.addDirectedEdge(0, 1);
//		g.addDirectedEdge(0, 2);
//		g.addDirectedEdge(1, 2);
//		g.addDirectedEdge(2, 0);
//		g.addDirectedEdge(2, 3);
//		g.addDirectedEdge(3, 3);
//		System.out.println(g.isCyclicDirected());
		
		/** Prim's min spanning tree */
//		int graph[][] = new int[][] { { 0, 2, 0, 6, 0 }, 
//            							{ 2, 0, 3, 8, 5 }, 
//            							{ 0, 3, 0, 0, 7 }, 
//            							{ 6, 8, 0, 0, 9 }, 
//            							{ 0, 5, 7, 9, 0 } };
//        
//        new Prim_MST().prim_MST(graph, 5);
		
		/** Longest distance between any 2 vertices of a graph */
//		int V = 6;
//		LinkedList<Pair> [] adj = new LinkedList[V+1];
//		for (int i=0; i<=V; i++)
//			adj[i] = new LinkedList<Pair>();
//		
//		adj[1].add(new Pair(2, 3));
//		adj[2].add(new Pair(1, 3));
//		adj[2].add(new Pair(3, 4));
//		adj[3].add(new Pair(2, 4));
//		adj[6].add(new Pair(2, 2));
//		adj[2].add(new Pair(6, 2));
//		adj[4].add(new Pair(6, 6));
//		adj[6].add(new Pair(4, 6));
//		adj[5].add(new Pair(6, 5));
//		adj[6].add(new Pair(5, 5));
//		
//		System.out.println(new Longest_Distance_Between_Any_2_vertices().longestDistance(adj, V));
		
//		int mat[][] = {	{ 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
//                		{ 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 }, 
//                		{ 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 }, 
//		                { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 }, 
//		                { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 }, 
//		                { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 }, 
//		                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, 
//		                { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 }, 
//		                { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }	};
//		
//		Pair src = new Pair(0, 0);
//		Pair dest = new Pair(3, 4);
//		int dist = new Shortest_Path_Binary_Maze().findShortestDistance(mat, src, dest);
//		System.out.println(dist);
		
		/** Strongly connected components */
//		Graph g = new Graph(5); 
//        g.addDirectedEdge(1, 0); 
//        g.addDirectedEdge(0, 2); 
//        g.addDirectedEdge(2, 1); 
//        g.addDirectedEdge(0, 3); 
//        g.addDirectedEdge(3, 4);
//        new StronglyConnectedComponents().stronglyConnectedComponents(g);
		
		/** Min swaps required sort an array */
//		int[] arr = {1, 5, 4, 3, 2};
//		System.out.println(new MinSwaps().countMinSwaps(arr));
		
		/** Dijkstra Algorithm */
//		int[][] graph = new int[][] {	{ 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
//	                					{ 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
//						                { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
//						                { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
//						                { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
//						                { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
//						                { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
//						                { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
//						                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } 	};
//		
//		Dijkstra dijkstra = new Dijkstra();
//		dijkstra.shortestDistance(graph, 0);
					                
//		Graph g = new Graph(6);
//		g.addDirectedEdge(5, 2);
//		g.addDirectedEdge(5, 0);
//		g.addDirectedEdge(4, 0);
//		g.addDirectedEdge(4, 1);
//		g.addDirectedEdge(2, 3);
//		g.addDirectedEdge(3, 1);
		
		/** Kahn's Topological Sort */
//		g.kahnTopologicalSort();
		
		/** Topological Sort */
//		g.topologicalSort();
		
		/** DFS */
//		g.DFS();
		
		/** BFS */
//		g.BFS(2);
	}

}
