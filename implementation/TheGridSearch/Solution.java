/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.TheGridSearch;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            int r1 = scanner.nextInt();
            int c1 = scanner.nextInt();
            
            String [] origin = new String[r1];
            
            for ( int j = 0 ; j < r1 ; j++ ) {
                origin[j] = scanner.next();
            }
            
            int r2 = scanner.nextInt();
            int c2 = scanner.nextInt();
            
            String [] pattern = new String[r2];
            
            for ( int j = 0 ; j < r2 ; j++ ) {
                pattern[j] = scanner.next();
            }
            
            boolean result = false;
            for ( int a = 0 ; a <= c1-c2 ; a++ ) {
                for ( int b = 0 ; b <= r1-r2 ; b++ ) {
                    boolean found = true;
                    for ( int c = 0 ; c < r2 ; c++ ) {
                        if ( !pattern[c].equals(origin[b+c].substring(a, a+c2)) ) {
                            found = false;
                            break;
                        }
                    }
                    if ( found == true ) {
                        System.out.println("YES");
                        result = true;
                        break;
                    }
                }
                if ( result == true ) {
                    break;
                }
            }
            if ( result == false ) {
                System.out.println("NO");
            }
        }
    }
}
