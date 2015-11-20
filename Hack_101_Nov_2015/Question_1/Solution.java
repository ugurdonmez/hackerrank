/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack_101_Nov_2015.Question_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        
        int [] array1 = new int[101];
        int [] array2 = new int[101];
        
        for ( int i = 0 ; i <= 100 ; i++ ) {
            array1[i] = array2[i] = 0;
        }
        
        for ( int i = 0 ; i < test ; i++) {
            array1[scanner.nextInt()]++;
        }
        
        for ( int i = 0 ; i < test+1 ; i++) {
            array2[scanner.nextInt()]++;
        }
        
        for ( int i = 0 ; i <= 100 ; i++ ) {
            if (array1[i] != array2[i] ) {
                System.out.println(i);
                break;
            }
        }
    }
}
