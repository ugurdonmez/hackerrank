/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicProgramming.Candies;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int [] ratings = new int[n];
        
        int smallest_index = -1;
        int smallest = Integer.MAX_VALUE;
        
        for ( int i = 0 ; i < n ; i++ ) {
            
            ratings[i] = scanner.nextInt();
            
            if ( ratings[i] < smallest ) {
                smallest = ratings[i];
                smallest_index = i;
            }
            
        }
        
        long sum = 1;
        int current = 1;
        for ( int i = smallest_index + 1 ; i < n ; i++ ) {
            if ( ratings[i] > ratings[i-1] ) {
                current++;
                sum += current;
            } else {
                current = 1;
                sum += current;
            }
        }
        
        current = 1;
        for ( int i = smallest_index - 1 ; i > 0 ; i-- ) {
            if ( ratings[i] > ratings[i+1] ) {
                current++;
                sum += current;
            } else {
                current = 1;
                sum += current;
            }
        }
        
        System.out.println(sum);
        
    }
    
}
