/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warmup.TimeConversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ugurdonmez
 */
public class Solution {

    public static void main(String[] args) {
        // 07:05:45PM

        Scanner scanner = new Scanner(System.in);

        String time = scanner.next();
        
        time = new StringBuilder(time).insert(time.length()-2, " ").toString();

        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss aa");
        Date date;
        try {
            date = parseFormat.parse(time);
            System.out.println(parseFormat.format(date) + " = " + displayFormat.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(Solution.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }

}
