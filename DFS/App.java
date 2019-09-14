package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex v1 = new Vertex("1");
		Vertex v2 = new Vertex("2");
		Vertex v3 = new Vertex("3");
		Vertex v4 = new Vertex("4");
		Vertex v5 = new Vertex("5");
		Vertex v6 = new Vertex("6");
		Vertex v7 = new Vertex("7");
		Vertex v8 = new Vertex("8");
		
		List<Vertex> list = new ArrayList<>();
		
		v1.addNeighbour(v2);
		v1.addNeighbour(v3);
		v1.addNeighbour(v4);
		v2.addNeighbour(v5);
		v2.addNeighbour(v6);
		v6.addNeighbour(v7);
		v4.addNeighbour(v8);
		
		
		
		list.add(v1);
		list.add(v2);
		list.add(v3);
		list.add(v4);
		list.add(v5);
		list.add(v6);
		list.add(v7);
		list.add(v8);
		
		DFS dfs = new DFS();
		dfs.dfs(list);
	}
}
