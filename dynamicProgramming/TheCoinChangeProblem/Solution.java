/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicProgramming.TheCoinChangeProblem;


import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int amount = scanner.nextInt();
        int types = scanner.nextInt();
        
        int [] array = new int[types];
        
        for ( int i = 0 ; i < types ; i++ ) {
            array[i] = scanner.nextInt();
        }
        
        long [][] map = new long[amount+1][types+1];
        
        for ( int i = 0 ; i < amount+1 ; i++ ) {
            for ( int j = 0 ; j < types+1 ; j++ ) {
                map[i][j] = -1;
            }
        }
        
        System.out.println(get(amount, array, 0, map));
        
    }
    
    public static long get( int amount, int [] array, int index, long [][] map ) {
        
        
        if ( map[amount][index] >= 0 ) {
            return map[amount][index];
        }
        
        if ( amount == 0 ) {
            map[amount][index] = 1;
            return 1;
        }
        
        if ( amount < 0 ) {
            map[amount][index] = 0;
            return 0;
        }
        
        if ( index >= array.length && amount > 0 ) {
            map[amount][index] = 0;
            return 0;
        }
        
        if ( index >= array.length && amount > 0 ) {
            map[amount][index] = 0;
            return 0;
        }
        
        long val = 0;
        
        for ( int i = 0 ; i * array[index] <= amount  ; i++ ) {
            val += get( amount - i * array[index], array, index+1, map );
        }
        
        map[amount][index] = val;
        return val;
    }   
}
