/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.Pangrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static boolean isPanagram(String s) {
        
        boolean [] letters = new boolean[26];
        
        for ( int i = 0 ; i < 26 ; i++ ) {
            letters[i] = false;
        }
        
        s = s.toLowerCase();
        
        for ( int i = 0 ; i < s.length() ; i++ ) {
            char c = s.charAt(i);
            
            if ( c != ' ' ) {
                letters[ c - 'a' ] = true;
            }
        }
        
        for ( boolean b : letters ) {
            if ( b == false ) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main ( String [] args ) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input;
            
            while ((input = br.readLine()) != null) {
                if ( isPanagram(input) ) {
                    System.out.println("pangram");
                }
                else {
                    System.out.println("not pangram");
                }
            }

        } catch (IOException io) {
            io.printStackTrace();
        }
        
    } 
    
}
