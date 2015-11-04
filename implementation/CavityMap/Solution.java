/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.CavityMap;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static boolean check ( String [] array, int x , int y ) {
        
        // left
        if ( array[x].charAt(y) <= array[x].charAt(y-1) ) {
            return false;
        }
        
        // right
        if ( array[x].charAt(y) <= array[x].charAt(y+1) ) {
            return false;
        }
        
        // up
        if ( array[x].charAt(y) <= array[x-1].charAt(y) ) {
            return false;
        }
        
        // down
        if ( array[x].charAt(y) <= array[x+1].charAt(y) ) {
            return false;
        }
        
        return true;
    }
    
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        String [] array = new String[n];
        
        for ( int i = 0 ; i < n ; i++ ) {
            array[i] = scanner.next();
        }
        
        
        
        if ( n == 1 ) {
            System.out.println(array[0]);
            return;
        }
        
        System.out.println(array[0]);
         
        for ( int i = 1 ; i < array.length - 1 ; i++ ) {
            
            System.out.print(array[i].charAt(0));
            
            for ( int j = 1 ; j < n -1 ; j++ ) {
                if ( check(array, i, j) ) {
                    System.out.print("X");
                } else {
                    System.out.print(array[i].charAt( j ));
                }
            }
            System.out.println(array[i].charAt( n - 1 ));
        }
        System.out.println(array[array.length-1]);
    }
}
