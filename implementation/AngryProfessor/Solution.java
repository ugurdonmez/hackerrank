/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.AngryProfessor;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            int student = scanner.nextInt();
            int least = scanner.nextInt();
            
            int current = 0;
            
            for ( int j = 0 ; j < student ; j++ ) {
                if ( scanner.nextInt()< 1 ) {
                    current++;
                }
            }
            
            if ( current >= least ) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
    
}
