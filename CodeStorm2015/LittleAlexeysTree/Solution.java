/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeStorm2015.LittleAlexeysTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        HashMap<Integer, BFSNode> nodes = new HashMap<>();
        
        for ( int i = 1 ; i <= n ; i++ ) {
            nodes.put(i, new BFSNode(i));
        }
        
        for ( int i = 0 ; i < n-1 ; i++ ) {
            
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            char c  = scanner.next().charAt(0);
            
            nodes.get(node1).adjs.put(c, node2);
            nodes.get(node2).adjs.put(c, node1);
        }
        
        
    }
    
    public int static getLargest( BFSNode start ) {
        
        if 
        
    }
    
}

enum BFSType {
    BLACK, GRAY, WHITE;
}

class BFSNode {
    
    int number;
    BFSType type;
    HashMap<Character, Integer> adjs;
    
    int prev;

    public BFSNode(int number) {
        this.number = number;
        this.type = BFSType.WHITE;
        adjs = new HashMap<>();
        this.prev = -1;
    }
    
    
}