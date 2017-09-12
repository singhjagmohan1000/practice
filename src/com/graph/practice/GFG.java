package com.graph.practice;


import java.util.LinkedList;

public class GFG {
	
	static class Graph{
		int v;
		LinkedList<Integer> adjListArray[];
		Graph(int v){
			this.v=v;
			adjListArray = new LinkedList[v];
			
			for(int i = 0; i < v ; i++){
                adjListArray[i] = new LinkedList<>();
            }
		}
		public void addEdge(int i, int j) {
			// TODO Auto-generated method stub
			
		}
	}
	
	static void addEdge(Graph graph,int source,int destination){
		graph.adjListArray[source].addFirst(destination);
		//graph.adjListArray[destination].addFirst(source);
	}
	 static void printGraph(Graph graph)
	    {       
	        for(int v = 0; v < graph.v; v++)
	        {
	            System.out.println("Adjacency list of vertex "+ v);
	            System.out.print("head");
	            for(Integer pCrawl: graph.adjListArray[v]){
	                System.out.print(" -> "+pCrawl);
	            }
	            System.out.println("\n");
	        }
	    }
	      
	    // Driver program to test above functions
	    public static void main(String args[])
	    {
	        // create the graph given in above figure
	        int v = 5;
	        Graph graph = new Graph(v);
	        addEdge(graph, 0, 1);
	        addEdge(graph, 0, 4);
	        addEdge(graph, 1, 2);
	        addEdge(graph, 1, 3);
	        addEdge(graph, 1, 4);
	        addEdge(graph, 2, 3);
	        addEdge(graph, 3, 4);
	      
	        // print the adjacency list representation of 
	        // the above graph
	        printGraph(graph);
	    }
	}

