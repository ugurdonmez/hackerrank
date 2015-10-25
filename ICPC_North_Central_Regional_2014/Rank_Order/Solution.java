/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_North_Central_Regional_2014.Rank_Order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main(String [] args) {
        
        /*
        
        Sample Input

        4
        3 8 6 2
        15 37 17 3
        8
        80 60 40 20 10 30 50 70
        160 100 120 80 20 60 90 135

        Sample Output

        Case 1: agree
        Case 2: 3
        */
        
        Scanner scanner = new Scanner(System.in);
        int test_case = 1;
        
        while ( scanner.hasNextInt() ) {
            int size = scanner.nextInt();
            ArrayList<Rank> rank1 = new ArrayList<>();
            ArrayList<Rank> rank2 = new ArrayList<>();
            
            for ( int i = 0 ; i < size ; i++ ) {
                rank1.add(new Rank(scanner.nextInt(), i));
            }
            
            for ( int i = 0 ; i < size ; i++ ) {
                rank2.add(new Rank(scanner.nextInt(), i));
            }
            
            Collections.sort(rank1);
            Collections.sort(rank2);
            
            if ( rank1.get(0).index != rank2.get(0).index ) {
                System.out.println("Case "+test_case+": 1");
            } else if ( rank1.get(1).index != rank2.get(1).index ) {
                System.out.println("Case "+test_case+": 2");
            } else if ( rank1.get(2).index != rank2.get(2).index ) {
                System.out.println("Case "+test_case+": 3");
            } else {
                System.out.println("Case "+test_case+": agree");
            }
            
            test_case++;
            
        }
        
        
        
    }
    
}

class Rank implements Comparable<Rank>{
    
    int rank;
    int index;

    public Rank(int rank, int index) {
        this.rank = rank;
        this.index = index;
    }

    @Override
    public int compareTo(Rank o) {
        
        if ( this.rank < o.rank ) {
            return 1;
        } else if ( this.rank == o.rank ) {
            return 0;
        } else {
            return -1;
        }    
    }    
    
}
