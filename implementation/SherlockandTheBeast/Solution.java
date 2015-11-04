/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.SherlockandTheBeast;

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
            
            int n = scanner.nextInt();
            
            int count_five = n / 3;
            int count_three = 0;
            
            while ( count_five >= 0 ) {
                
                int rest = n - count_five * 3;
                
                if ( rest % 5 == 0 ) {
                    count_three = rest / 5;
                    break;
                }
                
                count_five--;
            }
            
            if ( count_five < 0 ) {
                System.out.println("-1");
                continue;
            }
                        
            for ( int j = 0 ; j < count_five ; j++ ) {
                System.out.print("555");
            }
            
            for ( int j = 0 ; j < count_three ; j++ ) {
                System.out.print("33333");
            }
            
            System.out.println("");
            
        }
        
    }
    
}
