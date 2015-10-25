/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_North_Central_Regional_2014.Locked_Treasure;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main ( String [] args  ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int total_test_case = scanner.nextInt();
        
        for ( int i = 1 ; i <= total_test_case ; i++ ) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            int result = 1;
            
            for ( int j = 1 ; j <= n ; j++ ) {
                result *= j;
            }
            
            for ( int j = 1 ; j <= k ; j++ ) {
                result /= j;
            }
            
            for ( int j = 1 ; j <= n-k ; j++ ) {
                result /= j;
            }
            
            System.out.println("Case "+i+": "+result);
        }
        
    }
    
}
