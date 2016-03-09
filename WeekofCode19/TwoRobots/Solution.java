/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekofCode19.TwoRobots;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class Solution {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for (int i = 0 ; i < test ; i++) {
            
            HashMap<Key, Integer> map = new HashMap<>();
            
            int m = scanner.nextInt();
            int nQuery = scanner.nextInt();
            
            int [] pathsStart = new int[nQuery];
            int [] pathsEnd = new int[nQuery];
            
            for (int j = 0 ; j < nQuery; j++) {
                pathsStart[j] = scanner.nextInt();
                pathsEnd[j] = scanner.nextInt();
            }
            
            System.out.println( getLen(-1, -1, pathsStart, pathsEnd, nQuery, 0, 0, map) );
        }
        
    }
    
    public static int getLen(int posR1, int posR2, int [] pathsStart, int [] pathsEnd, int size, int pathNo, int total, HashMap<Key, Integer> map) {
        
        
        Key key = new Key(posR1, posR2, pathNo, total);
        
        if (map.containsKey(key)) {
            return map.get(key);
        }
        
        int pathWeigh = getDiff(pathsStart[pathNo], pathsEnd[pathNo]);
        
        // base case
        if (pathNo == size - 1) {
            // calculate with posR1
            int weight1 = getDiff(posR1, pathsStart[pathNo]) + pathWeigh;
            // calculate with posR2
            int weight2 = getDiff(posR2, pathsStart[pathNo]) + pathWeigh;
            
            int value = total + Math.min(weight1, weight2);
            
            map.put(key, value);
            return value;
        }
        
        // calculate with posR1
        int weight1 = getDiff(posR1, pathsStart[pathNo]) + pathWeigh;
        int totalWeight1 = getLen(pathsEnd[pathNo], posR2, pathsStart, pathsEnd, size, pathNo+1, total + weight1, map);
        
        // calculate with posR2
        int weight2 = getDiff(posR2, pathsStart[pathNo]) + pathWeigh;
        int totalWeight2 = getLen(posR1, pathsEnd[pathNo], pathsStart, pathsEnd, size, pathNo+1, total + weight2, map);
        
        int value = Math.min(totalWeight1, totalWeight2);
        map.put(key, value);
        return value;
    }
    
    public static int getDiff(int x1, int x2) {
        if (x1 == -1) {
            return 0;
        } else {
            return Math.abs(x1-x2);
        }
    }
     
}

class Key {
    
    int p1;
    int p2;
    int path;
    int total;

    public Key(int p1, int p2, int path, int total) {
        this.p1 = p1;
        this.p2 = p2;
        this.path = path;
        this.total = total;
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if ( !(obj instanceof Key) ) {
            return false;
        }
        
        Key k = (Key) obj;
        
        if ( k.p1 == this.p1 && k.p2 == this.p2 && k.path == this.path && k.total == this.total ) {
            return true;
        } else {
            return false;
        }
        
    }
    
    
}