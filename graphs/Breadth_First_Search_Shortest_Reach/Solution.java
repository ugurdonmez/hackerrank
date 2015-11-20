/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs.Breadth_First_Search_Shortest_Reach;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i ++ ) {
            
            Graph graph = new Graph();
            int node_number = scanner.nextInt();
            int edge_number = scanner.nextInt();
            
            graph.addNodes(node_number);
            
            for ( int j = 0 ; j < edge_number ; j++ ) {
                graph.addEdge(scanner.nextInt(), scanner.nextInt());
            }
            
            graph.bfs(scanner.nextInt(), graph.nodes);
            
            for ( int j = 1 ; j <= node_number ; j++ ) {
                
                if ( graph.nodes.get(j).prev == -1 ) {
                    System.out.print("-1 ");
                } else if ( graph.nodes.get(j).prev == 0 ) {
                    //System.out.print("0 ");
                } else {
                    System.out.print(graph.nodes.get(j).prev * 6 + " ");
                }
            }
            
            System.out.println("");
        }
    }
}

class Graph {
    
    HashMap<Integer,BFSNode> nodes; 

    public Graph() {
        nodes = new HashMap<>();
    }
    
    public void addNodes( int number ) {    
        for ( int i = 1 ; i <= number ; i++ ) {
            nodes.put(i, new BFSNode(i));
        }
    }
    
    public void addEdge ( int x, int y ) {
        nodes.get(x).adjs.add(y);
        nodes.get(y).adjs.add(x);
    }
    
    public void bfs( int start, HashMap<Integer,BFSNode> nodes ) {
            
        
        Queue<BFSNode> queue = new LinkedList<>();
        
        nodes.get(start).prev = 0;
        nodes.get(start).type = BFSType.VISITED;
        queue.add(nodes.get(start));
        
        while ( !queue.isEmpty() ) {
            
            BFSNode node = queue.poll();
            
            for ( int adj : node.adjs ) {
                
                BFSNode a = nodes.get(adj);
                
                if ( a.type == BFSType.INFINITE ) {
                    
                    a.type = BFSType.VISITED;
                    a.prev = node.prev + 1;
                    queue.add(a);
                    
                }
                 
            }
            
        }
        
        
    }
    
   
}

enum BFSType {
    VISITED, INFINITE;
}

class BFSNode {
    
    int number;
    BFSType type;
    ArrayList<Integer> adjs;
    
    int prev;

    public BFSNode(int number) {
        this.number = number;
        this.type = BFSType.INFINITE;
        adjs = new ArrayList<>();
        this.prev = -1;
    }    
}
