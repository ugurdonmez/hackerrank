/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack_101_Oct_2015.Voting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {

    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Integer> result = new HashMap<>();
        
        int totalSize = scanner.nextInt();
        
        for ( int i = 0 ; i < totalSize ; i++ ) {
            
            String vote = scanner.next();
            
            if ( result.containsKey(vote) ) {
                int r = result.get(vote);
                result.put(vote, r+1); 
            } else {
                result.put(vote, 1);
            }
            
        }
        
        for ( String vote : result.keySet() ) {
            int t = result.get(vote);
            if ( t > totalSize / 2 ) {
                System.out.println(vote);
                break;
            }
        }
        
    }
    
}

