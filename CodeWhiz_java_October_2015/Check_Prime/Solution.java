/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeWhiz_java_October_2015.Check_Prime;

import java.io.*;
import static java.lang.System.in;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

/**
 *
 * @author ugurdonmez
 */
class Prime {

    public static void checkPrime(int... args) {
        
        for ( int i : args) {
            if( check(i) == true ) {
                System.out.print(i + " ");
            }
        }   
        System.out.println("");
        
    }

    public static boolean check(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            Random rand = new Random();
            int n = rand.nextInt();
            Prime ob = new Prime();

            Prime.checkPrime(9, 10, 32, 89, 66);
            Prime.checkPrime(19, 78, 98, 100, 787, 8989, 12817, 11, 192);
            Prime.checkPrime(90, 2, 31, 890, 8278, 87892, 12, 10);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
