/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs.Dijkstra_Shortest_Reach_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import javafx.util.Pair;

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
                graph.addEdge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            }
            
            graph.shortestPath(scanner.nextInt(), graph.nodes);
            
            for ( int j = 1 ; j <= node_number ; j++ ) {
                
                if ( graph.nodes.get(j).distance == Integer.MAX_VALUE ) {
                    System.out.print("-1 ");
                } else if ( graph.nodes.get(j).distance == 0 ) {
                    //System.out.print("0 ");
                } else {
                    System.out.print(graph.nodes.get(j).distance + " ");
                }
            }
            
            System.out.println("");
        }
    }
}

class Graph {
    
    HashMap<Integer,DijkstraNode> nodes;
    HashMap<Pair<Integer, Integer>, Integer> edges;
    

    public Graph() {
        nodes = new HashMap<>();
        edges = new HashMap<>();
    }
    
    public void addNodes( int number ) {    
        for ( int i = 1 ; i <= number ; i++ ) {
            nodes.put(i, new DijkstraNode(i));
        }
    }
    
    public void addEdge ( int x, int y, int length ) {
        
        Pair pair = new Pair( Integer.min(x, y) , Integer.max(x, y));
        
        if ( edges.containsKey(pair) ) {
            
            int l = edges.get(pair);
            
            if ( l < length ) {
                return;
            } else {
                edges.remove(pair);
            }
            
        }
        
        edges.put(pair ,length);
        nodes.get(x).adjs.add(y);
        nodes.get(y).adjs.add(x);
    }
    
    public void shortestPath( int start, HashMap<Integer,DijkstraNode> nodes ) {
            
        DijkstraNode s = nodes.get(start);
        
        s.distance = 0;

        PriorityQueue<DijkstraNode> queue = new PriorityQueue<>();
        queue.add(s);
        
        while ( !queue.isEmpty() ) {
            
            DijkstraNode node = queue.poll();
            
            for ( int adjs : node.adjs ) {
                
                DijkstraNode a = nodes.get(adjs);
                
                Pair pair = new Pair( Integer.min(node.number, a.number) , Integer.max(node.number, a.number));
                int edgeLength = edges.get(pair);
                
                if ( a.distance > edgeLength + node.distance ) {
                    a.distance = edgeLength + node.distance;
                    queue.add(a);
                }
            }
        }
    }
}


class DijkstraNode implements Comparable<DijkstraNode>{
    
    int number;
    int distance;
    ArrayList<Integer> adjs;

    public DijkstraNode(int number) {
        this.number = number;
        this.distance = Integer.MAX_VALUE;
        this.adjs = new ArrayList<>();
    }    

    @Override
    public int compareTo(DijkstraNode o) {
        return Integer.compare(this.distance, o.distance);
    }
}

