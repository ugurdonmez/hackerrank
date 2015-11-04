/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeStorm2015.EmmasNotebook;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int t = scanner.nextInt();
        
        int n = t / 2 + 1;
        
        if ( t % 2 == 0 ) {
            System.out.println( n*(n+1)-n-1 );
        } else {
            System.out.println(n*(n+1)-1);
        }
        
    }
    
}
