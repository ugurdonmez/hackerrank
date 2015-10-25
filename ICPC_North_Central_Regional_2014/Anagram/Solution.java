/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICPC_North_Central_Regional_2014.Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ugurdonmez
 */
public class Solution {
    
}

class Dictionary {
    
    Map<Integer, ArrayList<String>> dictionary;
    
    
    public Dictionary() {
        dictionary = new HashMap<>();
    }
    
    public void addToDictionary(String str) {
        
        int len = str.length();
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        
        if (dictionary.containsKey(len)) {
            dictionary.get(len).add(sorted);
        } else {
            ArrayList<String> new_list = new ArrayList<>();
            new_list.add(sorted);
            dictionary.put(len, new_list);
        }
        
    }
    
    public boolean containsWord(String str) {
        int len = str.length();
        
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        
        if (dictionary.containsKey(len)) {
            ArrayList<String> list = dictionary.get(len);
            return list.contains(sorted); 
        } else {
            return false;
        }
    }
    
    public boolean isAnagram(String start, String end) {
        
        
        
    }
    
}
