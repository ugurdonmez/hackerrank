/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs.Kruskal_MST_Special_Subtree.newpackage;


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
        //int test = scanner.nextInt();
        
        //for ( int i = 0 ; i < test ; i ++ ) {
            
            Graph graph = new Graph();
            int node_number = scanner.nextInt();
            int edge_number = scanner.nextInt();
            
            graph.addNodes(node_number);
            
            for ( int j = 0 ; j < edge_number ; j++ ) {
                graph.addEdge(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            }
            
            int value = graph.primMST(scanner.nextInt());
            
            
            
            System.out.println(value);
        //}
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
    
    public int primMST(int start) {
        
        boolean [] knowns = new boolean[nodes.size() +1];
        int [] dist = new int[nodes.size()+1];
        
        for ( int i = 1 ; i <= nodes.size() ; i++ ) {
            knowns[i] = false;
            dist[i] = Integer.MAX_VALUE;
        }
        
        PriorityQueue<KruskalEdge> queue = new PriorityQueue<>();
        
        // add all edges to queue
        for ( Pair p : edges.keySet() ) {
            KruskalEdge edge = new KruskalEdge((int)p.getKey(), (int)p.getValue(), edges.get(p));
            queue.add(edge);
        }
        

        
        
        int returnValue = 0;
        
        for ( int i = 1 ; i <= nodes.size() ; i++ ) {
            if ( dist[i] != Integer.MAX_VALUE ) {
                returnValue += dist[i];
            }
        }
        
        return returnValue;
    }
}

class KruskalEdge implements Comparable<KruskalEdge> {
    int x;
    int y;
    int length;

    public KruskalEdge(int x, int y, int length) {
        this.x = x;
        this.y = y;
        this.length = length;
    }

    @Override
    public int compareTo(KruskalEdge o) {
        return Integer.compare(this.length, o.length);
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



