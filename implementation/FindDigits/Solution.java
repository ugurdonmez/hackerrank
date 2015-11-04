/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.FindDigits;

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
            
            int number = scanner.nextInt();
            
            StringBuilder buf = new StringBuilder( Integer.toString(number) );
            
            int count = 0;
            
            for ( int j = 0 ; j < buf.length() ; j++ ) {
                String sub = buf.substring(j, j+1);
                int digit = Integer.parseInt(sub);
                
                if ( digit != 0 && number % digit == 0 ) {
                    count++;
                }
                
            }
            
            System.out.println(count);
            
        }
    }
}
