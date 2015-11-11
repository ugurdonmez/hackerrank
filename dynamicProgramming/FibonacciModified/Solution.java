/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicProgramming.FibonacciModified;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        
        int el = scanner.nextInt();
        
        BigInteger [] array = new BigInteger[el];
        
        array[0] = BigInteger.valueOf(first);
        array[1] = BigInteger.valueOf(second);
        
        for ( int i = 2 ; i < el ; i++ ) {
            array[i] = array[i-1].multiply(array[i-1]).add(array[i-2]);
        }
        
        System.out.println(array[el-1]);
        
    }
    
}
