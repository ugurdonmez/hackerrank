/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup.PlusMinus;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        int size_pos = 0;
        int size_neg = 0;
        int size_zero = 0;
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            int a = scanner.nextInt();
            
            if ( a > 0 ) {
                size_pos++;
            } else if ( a < 0 ) {
                size_neg++;
            } else {
                size_zero++;
            }
            
        }
        
        System.out.println((float)size_pos/test);
        System.out.println((float)size_neg/test);
        System.out.println((float)size_zero/test);
        
    }
    
}
