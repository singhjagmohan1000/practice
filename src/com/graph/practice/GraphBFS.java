package com.graph.practice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import com.graph.practice.GFG.Graph;

public class GraphBFS {


	int v;
	LinkedList<Integer> adjacent[];
	GraphBFS(int v){
		this.v=v;
		adjacent=new LinkedList[v];
		for(int i=0;i<v;i++)
			adjacent[i]=new LinkedList<Integer>();
	}


	void addEdge(int source,int destination){

		adjacent[source].addFirst(destination);

	}
	boolean hasPath(int source,int destination){

		HashSet<Integer> visited= new HashSet<Integer>();

		Queue<Integer> nodeToVisited = new LinkedList<Integer>(); 
		nodeToVisited.add(source);
		while(!nodeToVisited.isEmpty()){
			source=nodeToVisited.poll();
			if(source == destination)
				return true;

			if(visited.contains(source)){
				continue;
			}
			visited.add(source);
			Iterator<Integer> i = adjacent[source].listIterator();
			while(i.hasNext()){
				nodeToVisited.add(i.next());
			}
		}

		return false;

	}
	public static void main(String[] args) {
		int v = 5;
		GraphBFS graph = new GraphBFS(v);
		
		graph.addEdge(0,1);
		graph.addEdge( 0, 4);
		graph.addEdge( 1, 2);
		graph.addEdge( 1, 3);
		graph.addEdge( 1, 4);
		graph.addEdge( 2, 3);
		graph.addEdge( 3, 4);
		System.out.println(graph.hasPath(3, 2));
	}
}
