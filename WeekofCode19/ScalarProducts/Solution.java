/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekofCode19.ScalarProducts;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Solution {
    
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        int c = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        int [] array = new int[2 * n + 2];
        array[0] = 0;
        array[1] = c;
        for (int i = 2; i <= 2 * n + 1 ; i++) {
            array[i] = ( array[i-2] + array[i-1] ) % m;
        }
        
        HashSet<Integer> set = new HashSet<>();
        
        for (int i = 0 ; i < n  ; i++) {
            for (int j = i+1 ; j < n ; j++) {
                set.add(cross(array[2*(i+1)], array[2*(i+1)+1], array[2*(i+1)], array[2*(i+1)+1]));
            }
        }
        
        System.out.println(set.size());
    }
    
    public static int cross(int x1, int x2, int y1, int y2) {
        return x1*y1 + x2*y2;
    }
    
}
