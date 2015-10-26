/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmWarmup.Diagonal_Difference;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        int first = 0;
        int second = 0;
        
        for ( int i = 0 ; i < test ; i++ ) {
            for ( int j = 0 ; j < test ; j ++ ) {
                int a = scanner.nextInt();
                
                if ( i == j ) {
                    first += a;
                }
                
                if ( i + j == test - 1 ) {
                    second += a;
                }
            }
        }
        
        System.out.println( Math.abs( first - second ) );
        
    }
    
}
