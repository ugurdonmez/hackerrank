/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicProgramming.TheMaximumSubarray;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static int getCont(int [] array) {
        
        int current_sum = 0;
        int current_index = -1;
        int best_sum = 0;
        int best_start_index = -1;
        int best_end_index = -1;
        
        int max = Integer.MIN_VALUE;
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            
            if ( array[i] < 0 && array[i] > max ) {
                max = array[i];
            }
            
            int val = current_sum + array[i];
            
            if ( val > 0 ) {
                if ( current_sum == 0 ) {
                    current_index = i;
                }
                current_sum = val;
            } else {
                current_sum = 0;
            }
            
            if ( current_sum > best_sum ) {
                best_sum = current_sum;
                best_start_index = current_index;
                best_end_index = i;
            }
            
        }
        
        if ( best_sum == 0 ) {
            return max;
        } else {
            return best_sum;
        }
                        
    }
    
    public static int getDisc( int [] array ) {
        
        int max = Integer.MIN_VALUE;
        
        int sum = 0;
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            if ( array[i] < 0 && array[i] > max ) {
                max = array[i];
            }
            
            if ( array[i] > 0 ) {
                sum += array[i];
            }
        }
        
        if ( sum == 0 ) {
            return max;
        } else {
            return sum;
        }
        
    }
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            int size = scanner.nextInt();
            
            int [] array = new int[size];
            
            for ( int j = 0 ; j < size ; j++ ) {
                array[j] = scanner.nextInt();
            }
            
            System.out.println( getCont(array) + " " + getDisc(array) );
            
        }
        
    }
    
}
