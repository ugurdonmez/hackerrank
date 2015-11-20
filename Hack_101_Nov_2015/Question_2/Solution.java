/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack_101_Nov_2015.Question_2;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        
        char [][] matrix = new char[h][w];
        
        for ( int i = 0 ; i < h ; i++ ) {
            
            matrix[i] = scanner.next().toCharArray();
            
        }
        
        int pos = 0;
        
        for ( int i = 0 ; i < w ; i++ ) {
            if ( matrix[0][i] == 'Y' ) {
                pos = i;
                break;
            }
        }
        
        if ( isEnd( 1, pos, h-1, w-1, matrix ) || isEnd( 1, pos+1, h-1, w-1, matrix ) || isEnd( 1, pos-1, h-1, w-1, matrix ) ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
    }
    
    public static boolean isEnd( int x, int y, int h, int w, char[][] matrix ) {
        
        
        
        if ( x > h  || y > w || x < 0 || y < 0) {
            return false;
        }
        
        if ( x == h && matrix[x][y] == 'E' ) {
            return true;
        }
        
        if ( matrix[x][y] == 'R' ) {
            return false;
        }
                
        return isEnd(x+1, y-1 , h , w , matrix) || isEnd(x+1, y , h , w , matrix) || isEnd(x+1, y+1 , h , w , matrix);
        
    }
}
