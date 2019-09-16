import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Graph {
	ArrayList<Vertex> list;
	int listLength;
	public Graph(File f){
		list = new ArrayList<Vertex>();
		try {
			Scanner reader = new Scanner(f);
			listLength = Integer.parseInt(reader.nextLine());
			while (reader.hasNextLine()) {
				addToVertexList(reader.nextLine());
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("File not found.");
			e.printStackTrace();
		}
	}

	public int numNodes() {
		return listLength;
	}

	public Vertex findNode(int name) {
		for (Vertex v : list) {
			if (v.getNodeName()==name) {
				return v;
			}
		}
		return null;
	}
	public Vertex getStart() {
		for (Vertex v : list) {
			if (v.getNodeName()==1) {
				return v;
			}
		}
		return null;
	}
	private void addToVertexList(String line) {
		list.add(new Vertex(line.split(" ")));
	}
}
