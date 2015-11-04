/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.LibraryFine;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
 
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        //D M Y
        
        int d1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        
        int d2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        if ( y1 > y2 ) {
            
            System.out.println("10000");
            return;
        }
        
        
        if ( y1 == y2 && m1 > m2 ) {
            System.out.println(500 * (m1 - m2));
            return;
        }
        
        if ( y1 == y2 && m1 == m2 && d1 > d2 ) {
            System.out.println(15 * (d1 - d2));
            return;
        }
        
        System.out.println(0);
    }
    
}
