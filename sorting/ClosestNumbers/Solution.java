/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.ClosestNumbers;

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
        
        quickSort(array);
        
        int low = Integer.MAX_VALUE;
        
        for ( int i = 0 ; i < size - 1 ; i++ ) {
            if ( array[i+1] - array[i] < low ) {
                low = array[i+1] - array[i];
            }
        }
        
        for ( int i = 0 ; i < size - 1 ; i++ ) {
            if ( array[i+1] - array[i] == low ) {
                System.out.print(array[i] + " " + array[i+1] + " ");
            }
        }
        
    }
    
    
    private static int partition( int [] array, int low, int high ) {
        
        int key = array[low];
        int i =low+1;
        int j = low+1;
        for ( int a = low+1 ; a < high ; a++ ) {
            
            if ( array[a] > key ) {
                j++;
            } else if ( array[a] < key ) {
                // swap
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                
                i++;
                j++;
            }
        }
        
        // swap
        array[low] = array[i-1];
        array[i-1] = key;
        
        return i-1;
    }
    
    private static void quickSort(int [] array, int low, int high) {
        if ( low < high ) {
            int p = partition(array, low, high);
            quickSort(array, low, p);
            quickSort(array, p+1, high);
        }
    }
    
    public static void quickSort(int [] array) {
        quickSort(array, 0, array.length);
    }
    
}
