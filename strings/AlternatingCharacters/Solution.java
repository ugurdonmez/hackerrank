/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.AlternatingCharacters;

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
            System.out.println(getResult(scanner.next()));
        }
        
    }

    public static int getResult(String string) {
       
        char back = 'C';
        int total = 0;
        
        for ( int i = 0 ; i < string.length() ; i++ ) {
            if ( string.charAt(i) == back ) {
                total++;
            }
            back = string.charAt(i);
        }
        
        return total; 
        
    }
    
}
