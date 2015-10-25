/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_North_Central_Regional_2014.Preorder_Traversals;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static boolean checkPreorder(ArrayList<Integer> list) {
        
        if ( list.size() == 1 || list.size() == 0 ) {
            return true;
        }
        
        int root = list.get(0);
        ArrayList<Integer> smallers = new ArrayList<>();
        ArrayList<Integer> biggers = new ArrayList<>();
        
        // check our list
        // if we found element bigger than root there would be bigger element after that
        boolean found = false;
        for ( int i = 1 ; i < list.size() ; i++ ) {
            if ( list.get(i) <= root ) {
                smallers.add(list.get(i));
                if ( found == true ) {
                    return false;
                }
            } else {
                found = true;
                biggers.add(list.get(i));
            }
        }
        
        return checkPreorder(smallers) && checkPreorder(biggers);
    }
    
    public static void main (String [] args) {
        /*
        Sample Input

        2 3 1 -7
        50 30 20 10 25 40 45
        70 90 80 -1

        Sample Output

        Case 1: no
        Case 2: yes
        */
        
        Scanner scanner = new Scanner(System.in);
        int input;
        int case_number = 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(scanner.hasNextInt()) {
            input = scanner.nextInt();
            if ( input >= 0 ) {
                list.add(input);
            } else {
                if ( checkPreorder(list)  ) {
                    System.out.println("Case "+case_number+" : yes");
                } else {
                    System.out.println("Case "+case_number+" : no");
                }
                case_number ++;
                list = new ArrayList<>();
            }
        }
    }
}
