import java.io.File;

public class Main {
	enum Mode = {
		DFS, BFS
	}
	private int destination;
	private Mode searchType;
	private bool extended;
	private File file;
	private Graph graph;

	public static void main(String[] args) {
		extended = false;
		for (int i =0; i< args.length;i++) {
			if (args[i] == "-dest") {
				destination = args[i+1];
				i++;
			}
			if (args[i] == "-dfs") {
				searchType = Mode.DFS;
			}
			if (args[i] == "-bfs") {
				searchType = Mode.BFS;
			}
			if (args[i] == "-e") {
				extended = true;	
			}
			else {
				try {
					file = new File(args[i]);
				} catch (IOException e) {
					System.out.println("File not found");
					e.printStackTrace();
				}
			}
		}
		graph = new Graph(file);
		search();
	}
	
	private void search() {
		if (searchType == Mode.BFS) {
			new BFS(destination, graph, extended);
		} else {
			new DFS(destination, graph, extended);
		}
	}
}
