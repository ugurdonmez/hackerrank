/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementation.TaumandBday;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        for ( int i = 0 ; i < test ; i++ ) {

            long whiteSize = scanner.nextInt();
            long blackSize = scanner.nextInt();
            
            long whiteCost = scanner.nextInt();
            long blackCost = scanner.nextInt();
            long convertCost = scanner.nextInt();
            
            long minWhiteCost = Long.min(whiteCost, blackCost + convertCost);
            long minBlackCost = Long.min(blackCost, whiteCost + convertCost);
            
            System.out.println(whiteSize * minWhiteCost + blackSize * minBlackCost);
            
            
        }
        
    }
    
}
