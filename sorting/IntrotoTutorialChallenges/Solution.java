/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.IntrotoTutorialChallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ugurdonmez
 */
public class Solution {

    public static void main (String [] args) throws IOException {
        
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        
        int v = Integer.parseInt(bi.readLine());
        int size = Integer.parseInt(bi.readLine());
        
        String[] split = bi.readLine().split(" ");
                
        for ( int i = 0 ; i < split.length ; i++) {
            if ( v == Integer.parseInt(split[i]) ) {
                System.out.println(i);
                break;
            }
        }
    }
}
