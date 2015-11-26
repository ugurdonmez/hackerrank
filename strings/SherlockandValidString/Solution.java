/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.SherlockandValidString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main (String [] args) throws IOException {
        
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        
        String str = bi.readLine();
        
        int [] array = new int['z'-'a' + 1];
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            array[i] = 0;
        }
        
        for ( char c : str.toCharArray() ) {
            array[c - 'a']++;
        }
        
        HashMap<Integer, Integer> set = new HashMap<>();
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            
            System.out.println(array[i]);
            
            if (array[i] != 0) {
                if ( set.containsKey(array[i]) ) {
                    set.put(array[i], set.get(array[i]) + 1);
                } else {
                    set.put(array[i], 1);
                }
            }
        }
        
        if ( set.size() == 1 ) {
            System.out.println("YES");
        } else if ( set.size() == 2 ) {
            
            int [] keys = new int[2];
            int [] values = new int[2];
            
            int k = 0;
            for ( int a : set.keySet() ) {
                keys[k] = a;
                k++;
            }
            
            values[0] = set.get(keys[0]);
            values[1] = set.get(keys[1]);
            
            if ( (values[0] == 1 || values[1] == 1)   ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
           
        } else {
            System.out.println("NO");
        }
        
    }
    
}
