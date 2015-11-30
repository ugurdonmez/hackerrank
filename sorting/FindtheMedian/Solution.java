/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.FindtheMedian;

import java.util.Scanner;
/**
 *
 * @author ugurdonmez
 */
public class Solution {
 
    private static int partition( int [] array, int low, int high ) {
        
        int key = array[high];
        int i = low;
        for ( int a = low ; a < high ; a++ ) {
            
            if ( array[a] < key ) {
                // swap
                int temp = array[i];
                array[i] = array[a];
                array[a] = temp;
                i++;
            }
        }
        
        // swap
        array[high] = array[i];
        array[i] = key;
        
        return i;
    }
    
    private static void quickSort(int [] array, int low, int high) {
        if ( low < high ) {
            int p = partition(array, low, high);
            if ( p == array.length / 2 ) {
                System.out.println(array[p]);
            } else {
                quickSort(array, low, p-1);
                quickSort(array, p+1, high);
            }
        }
    }
    
    public static void quickSort(int [] array) {
        quickSort(array, 0, array.length-1);
    }
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        int [] array = new int[size];
        
        for ( int i = 0 ; i < size ; i++ ) {
            array[i] = scanner.nextInt();
        }
        
        quickSort(array);
        
    }
    
    private static void printArray( int [] array ) {
        
        for ( int i = 0 ; i < array.length ; i++ ) {
            System.out.print(array[i] +" ");
        }
        
        System.out.println("");
    }
    
}
