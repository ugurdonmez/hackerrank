/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekofCode18.Question2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        
        int [] coor = new int[k];
        
        for ( int i = 0 ; i < k ; i++ ) {
            coor[i] = scanner.nextInt();
        }
        
        double point = 0;
        for ( int i = 0 ; i < n ; i++ ) {
            point += getPoint(coor, scanner.nextInt(), scanner.nextInt()) ;
        }
        
        System.out.println(point);
        
    }
    
    public static long getPoint( int [] array, int x, int y ) {
        
        double dist = Math.sqrt(x * x + y * y );
        
        for ( int i = array.length - 1 ; i >= 0 ; i-- ) {
            if ( i != 0 && dist <= array[i] ) {
                return i+1;
            }
            if ( i == 0 && dist < array[i] ) {
                return i+1;
            } 
        }
        
        return 0;
    }
    
}
