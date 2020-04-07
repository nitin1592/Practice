package graphs;

import java.util.LinkedList;
import java.util.Queue;

import practice.Pair;

public class Shortest_Path_Binary_Maze {
	static int R, C;
	
	static class Node {
		Pair pair;
		int dist;
		Node (Pair pair, int dist) {
			this.pair = pair;
			this.dist = dist;
		}
	}
	
	public int findShortestDistance (int[][] mat, Pair src, Pair dest) {
		
		if (mat[src.first][src.second]!=1 || mat[dest.first][dest.second]!=1)
			return -1;
		
		R = mat.length;
		C = mat[0].length;
		
		boolean[][] visited = new boolean[R][C];
		visited[src.first][src.second] = true;
		
		Queue<Node> q = new LinkedList<Node>();
		Node node = new Node (src, 0);
		q.add(node);
		
		while (!q.isEmpty()) {
			Node qNode = q.poll();
			Pair p = qNode.pair;
			
			if (p.first==dest.first && p.second==dest.second)
				return qNode.dist;
			
			int[] x = {0, 1, 0, -1};
			int[] y = {1, 0, -1, 0};
			
			for (int i=0; i<4; i++) {
				int row = p.first + x[i];
				int col = p.second + y[i];
				
				if (isValid(row, col) && !visited[row][col] && mat[row][col]==1) {
					visited[row][col] = true;
					Node n = new Node (new Pair(row, col), qNode.dist+1);
					q.add(n);
				}
			}
		}
		return 0;
	}
	
	public static boolean isValid (int r, int c) {
		return (r>=0 && r<R && c>=0 && c<C);
	}

}
