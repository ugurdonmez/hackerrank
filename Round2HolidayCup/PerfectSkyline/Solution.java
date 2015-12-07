/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round2HolidayCup.PerfectSkyline;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        
        int [] array = new int[size];
        
        for ( int i = 0 ; i < size ; i++ ) {
            array[i] = scanner.nextInt();
        }
        
        if ( size == 1 ) {
            System.out.println("Perfect");
        } else if ( isPerject(array) ) {
            System.out.println("Perfect");
        } else {
            System.out.println("Not perfect");
        }
        
    }
    
    public static boolean isPerject(int [] array) {
        
        int middle = array.length / 2;
        
        for ( int i = 0 ; i < middle ; i++ ) {
            
            if ( array[i] >= array[i+1] ) {
                return false;
            }
            
            if ( array[i] != array[ array.length - i -1] ) {
                return false;
            }
            
        }
        
        if ( array[middle-1] > array[middle] ) {
            return false;
        }
                
        return true;
    }
    
}
