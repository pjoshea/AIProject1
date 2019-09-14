import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	Queue<Vertex> q;
	Graph graph;
	bool extended;
	Path path;
	bool[] visited;

	public BFS(int dest, Graph g, bool ext){
		q = new LinkedList<>();
		graph = g;
		visited = new bool[graph.numNodes()];
		Vertex start = graph.getStart();
		q.add(start);
		while (!q.isEmpty()) {
			Vertex v = q.remove();
			if (v.nextTo(dest)) {
				endSearch(v);
			} else {
				for (int i = 0; i<v.getNumNeighbours(); i++) {
					Vertex nbour = v.getNeighbour(i);
					if (!visited[nbour.getNode()]) {
						q.add(nbour);
						visited[nbour.getNode()] = true;
					}
				}
			}
		}
	}
}
