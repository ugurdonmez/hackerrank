/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekofCode18.Question1;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int count = 0;
        for ( int i = 1 ; i <= a ; i++ ) {
            for ( int j = 1 ; j <= b ; j++ ) {
                for ( int k = 1 ; k <= c ; k++ ) {
                    for ( int l = 1 ; l <= d ;l++ ) {
                        if ( ( (i - j) % 3 == 0 ) && ( (j + k) % 5 == 0 ) && ( (i * k) % 4 == 0 ) && ( gcd(i, l) == 1 ) ) {
                            count++;
                        }
                    }
                }
            }
        }
        
        System.out.println(count);
    }
    
    public static int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }
    
}
