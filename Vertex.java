import java.util.ArrayList;

public class Vertex{
	int node;
	ArrayList<Integer> neighbourList;

	public Vertex(String[] line){
		neighbourList = new ArrayList<Integer>();
		node = Integer.parseInt(line[0]); 
		for (int i =1; i<line.length; i++) {
			neighbourList.add(Integer.parseInt(line[i]));
		}
	}
	
	public void print() {
		System.out.print(node);
	}

	public int getNeighbour(int index){
		return neighbourList.get(index);
	}

	public int getNumNeighbours() {
		return neighbourList.size();
	}

	public int getNodeName() {
		return node;
	}

	public boolean nextTo(int vertex){
		for (int i=0;i< neighbourList.size();i++) {
			if (neighbourList.get(i) == vertex) {
				return true;
			}
		}
		return false;
	}
}
