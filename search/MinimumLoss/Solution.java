package search.MinimumLoss;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        PairIndex [] array = new PairIndex[size];

        for (int i = 0; i < size; i++) {
            array[i] = new PairIndex(scanner.nextLong(), i);
        }

        Arrays.sort(array);

        long min = Long.MAX_VALUE;

        for (int i = 0; i < size-1; i++) {
            if (array[i].index > array[i+1].index) {
                min = Long.min(min, array[i+1].value - array[i].value);
            }
        }

        System.out.println(min);
    }


}

class PairIndex implements Comparable<PairIndex> {

    final long value;
    final long index;

    public PairIndex(long value, long index) {
        this.value = value;
        this.index = index;
    }

    @Override
    public int compareTo(PairIndex o) {
        return Long.compare(this.value, o.value);
    }
}