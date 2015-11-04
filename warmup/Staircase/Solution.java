/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup.Staircase;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 1 ; i <= test ; i++ ) {
            
            for ( int j = 0 ; j < test - i ; j++ ) {
                System.out.print(" ");
            }
            
            for ( int j = 0 ; j < i ; j++ ) {
                System.out.print("#");
            }
            
            System.out.println("");
            
        }
    }
    
}
