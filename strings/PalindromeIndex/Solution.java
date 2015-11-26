/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.PalindromeIndex;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
 
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            System.out.println(getPalindromeIndex(scanner.next()));
        }
        
    }
    
    public static int getPalindromeIndex(String str) {
        
        StringBuilder buf = new StringBuilder(str);
        
        if ( isPalindrome(buf) ) {
            return -1;
        }
        
        for ( int i = 0 ; i < str.length() /2 ; i++ ) {
            if ( str.charAt(i) != str.charAt(str.length() - 1 - i) ) {
                buf = new StringBuilder(str);
                buf.deleteCharAt(i);
                if ( isPalindrome(buf) ) {
                    return i;
                } else {
                    return str.length() - 1 - i;
                }
                
            }
        }
        
        return 0;
    }
    
    public static boolean isPalindrome(StringBuilder str) {
        
        for ( int i = 0 ; i < str.length() / 2 ; i++ ) {            
            if ( str.charAt(i) != str.charAt( str.length() - 1 - i) ) {
                return false;
            }
        }
        
        return true;
    }
    
}
