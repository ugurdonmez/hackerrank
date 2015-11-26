/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.SherlockandArray;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
 
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            int size = scanner.nextInt();
            
            int [] array = new int[size];
            
            int sum = 0;
            for ( int j = 0 ; j < size ; j++ ) {
                array[j] = scanner.nextInt();
                sum += array[j];
            }
            
            int sumLeft = 0;
            int sumRight = sum - array[0];
            
            boolean found = false;
            for ( int j = 1 ; j < size - 1 ; j++ ) {
                sumLeft += array[j-1];
                sumRight -= array[j];
                
                if ( sumLeft == sumRight ) {
                    found = true;
                    break;
                }
                
            }
            
            if ( found  || size == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
