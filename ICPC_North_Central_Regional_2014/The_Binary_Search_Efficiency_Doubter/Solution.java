/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_North_Central_Regional_2014.The_Binary_Search_Efficiency_Doubter;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static int doubter(int size, Map<Integer, Integer> results) {
        
        if ( results.containsKey(size) ) {
            return results.get(size);
        }       
        
        if (size == 1) {
            results.put(1, 1);
            return 1;
        }
        
        if ( size == 0 ) {
            results.put(0, 0);
            return 0;
        }
        
        int size_left = size / 2;
        int size_right = (size - 1) / 2;
        
        int result = size_left + doubter(size_left, results) + size_right + doubter(size_right, results) + 1;
        results.put(size, result);
        
        return result;
    }
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int case_number = 1;
        int array_size;
        
        Map<Integer, Integer> result_table = new Hashtable<>();
        
        while ( scanner.hasNextInt() ) {
            array_size = scanner.nextInt();
            System.out.println("Case "+ case_number++ +": "+ Solution.doubter(array_size, result_table));
        }
        
    }
    
}
