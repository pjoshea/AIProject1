import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;

public class BFS {
	Queue<Vertex> q;
	Graph graph;
	boolean extended;
	Path path;
	boolean[] enqueued;
	boolean destinationTouched;
	long execTime;
	int verticesVisited;
	int edgesVisited;

	public BFS(int dest, Graph g, boolean ext){
		q = new LinkedList<>();
		graph = g;
		destinationTouched = false;
		path = new Path();
		extended = ext;
		enqueued = new boolean[graph.numNodes() + 1];
		Vertex start = graph.getStart();
		q.add(start);	
		enqueued[1]=true;
		verticesVisited=1;
		edgesVisited=0;
		execTime = System.currentTimeMillis();
		while (!q.isEmpty() && !destinationTouched) {
			Vertex v = q.poll();
			if (v.getNodeName()==dest) {
				destinationTouched = true;
				endSearch(v);
			} else {
				verticesVisited++;
				path.addVertex(v);
				for (int i = 0; i<v.getNumNeighbours(); i++) {
					Vertex nbour = g.findNode(v.getNeighbour(i));
					if (nbour.getNodeName() == dest) {
						destinationTouched=true;
						endSearch(nbour);
					} else if (!enqueued[nbour.getNodeName()]) {
						q.add(nbour);
						enqueued[nbour.getNodeName()] = true;
						edgesVisited++;
					}
				}
			}
		}
	}


	private void endSearch(Vertex v) {
		path.addVertex(v);
		printPath();
		printEdgesAttempted();
		verticesVisited++;
		printVerticesVisited();
		printExecutionTime();
	}

	private void printPath() {
		path.print();
	}
	
	private void printEdgesAttempted() {
		System.out.println("edges: " + edgesVisited);
	}

	private void printVerticesVisited() {
		System.out.println("vertices: " + verticesVisited);
	}

	private void printExecutionTime() {
		System.out.println("execution time: " + (System.currentTimeMillis() - execTime));
	}
}
