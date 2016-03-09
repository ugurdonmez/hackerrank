/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WeekofCode19.FixtheCycles;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Solution {
    
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int f = scanner.nextInt();
        
        int c1 = a+b+f;
        int c2 = a+e+d;
        int c3 = a+b+c+d;
        
        int m = Integer.min(c1, c2);
        m = Integer.min(c3, m);
        
        if (m < 0) {
            System.out.println(-m);
        } else {
            System.out.println(-1);
        }
        
        
    }
    
}
