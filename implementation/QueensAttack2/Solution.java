package implementation.QueensAttack2;

import java.util.Scanner;

public class Solution {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        boolean [][] obs = new boolean[n][n];

        int r = scanner.nextInt()-1;
        int c = scanner.nextInt()-1;

        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            obs[a-1][b-1] = true;
        }

        int count = 0;

        // up
        int r1 = r+1;
        int c1 = c;

        while (r1 < n) {
            if (!obs[r1][c1]) {
                count++;
                r1++;
            } else {
                break;
            }
        }

        // down
        r1 = r-1;
        c1 = c;

        while (r1 >= 0) {
            if (!obs[r1][c1]) {
                count++;
                r1--;
            } else {
                break;
            }
        }

        // left
        r1 = r;
        c1 = c - 1;
        while (c1 >= 0) {
            if (!obs[r1][c1]) {
                count++;
                c1--;
            } else {
                break;
            }
        }

        // right
        r1 = r;
        c1 = c + 1;
        while (c1 < n) {
            if (!obs[r1][c1]) {
                count++;
                c1++;
            } else {
                break;
            }
        }

        // up left
        r1 = r + 1;
        c1 = c - 1;
        while (r1 < n && c1 >= 0) {
            if (!obs[r1][c1]) {
                count++;
                c1--;
                r1++;
            } else {
                break;
            }
        }

        // up right
        r1 = r + 1;
        c1 = c + 1;
        while (r1 < n && c1 < n) {
            if (!obs[r1][c1]) {
                count++;
                c1++;
                r1++;
            } else {
                break;
            }
        }

        // down left
        r1 = r - 1;
        c1 = c - 1;
        while (r1 >= 0 && c1 >= 0) {
            if (!obs[r1][c1]) {
                count++;
                c1--;
                r1--;
            } else {
                break;
            }
        }

        // down right
        r1 = r - 1;
        c1 = c + 1;
        while (r1 >= 0 && c1 < n) {
            if (!obs[r1][c1]) {
                count++;
                c1++;
                r1--;
            } else {
                break;
            }
        }

        System.out.println(count);
    }

}
