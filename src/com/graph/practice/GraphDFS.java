package com.graph.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;


public class GraphDFS {


	int v;
	LinkedList<Integer> adjacent[];
	GraphDFS(int v){
		this.v=v;
		adjacent=new LinkedList[v];
		for(int i=0;i<v;i++)
			adjacent[i]=new LinkedList<Integer>();
	}


	void addEdge(int source,int destination){

		adjacent[source].addFirst(destination);

	}
	
	boolean hasDFS(int source,int destination){
		HashSet<Integer> visited= new HashSet<Integer>();
		return hasPath(source,destination,visited);
	}
	boolean hasPath(int source,int destination, HashSet<Integer> visited){
		
		if(visited.contains(source))
			return false;
		visited.add(source);
		if(source == destination)
			return true;
		Iterator<Integer> i = adjacent[source].listIterator();
		while(i.hasNext()){
			if(hasPath(i.next(), destination,visited))
				return true;
		}

		return false;

	}
	public static void main(String[] args) {
		int v = 5;
		GraphDFS graph = new GraphDFS(v);
		
		graph.addEdge(0,1);
		graph.addEdge( 0, 4);
		graph.addEdge( 1, 2);
		graph.addEdge( 1, 3);
		graph.addEdge( 1, 4);
		graph.addEdge( 2, 3);
		graph.addEdge( 3, 4);
		System.out.println(graph.hasDFS(0, 3));
	}
}
