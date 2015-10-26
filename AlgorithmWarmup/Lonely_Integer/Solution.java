/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmWarmup.Lonely_Integer;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        int [] array = new int[110];
        
        for ( int i = 0 ; i < 110 ; i++ ) {
            array[i] = 0;
        }
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            int a = scanner.nextInt();
            array[a]++;
            
        }
        
        for ( int i = 0 ; i < 110 ; i++ ) {
            if ( array[i] == 1 ) {
                System.out.println(i);
                return;
            }
        }
    }
}
