/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmWarmup.Flipping_bits;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
 
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            long a = scanner.nextLong();
            
            System.out.println( Long.toUnsignedString(~a) );
            
        }
        
    }
    
}
