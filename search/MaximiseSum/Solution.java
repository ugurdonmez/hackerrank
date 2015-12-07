/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.MaximiseSum;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {

    public static void main(String[] args) {
        
        int [] a = {10,20,30,40,50,60,70,80,90,100};
        
        System.out.println( upperBound(a, a.length, 99) );
        System.out.println( upperBound(a, a.length, 5) );
        System.out.println( upperBound(a, a.length, 101) );
        
        return;
        
        

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        for (int i = 0; i < test; i++) {

            int n = scanner.nextInt();
            long k = scanner.nextLong();

            int[] array = new int[n];

            for (int j = 0; j < n; j++) {
                array[j] = scanner.nextInt();
            }

            System.out.println(getMaximizeSum(array, k));

        }
    }

    public static long getMaximizeSum(int[] array, long k) {

        long[] prefix = new long[array.length];

        long prev = 0;
        for (int i = 0; i < prefix.length; i++) {
            prev = (prev + array[i]) % k;
            prefix[i] = prev;
        }

        long max = 0;
        for (int i = array.length - 1; i >= 0; i--) {

            if (prefix[i] > max) {
                max = prefix[i];
            }

            for (int j = 0; j < i; j++) {
                long value = (prefix[i] - prefix[j] + k) % k;
                if (value > max) {
                    max = value;
                }
            }
        }

        return max;
    }

    public static int upperBound(int A[], int N, int K) {
        int low, high, mid = -1;
        low = 0;
        high = N-1;
        while (low <= high) {
            mid = (low + high) / 2; 
            if (A[mid] > K && (mid == 1 || A[mid - 1] <= K))  {
                return mid;
            } else if (A[mid] > K)  {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return mid; // this will execute when there is no element in the given array which > K
    }

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println("");

    }

}
