/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.Extra_long_factorials;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        BigInteger bigInteger = BigInteger.ONE;
        
        for ( int i = 1 ; i <= n ; i++ ) {
            bigInteger = bigInteger.multiply( BigInteger.valueOf(i) );
        }
        
        System.out.println(bigInteger);
        
    }
    
}
