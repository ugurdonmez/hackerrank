/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeWhiz.java.March2016;

/**
 *
 * @author user
 */
public class Singleton {
    
    private static Singleton instance;

    
    private Singleton() {
        
    }
    
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
    
    public String str;
    
}
