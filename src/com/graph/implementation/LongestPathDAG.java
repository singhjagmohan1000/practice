package com.graph.implementation;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;



class Node{
	int v;
	int weight;
	public Node(int v,int weight){
		this.v=v;
		this.weight=weight;
	}
	public int getV(){
		return v;
	}
	public int getWeight(){
		return weight;
	}
	public String toString(){
		return "("+v+","+weight+")";
	}
}
public class LongestPathDAG {


	int v;
	LinkedList<Node> adjacenyList[];

	public LongestPathDAG(int v){
		this.v=v;
		adjacenyList=new LinkedList[v];
		for(int i=0;i<v;i++)
			adjacenyList[i]=new LinkedList();
	}

	public void addEdge(int u,int v, int  weight){
		Node node = new Node(v,weight);
		adjacenyList[u].addFirst(node);
	}

	public void topologicalSort(int source,boolean[] visited,Stack<Integer> stack){
		visited[source]=true;
		Iterator<Node> iterator=adjacenyList[source].listIterator();
		while(iterator.hasNext()){
			Node node= iterator.next();
			if(!visited[(node.getV())])
				topologicalSort(node.getV(), visited, stack);
		}
		stack.push(source);
	}
	public int longestPath(int source){
		Stack<Integer> stack = new Stack<Integer>();
		boolean visited[] = new boolean[v];
		int dist[]=new int[v];
		for(int i=0;i<v;i++)
			visited[i]=false;
		for(int i=0;i<v;i++)
			if(!visited[i])
				topologicalSort(source, visited, stack);
		for(int i=1;i<v;i++)
			dist[i]=Integer.MIN_VALUE;
		dist[source]=0;
		while(!stack.isEmpty()){
			int s=stack.pop();
			Iterator<Node> iterator=adjacenyList[s].listIterator();
			if(dist[s]!=Integer.MIN_VALUE){
				while(iterator.hasNext()){
					Node node= iterator.next();
					dist[node.getV()]=Math.max(dist[node.getV()],dist[s]+node.getWeight());
				}
			}
		}
		int	max=dist[0];
		for(int i=0;i<dist.length;i++)
			if(max<dist[i])
				max=dist[i];
		return max;
	};

	public void printGraph()
	{       
		for(int i = 0; i<v; i++)
		{
			System.out.println("Adjacency list of vertex "+ i);
			System.out.print("head");
			for(Node node: adjacenyList[i]){
				System.out.print(" -> "+node);
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v=6;
		LongestPathDAG g = new LongestPathDAG(v);
		g.addEdge(0, 1, 5);
		g.addEdge(0, 2, 3);
		g.addEdge(1, 3, 6);
		g.addEdge(1, 2, 2);
		g.addEdge(2, 4, 4);
		g.addEdge(2, 5, 2);
		g.addEdge(2, 3, 7);
		g.addEdge(3, 5, 1);
		g.addEdge(3, 4, -1);
		g.addEdge(4, 5, -2);

		//To print the adjaceny list
		//g.printGraph();
		System.out.println(g.longestPath(1));

	}

}
