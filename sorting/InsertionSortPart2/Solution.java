/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.InsertionSortPart2;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main (String [] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        
        int [] array = new int[size];
        
        for ( int i = 0 ; i < size ; i++ ) {
            array[i] = scanner.nextInt();
        }
        
        for ( int i = 2 ; i <= size ; i++ ) {
            insertionSort(array, i);
            print(array);
        }

    }
    
    public static void insertionSort(int [] array, int size) {
        int value = array[size-1];
        boolean found = false;
        for ( int i = size - 2; i >= 0 ; i-- ) {
            if ( value < array[i] ) {
                array[i+1] = array[i];
            } else {
                array[i+1] = value;
                found = true;
                break;
            }
        }
        
        if ( !found ) {
            array[0] = value;
        }
    }
    
    public static void print(int [] array) {
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
        
    }
    
}
