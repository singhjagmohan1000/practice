package com.graph.practice;

public class GraphAdjanceyMAtrix {

	public static void main(String[] args) {
	
		
		int nodes=5, edges=7;
	

		  int graph[][]= new int[nodes+1][nodes+1];
		  for( int i =0 ; i < nodes ; i++) 
		    for( int j = 0 ; j < nodes ; j++)
		      graph[i][j] = 0; // initilise all nodes as disconnected from all nodes.

		  graph[0][1]=1;
		  graph[0][4]=1;
		  graph[1][4]=1;
		  graph[1][2]=1;
		  graph[1][3]=1;
		  graph[4][3]=1;
		  graph[3][2]=1;
		  
//		  for( int i = 0 ; i < edges ; i++)
//		  {
//		    int u , v ;
//		    cin >> u >> v;
//		    graph[u][v] = 1;  // graph[u][v] = c if c is weight of edge
//		    graph[v][u] = 1;  // if graph is Directed this line will be omitted.
//		  }

		  for( int i = 0 ; i < nodes ; i++ )
		  {
		    System.out.print(" Node " + i + " is connected to : ") ;
		    for( int j = 0 ; j < nodes ; j++)
		    {
		      if( graph[i][j] == 1 )
		        System.out.print(j + " ");
		    
		    }
		    System.out.println("");
		  }
		  
	}
}
