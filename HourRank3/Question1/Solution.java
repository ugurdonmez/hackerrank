/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HourRank3.Question1;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        int total = 0;
        
        for ( int i = 11 ; i <= 15 ; i++ ) {
            
            int a = scanner.nextInt();
            
            if ( (i -a) > 0 ) {
                total += (10 * (i -a));
            }
            
            
        }
        
        System.out.println(total);
        
    }
    
}
