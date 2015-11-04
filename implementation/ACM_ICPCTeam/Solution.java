/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.ACM_ICPCTeam;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // TODO: store as bit array
        int [] array = new int[n];
        
        for ( int i = 0 ; i < n ; i++ ) {
            array[i] = Integer.parseInt(scanner.next(), 2);
        }
        
        int maxTopic = 0;
        int maxTeam = 0;
        
        for ( int i = 0 ; i < n ; i++ ) {
            for ( int j = i ; j < n ; j++ ) {
                int xor = array[i] ^ array[j];
                
                if ( Integer.bitCount(xor) > maxTopic ) {
                    maxTopic = Integer.bitCount(xor);
                    maxTeam = 1;
                }
                
                if ( Integer.bitCount(xor) == maxTopic ) {
                    maxTeam++;
                }
                
            }
        }
        
        System.out.println(maxTopic);
        System.out.println(maxTeam);
        
    }
    
}
