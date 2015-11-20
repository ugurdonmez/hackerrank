/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack_101_Nov_2015.Question_4;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        char [] str = new char[n];
        
        str = scanner.next().toCharArray();
        
        for ( int i = 0 ; i < m ; i++ ) {
            
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            
            int repeat = 0;
            
            for ( int j = start - 1 ; j < str.length ; j = j + end - start + 1 ) {
                
                boolean inc = true;
                for ( int k = 0 ; k <= end-start && (j + end - start) < str.length ; k++ ) {
                    if (str[start+k-1] != str[k+j] ) {
                        inc = false;
                        break;
                    }
                }
                if (inc == true && (j + end - start) < str.length) {
                    repeat++;
                } else {
                    break;
                }
            }
            System.out.println(repeat);
        }
    }
}
