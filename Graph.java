public class Graph {
	Vertex[] list;
	int listLength;
	public Graph(){
		list = null;
	}
	public Graph(File f){
		Scanner reader = new Scanner(f);
		listLength = Integer.parseInt(reader.nextLine());
		int counter = 0;
		while (reader.hasNextLine()) {
			addToVertexList(reader.nextLine(), counter);
			counter++;
		}
		reader.close();
	}
	private void addToVertexList(String line, int i) {
		list[i] = new Vertex(line.split(" "));
	}
}
