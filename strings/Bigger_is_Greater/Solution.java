/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.Bigger_is_Greater;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static String switchAndSort(String str, int index) {
        
        StringBuilder buff = new StringBuilder(str);
        
        // change char
        buff.setCharAt(index,  str.charAt(index-1) );
        buff.setCharAt(index - 1, str.charAt(index));
        
        // sort
        // abaa index 2 lengt 4 
        // length -> length - index
        ArrayList<Character> list = new ArrayList<>();
        
        for ( int i = index ; i < buff.length() ; i++ ) {
            list.add(buff.charAt(i));
        }
        
        Collections.sort(list);
        
        
        
        for ( int i = 0 ; i < list.size() ; i++ ) {
            buff.setCharAt(i + index, list.get(i));
        }
        
        return buff.toString();
        
    }
    
    public static int getIndex( String str ) {
        
        for ( int i = str.length() - 1 ; i >= 1 ; i-- ) {
            
            if ( str.charAt(i-1) < str.charAt(i) ) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static void main ( String [] args ) {
        
        Scanner scanner = new Scanner(System.in);
        
        int test_cases = scanner.nextInt();
        
        String input;
        
        for ( int i = 0 ; i < test_cases ; i++ ) {
            input = scanner.next();
            
            int index = Solution.getIndex(input);
            
            if ( index == -1 ) {
                System.out.println("no answer");
            } else {
                System.out.println(Solution.switchAndSort(input, index));
            }
            
            
        }
        
        
    }
    
}
