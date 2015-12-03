/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicProgramming.StockMaximize;

import java.util.ArrayList;
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
            
            int size = scanner.nextInt();
            
            int [] array = new int[size];
            
            for ( int j = 0 ; j < size ; j++ ) {
                array[j] = scanner.nextInt();
            }
            
            System.out.println(getProfit(array));
            
        }
        
    }
    
    public static long getProfit( int [] array ) {
        
        long profit = 0;
        
        int max = array[array.length - 1];
        
        for ( int i = array.length - 2 ; i >= 0 ; i-- ) {
            if ( array[i] < max ) {
                profit = profit + max - array[i];
            } else {
                max = array[i];
            }
        }
        
        return profit;
    }
    
}
