package com.graph.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;


public class GraphAdjanceyList {

	private HashMap<Integer,Node> nodeLookUp = new HashMap<Integer,Node>();

	public static class Node{
		private int id;
		LinkedList<Node> adjacent=new LinkedList<Node>();
		private Node(int id){
			this.id=id;
		}

	} 

	private Node getNode(int id){
		return new Node(id);
	};
	public void addEdge(int source,int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		s.adjacent.add(d);
	};
	public boolean hasPathDFS(int source,int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		return hasPathDFS(s,d,visited);

	}
	private boolean hasPathDFS(Node s, Node d, HashSet<Integer> visited) {
		if(visited.contains(s.id))
			return false;
		visited.add(s.id);
		if(s==d)
			return true;
		for(Node child: s.adjacent){
			if(hasPathDFS(child, d, visited))
				return true;
		}
		return false;
	}
	public boolean hasPathBFS(int source,int destination){
		Node s = getNode(source);
		Node d = getNode(destination);
		HashSet<Integer> visited = new HashSet<Integer>();
		LinkedList<Node> nextToVisit = new LinkedList<Node>();
		nextToVisit.add(s);
		while(!nextToVisit.isEmpty()){
			Node node = nextToVisit.remove();
			if( node == d)
				return true;
			if(visited.contains(node.id))
				continue;
			visited.add(node.id);
			for(Node child : node.adjacent)
				nextToVisit.add(child);
		}
return false;
	}
	public static void main(String[] args) {
		Node node = new Node(5);
		
		GraphAdjanceyList graph= new GraphAdjanceyList();
		graph.addEdge(0,1);
		graph.addEdge( 0, 4);
		graph.addEdge( 1, 2);
		graph.addEdge( 1, 3);
		graph.addEdge( 1, 4);
		graph.addEdge( 2, 3);
		graph.addEdge( 3, 4);
		
	}
}
