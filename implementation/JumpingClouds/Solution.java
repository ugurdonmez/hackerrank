package implementation.JumpingClouds;

import java.util.Scanner;

public class Solution {

    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int [] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int cost = 0;

        int index = 0;

        while (index < size - 2) {
            if (array[index+1] == 0 && array[index+2] == 0) {
                cost++;
                index = index+2;
            } else if (array[index+1] == 0 && array[index+2] == 1) {
                cost++;
                index++;
            } else if (array[index+1] == 1 && array[index+2] == 0) {
                cost++;
                index = index+2;
            } else {
                System.out.println("error");
                return;
            }
        }

        if (index != size-1) {
            cost++;
        }

        System.out.println(cost);
    }

}
