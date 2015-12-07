
import java.io.File;
import java.io.InputStream;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ugurdonmez
 */
public class Solution {

    private static boolean deleteRecursive(String pathToDelete) {
        
        File folder = new File(pathToDelete);

        File[] files = folder.listFiles();
        if (files != null) { //some JVMs return null for empty dirs
            for (File f : files) {
                if (f.isDirectory()) {
                    if (deleteRecursive(f.getAbsolutePath()) == false ) {
                        return false;
                    }
                } else {
                    if (f.delete() == false ) {
                        return false;
                    }
                }
            }
        }
        return folder.delete();

    }
    
    public static String r(InputStream is) {
        
        StringBuilder buff = new StringBuilder();
        
        Scanner scanner = new Scanner(is);
        
        while ( scanner.hasNext() ) {
            buff.append(scanner.next());
        }
        
        return buff.toString();
        
    }
    
    public static String m(String ... args) {
        
        return StringUtils.join(args, "/");
    }

}
