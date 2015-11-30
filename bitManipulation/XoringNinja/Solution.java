/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitManipulation.XoringNinja;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
                
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            int size = scanner.nextInt();
            
            int or = 0;
            for ( int j = 0 ; j < size ; j++ ) {
                or = or | scanner.nextInt();
            }
            
            System.out.println( (int) (( Math.pow(2, size-1) * or) % (Math.pow(10, 9)+7) ));
            
        }
        
    }
    
}
