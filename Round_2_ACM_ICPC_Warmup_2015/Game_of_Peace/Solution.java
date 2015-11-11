/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round_2_ACM_ICPC_Warmup_2015.Game_of_Peace;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static long GCD(long a, long b) {
        if (b==0) 
            return a;
        return GCD(b,a%b);
    }
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 1 ; i <= test ; i++ ) {
            
            int x = scanner.nextInt();
            int n = scanner.nextInt();
            int y = scanner.nextInt();
            int m = scanner.nextInt();
            
            long n1 = x;
            long n2 = 0;
            
            boolean bug = false;
            
            for ( int j = 0 ; j < m ; j++ ) {
                                
                if ( bug == false && j != 0 && j % n == 0 ) {
                                        
                    if ( n1 > n2 ) {
                        n1 += y;
                    } else {
                        n2 += y;
                    }
                    
                    bug = true;
                    
                }
                
                if ( n1 > n2 ) {
                    long temp = n2;
                    n2 = n1;
                    n1 = n1 + temp;
                } else {
                    long temp = n1;
                    n1 = n2;
                    n2 = n2 + temp;
                }
                
                          
            }
            
            System.out.println("Case "+i+": "+GCD(n1, n2));
            
        }
        
    }
    
}
