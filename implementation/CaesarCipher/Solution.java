/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.CaesarCipher;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static char rotate ( char c, int k ) {
        
        if ( c >= 'a' && c <= 'z' ) {
            return (char) ((c - 'a' + k) % 26 + 'a');
        }
        
        if ( c >= 'A' && c <= 'Z' ) {
            return (char) ((c - 'A' + k) % 26 + 'A');
        }
        
        return c;
        
    }
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        String str = scanner.next();
        
        int k = scanner.nextInt();
        
        StringBuilder buf = new StringBuilder();
        
        for ( int j = 0 ; j < str.length() ; j++ ) {
            buf.append( rotate(str.charAt(j), k) );
        }
        
        System.out.println(buf);
        
    }
    
}
