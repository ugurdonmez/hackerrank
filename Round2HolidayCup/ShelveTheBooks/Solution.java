/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Round2HolidayCup.ShelveTheBooks;

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
        
        HashMap<Integer, Long> map = new HashMap<>();
        
        map.put(0, new Long(1));
        
        for ( int i = 0 ; i < test ; i++ ) {
            
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            if ( map.containsKey(k) ) {
                System.out.println(map.get(k));
            } else {
                System.out.println(getResult(k, map));
            }
        } 
        
        
        
    }
    
    public static long getResult(int k, HashMap<Integer, Long> map) {
        
        long pro = 1;
        
        for ( int i = 0 ; i < k ; i ++ ) {
            
            pro = ((i + 1) * (pro * 8)) % (1000000007);
            map.put(i+1, pro);
        }
        
        return pro;
    }
    
}