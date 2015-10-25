package strings.Funny_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
    public static boolean isFunny(String s) {
        
        String r = new StringBuilder(s).reverse().toString();
        
        
        for ( int i = 1 ; i < s.length() - 1 ; i++ ) {
            
            int diff1 = Math.abs( s.charAt(i) - s.charAt(i-1) );
            int diff2 = Math.abs( r.charAt(i) - r.charAt(i-1) );
            
            if ( diff1 != diff2 ) {
                return false;
            }
            
        }
        
        return true;
        
    }

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input;
            
            input = br.readLine();

            while ((input = br.readLine()) != null) {
                if ( Solution.isFunny(input) ) {
                    System.out.println("Funny");
                }
                else {
                    System.out.println("Not Funny");
                }
            }

        } catch (IOException io) {
            io.printStackTrace();
        }

    }


}
