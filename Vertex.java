import java.util.ArrayList;

public class Vertex{
	int node;
	ArrayList<int> neighbourList;

	public Vertex(String[] line){
		node = Integer.parseInt(line[0]); 
		for (int i =1; i<line.length; i++) {
			neighbourList.add(Integer.parseInt(line[i]));
		}
	}
}
