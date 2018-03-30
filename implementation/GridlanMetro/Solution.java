package implementation.GridlanMetro;

import java.util.*;

public class Solution {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int trains = scanner.nextInt();

        Map<Integer, Set<Integer>> map = new TreeMap<>();

        for (int i = 0; i < trains; i++) {
            int row = scanner.nextInt()-1;
            int first = scanner.nextInt()-1;
            int second = scanner.nextInt()-1;

            if (!map.containsKey(row)) {
                map.put(row, new TreeSet<>());
            }

            for (int el = first; el <= second; el++) {
                map.get(row).add(el);
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!include(map, i, j)) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }

    public static boolean include(Map<Integer, Set<Integer>> map, int row, int col) {
        if (!map.containsKey(row)) {
            return false;
        }

        Set<Integer> set = map.get(row);

        return set.contains(col);
    }

}
