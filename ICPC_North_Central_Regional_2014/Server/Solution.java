/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_North_Central_Regional_2014.Server;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static void main ( String [] args ) {
        
        /*
        
        6 180
        45 30 55 20 80 20
        10 60
        20 7 10 8 10 27 2 3 10 5

        Sample Output

        Case 1: 4
        Case 2: 5
        
        */
        
        Scanner scanner = new Scanner(System.in);
        int jobs_number;
        int jobs_time;
        int case_number = 1;
        
        while(scanner.hasNextInt()) {
            jobs_number = scanner.nextInt();
            jobs_time = scanner.nextInt();
            
            int result = 0;
            int total_time = 0;
            for ( int i = 0 ; i < jobs_number ; i++ ) {
                int time = scanner.nextInt();
                if ( time + total_time <= jobs_time) {
                    result++;
                }
                total_time += time;
            }
            
            System.out.println("Case "+case_number+": " + result);
            case_number++;
            
        }
        
    }
    
}
