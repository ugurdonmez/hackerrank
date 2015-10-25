/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.Two_Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static boolean isCommonSubstring(String str1, String str2) {
        
        boolean [] letters = new boolean[26];
        
        for ( int i = 0 ; i < 26 ; i++ ) {
            letters[i] = false;
        }
        
        str1 = str1.toLowerCase();
        
        for ( int i = 0 ; i < str1.length() ; i++ ) {
            char c = str1.charAt(i);
            
            if ( c != ' ' ) {
                letters[ c - 'a' ] = true;
            }
        }
        
        for ( int i = 0 ; i < str2.length() ; i++ ) {
            char c = str2.charAt(i);
            
            if ( c != ' ' && letters [ c - 'a' ] == true) {
                return true;
            }
            
        }
        
        return false;
        
    }
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        String input1;
        String input2;
        int test = scanner.nextInt();
        for ( int i = 0 ; i < test ; i++ ) {
            input1 = scanner.next();
            input2 = scanner.next();
            
            if ( isCommonSubstring(input1, input2) ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            
        }
        
    } 
    
}
