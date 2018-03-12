package implementation.EqualizeArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();

            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }


        int number = size - map.values().stream().max(Integer::compare).get();

        System.out.println(number);
    }

}
