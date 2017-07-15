/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DetectCycle;

import java.util.Iterator; 
import java.util.LinkedList;

/**
 *
 * @author Srinidhi Srinivasa Raghavan 
 */

public class Graph {
    int V;                          //V - Number of Vertices                                  
    int E;                          //E - Number of Edges
    LinkedList<Integer> adj[];      //Graph is represented using Adjacency List

    //Constructor of Graph which takes number of vertices as a parameter
    Graph(int V){
        this.V = V;
        E = 0;
        
        adj = new LinkedList[V];    
		
        for(int i = 0; i < V; i++)
            adj[i] = new LinkedList();
    }

    
    //Adding the Edge to the Adjacency List
    void addEdge(int start, int end){
	E = E + 1;
	adj[start].add(end);
	adj[end].add(start);
    }


    Boolean DFS(int current, int req_cyc_length, int cur_path_length, Boolean visited[], int parent)
    {
        // The current node is marked as visited
        visited[current] = true;

        // Recur for all the vertices adjacent to this vertex
        Iterator<Integer> neighbor = adj[current].iterator();
        while (neighbor.hasNext())
        {
            int next_neighbor = neighbor.next();
 
            //Explored unexplored adjacent nodes
            if (!visited[next_neighbor]){   
                if (DFS(next_neighbor, req_cyc_length, cur_path_length+1 , visited, current))
                    return true;
            }
 
            // Detects a cycle of a given length
            else if (next_neighbor != parent && cur_path_length==req_cyc_length){
                return true;
            }
        }
        return false;
    }
 
    // Returns true if the graph contains a cycle, else false.
    Boolean detectCycle(int n)
    {
        if(n<3)
            return false;
            
        // Mark all the vertices as not visited and not part of
        // recursion stack
        Boolean visited[] = new Boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;
 
        // Call the recursive helper function to detect cycle in
        // different DFS trees

        for (int i = 0; i < V; i++)
            if (!visited[i]) // Don't recur for u if already visited
                if (DFS(i, n, 1, visited, -1))
                    return true;
 
        return false;
    }
}
