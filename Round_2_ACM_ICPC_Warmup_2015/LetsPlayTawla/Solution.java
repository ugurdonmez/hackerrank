/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round_2_ACM_ICPC_Warmup_2015.LetsPlayTawla;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test = scanner.nextInt();
        
        HashMap<Integer, String> map = new HashMap<>();
        
        map.put(1, "Yakk");
        map.put(2, "Doh");
        map.put(3, "Seh");
        map.put(4, "Ghar");
        map.put(5, "Bang");
        map.put(6, "Sheesh");
        
        for ( int i = 1 ; i <= test ; i++ ) {
            
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            
            if ( x == 1 && y == 1 ) {
                System.out.println("Case "+i+": Habb Yakk");
            } else if ( x == 2 && y == 2 ) {
                System.out.println("Case "+i+": Dobara");
            } else if ( x == 3 && y == 3 ) {
                System.out.println("Case "+i+": Dousa");
            } else if ( x == 4 && y == 4 ) {
                System.out.println("Case "+i+": Dorgy");
            } else if ( x == 5 && y == 5 ) {
                System.out.println("Case "+i+": Dabash");
            } else if ( x == 6 && y == 6 ) {
                System.out.println("Case "+i+": Dosh");
            } else if ( x == 5 && y == 6 || x == 6 && y == 5 ) {
                System.out.println("Case "+i+": Sheesh Beesh");
            } else {
                
                System.out.println("Case "+i+": " + map.get( Integer.max(x, y) ) + " " + map.get( Integer.min(x, y) )    );
                
            }
        }
    }
}
