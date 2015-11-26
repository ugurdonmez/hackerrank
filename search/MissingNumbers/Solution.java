/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.MissingNumbers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main (String [] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        
        int size1 = scanner.nextInt();
        for ( int i = 0 ; i < size1 ; i++ ) {
            int n = scanner.nextInt();
            if ( map1.containsKey(n) ) {
                map1.put(n, map1.get(n) + 1);
            } else {
                map1.put(n, 1);
            }
            
            if ( !map2.containsKey(n) ) {
                map2.put(n, 0);
            }
        }
        
        int size2 = scanner.nextInt();
        for ( int i = 0 ; i < size2 ; i++ ) {
            int n = scanner.nextInt();
            if ( map2.containsKey(n) ) {
                map2.put(n, map2.get(n) + 1);
            } else {
                map2.put(n, 1);
            }
            
            if ( !map1.containsKey(n) ) {
                map1.put(n, 0);
            }
        }
        
        Set<Integer> keys = map1.keySet();
        List<Integer> keyList = new ArrayList<>();
        
        keys.stream().forEach((n) -> {
            keyList.add(n);
        });
        
        Collections.sort(keyList);
        
        keyList.stream().filter((n) -> ( !Objects.equals(map1.get(n), map2.get(n)) )).forEach((n) -> {
            System.out.print(n + " ");
        });
        
        System.out.println("");
        
    }
    
}
