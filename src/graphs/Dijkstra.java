package graphs;

public class Dijkstra {
	static final int v = 9;

	public void shortestDistance(int[][] graph, int source) {
		int[] dist = new int[v];
		boolean[] visited = new boolean[v];

		for (int i = 0; i < v; i++) {
			dist[i] = Integer.MAX_VALUE;
			visited[i] = false;
		}

		dist[source] = 0;

		for (int c = 0; c < v - 1; c++) {
			int u = minDistance(dist, visited);
			visited[u] = true;

			for (int i = 0; i < v; i++) {
				if (!visited[i] && graph[u][i] != 0 && dist[u] != Integer.MAX_VALUE
						&& dist[u] + graph[u][i] < dist[i]) {
					dist[i] = dist[u] + graph[u][i];
				}
			}
		}

		for (int i = 0; i < v; i++) {
			System.out.println(i + " " + dist[i]);
		}
	}

	public int minDistance(int[] dist, boolean[] visited) {
		int min = Integer.MAX_VALUE;
		int minIndex = -1;

		for (int i = 0; i < v; i++) {
			if (!visited[i] && dist[i] < min) {
				min = dist[i];
				minIndex = i;
			}
		}
		return minIndex;
	}

}
