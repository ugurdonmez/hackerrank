package search.KnightLonaChessboard;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {

    public static void main (String [] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int [][] results = new int[n][n];

        for (int a = 1; a < n; a++) {
            for (int b = a; b < n; b++) {
                // calculate results[a][j]

                if (a == b) {
                    // calculate directly
                    if ( (n-1) % a == 0) {
                        results[a][a] = (n-1) / a;
                    } else {
                        results[a][a] = -1;
                    }

                    continue;
                }

                boolean [][] found = new boolean[n][n];
                int [][] costs = new int[n][n];

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        costs[i][j] = -1;
                        found[i][j] = false;
                    }
                }

                // bfs
                found[0][0] = true;
                costs[0][0] = 0;

                boolean stop = false;
                Queue<MyPair> queue = new LinkedList<>();

                queue.add(new MyPair(0, 0));

                while (!stop && !queue.isEmpty()) {
                    int x;
                    int y;
                    MyPair pair = queue.poll();

                    // check the result
                    if (pair.x == n-1 && pair.y == n-1) {
                        // found
                        stop = true;
                        results[a][b] = costs[pair.x][pair.y];
                        results[b][a] = costs[pair.x][pair.y];
                    }

                    int childCost = 1 + costs[pair.x][pair.y];

                    // child 1
                    // + +
                    x = pair.x + a;
                    y = pair.y + b;
                    checkChild(x, y, n, costs, found, childCost, queue);

                    // child 2
                    // + -
                    x = pair.x + a;
                    y = pair.y - b;
                    checkChild(x, y, n, costs, found, childCost, queue);

                    // child 3
                    // - +
                    x = pair.x - a;
                    y = pair.y + b;
                    checkChild(x, y, n, costs, found, childCost, queue);

                    // child 4
                    x = pair.x - a;
                    y = pair.y - b;
                    checkChild(x, y, n, costs, found, childCost, queue);

                    // child 5
                    // + +
                    x = pair.x + b;
                    y = pair.y + a;
                    checkChild(x, y, n, costs, found, childCost, queue);

                    // child 6
                    // + -
                    x = pair.x + b;
                    y = pair.y - a;
                    checkChild(x, y, n, costs, found, childCost, queue);

                    // child 7
                    // - +
                    x = pair.x - b;
                    y = pair.y + a;
                    checkChild(x, y, n, costs, found, childCost, queue);

                    // child 8
                    x = pair.x - b;
                    y = pair.y - a;
                    checkChild(x, y, n, costs, found, childCost, queue);
                }

                if (stop == false) {
                    results[a][b] = -1;
                    results[b][a] = -1;
                }

            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(results[i][j] + " ");
            }

            System.out.println();
        }
    }

    private static void checkChild(int x, int y, int n, int [][] costs, boolean [][] found, int cost, Queue<MyPair> queue) {

        // check boundaries
        if (x < 0 || y < 0 || x >= n || y >= n) {
            return;
        }

        if (found[x][y]) {
            return;
        }

        costs[x][y] = cost;
        found[x][y] = true;

        queue.add(new MyPair(x, y));
    }

}

class MyPair {
    final int x;
    final int y;

    public MyPair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}