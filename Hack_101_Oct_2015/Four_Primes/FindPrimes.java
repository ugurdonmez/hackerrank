/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack_101_Oct_2015.Four_Primes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class FindPrimes {
    
    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main ( String [] args ) {
        
        List<Integer> primes = new LinkedList<>();
        
        for ( int i = 2 ; i < 100 ; i++ ) {
            if ( check(i) ) {
                primes.add(i);
            }
        }
        
        System.out.println(primes.size());
        
        Map<Integer, Boolean> numbers = new HashMap<>();
        
        // written with two
        for ( int i = 0 ; i < primes.size() ; i++ ) {
            for ( int j = i+1 ; j < primes.size() ; j++ ) {
                int key = primes.get(i) | primes.get(j);
                numbers.put( key , Boolean.TRUE);
            }
        }
        
        for ( int i = 0 ; i < primes.size() ; i++ ) {
            for ( int j = i+1 ; j < primes.size() ; j++ ) {
                for ( int k = j + 1 ; k < primes.size() ; k++ ) {
                    int key = primes.get(i) | primes.get(j) | primes.get(k);
                    numbers.put( key , Boolean.TRUE);
                }
                
            }
        }
        
        for ( int i = 0 ; i < primes.size() ; i++ ) {
            for ( int j = i+1 ; j < primes.size() ; j++ ) {
                for ( int k = j + 1 ; k < primes.size() ; k++ ) {
                    for ( int l = k + 1 ; l < primes.size() ; l++ ) {
                        int key = primes.get(i) | primes.get(j) | primes.get(k) | primes.get(l);
                        numbers.put( key , Boolean.TRUE);
                    }
                }
            }
        }
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {
            int n = scanner.nextInt();
            
            if ( numbers.containsKey(n) ) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
    }
    
}
