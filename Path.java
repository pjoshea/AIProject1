public class Path {
	ArrayList<Vertex> path;
	public Path() {
		path = new ArrayList<Vertex>();
	}
	public addVertex(Vertex v) {
		path.add(v);
	}
	public removeLastVertex() {
		path.remove(path.size()-1);
	}
}
