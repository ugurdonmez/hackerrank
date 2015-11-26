/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.FindStrings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main ( String [] args ) throws IOException {
        
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt( bi.readLine() );
        
        String [] strings = new String[n];
        
        Set<String> sets = new HashSet<>();
        
        for ( int i = 0 ; i < n ; i++ ) {
            strings[i] = bi.readLine();
            populateSet(strings[i], sets);
        }
                
        Object [] sorted = sets.stream().sorted().toArray();
        
        int test = Integer.parseInt( bi.readLine() );
        
        for ( int i = 0 ; i < test ; i++ ) {
            int index = Integer.parseInt( bi.readLine() );
            if ( index <= sorted.length ) {
                System.out.println(sorted[index-1]);
            } else {
                System.out.println("INVALID");
            }
        }
        
    }
    
    public static void populateSet( String str, Set<String> set ) {
        
        for ( int i = 0 ; i < str.length() ; i++ ) {
            for ( int j = i ; j < str.length() ; j++ ) {
                set.add(str.substring(i,j+1));
            }
        }
        
    }
    
}
