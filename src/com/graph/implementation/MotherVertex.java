package com.graph.implementation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class MotherVertex {

	int vertex;
	LinkedList<Integer> adjacentList[];
	public MotherVertex(int v){
		this.vertex=v;
		adjacentList=new LinkedList[v];
		for(int i=0;i<v;i++)
			adjacentList[i]=new LinkedList<Integer>();
	}
	void addEdge(int source,int destination){
		adjacentList[source].add(destination);
	}
	void pathDFS(int v,HashSet<Integer> visited){
		visited.add(v);
		Iterator<Integer> iterator = adjacentList[v].listIterator();
		while(iterator.hasNext()){
			if(!visited.contains(iterator))
				pathDFS(iterator.next(), visited);
		}
	}
	int findMother(){
		
		HashSet<Integer> visited= new HashSet<Integer>();
		int lastVisited=-1;
		for(int i =0;i<vertex;i++)
			if(!visited.contains(i))
			{
				pathDFS(i, visited);
				lastVisited=i;
			}
		return lastVisited;
	}
	public static void main(String[] args) {
		MotherVertex g= new MotherVertex(7);
	    g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 3);
	    g.addEdge(4, 1);
	    g.addEdge(6, 4);
	    g.addEdge(5, 6);
	    g.addEdge(5, 2);
	    g.addEdge(6, 0);
	    System.out.println("Mother Vertex is: "+g.findMother());
	}
}
