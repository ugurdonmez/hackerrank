/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeWhiz_java_October_2015.Compare_The_Players;

import java.io.*;
import java.util.*;

/**
 *
 * @author ugurdonmez
 */
class Player {

    String name;
    int score;
}

class Checker {
    
    public aaa desc;
    
    public Checker() {
        desc = new aaa();
    }
    

    class aaa implements Comparator<Player> {

        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score > o2.score) {
                return -1;
            } else if (o1.score < o2.score) {
                return 1;
            } else {
                return o2.name.compareTo(o1.name);
            }
        }

    }

}

public class Solution {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());
        String s;
        StringTokenizer st;
        Player Player[] = new Player[N];
        Checker check = new Checker();

        for (int i = 0; i < N; i++) {
            s = br.readLine().trim();
            st = new StringTokenizer(s);
            Player[i] = new Player();
            Player[i].name = st.nextToken();
            Player[i].score = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(Player, check.desc);
        for (int i = 0; i < Player.length; i++) {
            System.out.printf("%s %s\n", Player[i].name, Player[i].score);
        }

    }
}
