import java.util.ArrayList;

public class Path {
	ArrayList<Vertex> path;
	public Path() {
		path = new ArrayList<Vertex>();
	}
	public void addVertex(Vertex v) {
		path.add(v);
	}
	public void removeLastVertex() {
		path.remove(path.size()-1);
	}
	public void switchPathsBreadth(){
		
	}
	public void switchPathsDepth() {
		
	}
	public void print() {
		System.out.print("path: ");
		for (int i =0; i<path.size(); i++) {
			path.get(i).print();
			if (i!=(path.size()-1)) {
				System.out.print(" -- ");
			}
		}
		System.out.print("\n");
	}
}
