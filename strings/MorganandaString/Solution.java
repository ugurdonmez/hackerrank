/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings.MorganandaString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main (String [] args) throws IOException {
        
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        
        int test = Integer.parseInt(bi.readLine());
        
        
        for ( int i = 0 ; i < test ; i++ ) {
            String str1 = bi.readLine();
            String str2 = bi.readLine();
            
            int j = 0;
            int k = 0;            
            
            while ( j < str1.length() && k < str2.length() ) {
                
                if ( str1.charAt(j) < str2.charAt(k) ) {
                    System.out.print(str1.charAt(j));
                    j++;
                } else if ( str1.charAt(j) > str2.charAt(k) ) {
                    System.out.print(str2.charAt(k));
                    k++;
                } else {
                    int count = which(str1, j, str2, k);
                    if ( str1.substring(j+1).compareTo(str2.substring(k+1)) < 0 ) {
                        System.out.print(str2.charAt(k));
                        k++;                    
                    } else {
                        System.out.print(str1.charAt(j));
                        j++;
                    }
                }
            }
            
            if ( j < str1.length() ) {
                System.out.print(str1.substring(j));
            }
            
            if ( k < str2.length() ) {
                System.out.print(str2.substring(k));
            }
            
            System.out.println("");
        }
        
    }
    
    public static int which(String str1, int index1, String str2, int index2) {
        
        int count = 0;
        while ( index1 < str1.length() && index2 < str2.length() && str1.charAt(index1) == str2.charAt(index2) ) {
            index1++;
            index2++;
            count++;
        }
        
        if ( index1 == str1.length() ) {
            return count * -1;
        }
        
        if ( index2 == str2.length() ) {
            return count;
        }
        
        if ( str1.charAt(index1) < str2.charAt(index2) ) {
            return 1;
        } else {
            return -1;
        }
    }
    
}
