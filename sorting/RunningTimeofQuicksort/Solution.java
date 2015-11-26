/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.RunningTimeofQuicksort;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    static int quickSwap = 0;
    
    private static int partition( int [] array, int low, int high, Integer swap ) {
        
        int key = array[high];
        int i = low;
        for ( int a = low ; a < high ; a++ ) {
            
            if ( array[a] < key ) {
                // swap
                int temp = array[i];
                array[i] = array[a];
                array[a] = temp;
                i++;
                quickSwap++;
            }
        }
        
        // swap
        array[high] = array[i];
        array[i] = key;
        quickSwap++;
        
        return i;
    }
    
    private static void quickSort(int [] array, int low, int high, Integer swap) {
        if ( low < high ) {
            int p = partition(array, low, high, swap);
            quickSort(array, low, p-1, swap);
            quickSort(array, p+1, high, swap);
        }
    }
    
    public static void quickSort(int [] array, Integer swap) {
        quickSort(array, 0, array.length-1, swap);
    }
    
    public static int insertionSort(int [] array, int size) {
        int count = 0;
        int value = array[size-1];
        boolean found = false;
        for ( int i = size - 2; i >= 0 ; i-- ) {
            if ( value < array[i] ) {
                array[i+1] = array[i];
                count++;
            } else {
                array[i+1] = value;
                found = true;
                break;
            }
        }
        
        if ( !found ) {
            array[0] = value;
        }
        
        return count;
    }
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        int [] array = new int[size];
        int [] insert = new int[size];
        
        for ( int i = 0 ; i < size ; i++ ) {
            insert[i] = array[i] = scanner.nextInt();
        }
        
        quickSort(array, quickSwap);
        
        int count = 0;
        for ( int i = 2 ; i <= size ; i++ ) {
            count += insertionSort(insert, i);
        }
        
        
        System.out.println(count - quickSwap);
        //System.out.println(count);
        
    }
    
}
