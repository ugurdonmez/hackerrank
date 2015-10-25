/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeWhiz_java_October_2015.Area_of_a_Parallelogram;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ugurdonmez
 */
public class Solution {

    public static boolean flag;
    public static int H;
    public static int B;

    static {
        
        Scanner scanner = new Scanner(System.in);
        H = scanner.nextInt();
        B = scanner.nextInt();
        flag = true;
        
        if ( B < 0 || H < 0 ) {
            try {
                throw new Exception("Breadth and height must be positive");
            } catch (Exception ex) {
                System.out.println(ex);
                flag = false;
            }
        }
        
        
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}
