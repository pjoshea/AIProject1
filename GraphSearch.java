import java.io.File;
import java.util.ArrayList;
import java.io.IOException;

public class GraphSearch {
	boolean bfs;
	private int destination;
	private boolean extended;
	private File file;
	private Graph graph;

	public GraphSearch(String[] args) {
		construct(args);
		search();
	}

	private void construct(String[] args) {
		extended = false;
		for (int i=0; i<args.length; i++) {
			if (args[i].toLowerCase().contains( "-dest")) {
				destination = Integer.parseInt(args[i+1]);
			} else if (args[i].toLowerCase().contains( "-dfs")) {
				bfs = false;
			} else if (args[i].toLowerCase().contains( "-bfs")) {
				bfs = true;
			} else if (args[i].toLowerCase().contains("-e")) {
				extended = true;
			} else {
				file = new File(args[i]);
			}
		} 
		graph = new Graph(file);
	}
	
	private void search() {
		if (bfs) {
			new BFS(destination, graph, extended);
		} else {
			new DFS(destination, graph, extended);
		}
	}
}
