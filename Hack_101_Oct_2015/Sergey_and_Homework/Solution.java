/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hack_101_Oct_2015.Sergey_and_Homework;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    
    public static void main ( String [] args ) {
        
    }
    
    
}

class Subject implements Comparable<Subject>{
    int importance;
    int question;

    @Override
    public int compareTo(Subject o) {
        int v1 = importance * question;
        int v2 = o.importance * o.question;
        
        if ( v1 < v2 ) {
            return -1;
        } else if ( v1 > v2 ) {
            return 1;
        } else {
            return 0;
        }
                
    }
}