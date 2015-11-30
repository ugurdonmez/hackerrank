/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search.CountLuck;

import java.util.Scanner;

/**
 *
 * @author ugurdonmez
 */
public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int test_case = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < test_case; i++) {

            String line = sc.nextLine();

            int row = Integer.parseInt(line.split(" ")[0]);
            int coloumn = Integer.parseInt(line.split(" ")[1]);

            Image image = new Image(row, coloumn, sc);

            int k = Integer.parseInt(sc.nextLine());

            int vawe = image.getCornerCount();
            
            if ( vawe == k ) {
                System.out.println("Impressed");
            } else {
                System.out.println("Oops!");
            }
        }
    }
}

class Image {

    int row;
    int coloumn;

    int h_row;
    int h_coloum;

    Pixel[][] pixels;

    public Image(int row, int coloumn, Scanner sc) {
        this.row = row;
        this.coloumn = coloumn;

        pixels = new Pixel[row][coloumn];

        for (int x = 0; x < row; x++) {

            String line = sc.nextLine();

            for (int y = 0; y < coloumn; y++) {
                if (line.charAt(y) == '.') {
                    pixels[x][y] = new Pixel(PixelType.EMPTY, x, y);
                } else if (line.charAt(y) == 'X') {
                    pixels[x][y] = new Pixel(PixelType.TREE, x, y);
                } else if (line.charAt(y) == '*') {
                    pixels[x][y] = new Pixel(PixelType.EXIT, x, y);
                } else if (line.charAt(y) == 'M') {
                    pixels[x][y] = new Pixel(PixelType.HERMIONE, x, y);
                    h_row = x;
                    h_coloum = y;
                }
            }
        }
    }

    public int getCornerCount() {

        return DFS(pixels[h_row][h_coloum], 0);

    }

    private Pixel getLeft(Pixel pixel) {
        if (pixel.y - 1 >= 0) {
            return pixels[pixel.x][pixel.y - 1];
        } else {
            return null;
        }
    }

    private Pixel getRight(Pixel pixel) {
        if (pixel.y + 1 < coloumn) {
            return pixels[pixel.x][pixel.y + 1];
        } else {
            return null;
        }
    }

    private Pixel getUp(Pixel pixel) {
        if (pixel.x - 1 >= 0) {
            return pixels[pixel.x - 1][pixel.y];
        } else {
            return null;
        }
    }

    private Pixel getDown(Pixel pixel) {
        if (pixel.x + 1 < row) {
            return pixels[pixel.x + 1][pixel.y];
        } else {
            return null;
        }
    }

    private int DFS(Pixel pixel, int count) {

        if (pixel == null) {
            return -1;
        }

        if (pixel.type == PixelType.TREE) {
            return -1;
        }

        if (pixel.type == PixelType.EXIT) {
            return count;
        }

        if (pixel.isVisited == DFSType.VISITED) {
            return -1;
        }

        if (pixel.isVisited == DFSType.VISITING) {
            return -1;
        }

        pixel.isVisited = DFSType.VISITING;

        int corner = 0;
        Pixel down = getDown(pixel);
        Pixel up = getUp(pixel);
        Pixel left = getLeft(pixel);
        Pixel right = getRight(pixel);

        if (down != null && (down.type == PixelType.EMPTY || down.type == PixelType.EXIT) && down.isVisited == DFSType.EMPTY) {
            corner++;
        }

        if (up != null && (up.type == PixelType.EMPTY || up.type == PixelType.EXIT) && up.isVisited == DFSType.EMPTY) {
            corner++;
        }

        if (left != null && (left.type == PixelType.EMPTY || left.type == PixelType.EXIT) && left.isVisited == DFSType.EMPTY) {
            corner++;
        }

        if (right != null && (right.type == PixelType.EMPTY || right.type == PixelType.EXIT) && right.isVisited == DFSType.EMPTY) {
            corner++;
        }

        if (corner > 1) {
            count = count + 1;
        }

        int value = 0;
        int downDFS = DFS(down, count);
        if (downDFS > 0) {
            value = downDFS;
        }
        

        int upDFS = DFS(up, count);
        if (upDFS > 0) {
            value = upDFS;
        }

        int leftDFS = DFS(left, count);
        if (leftDFS > 0) {
            value = leftDFS;
        }

        int rightDFS = DFS(right, count);
        if (rightDFS > 0) {
            value = rightDFS;
        }

        pixel.isVisited = DFSType.VISITED;
        return value;

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < coloumn; y++) {
                sb.append(pixels[x][y]);
            }
            sb.append("\n");
        }

        return sb.toString();
    }

}

enum DFSType {

    VISITING, VISITED, EMPTY;
}

enum PixelType {

    EMPTY, TREE, EXIT, HERMIONE;
}

class Pixel {

    PixelType type;
    int x;
    int y;
    DFSType isVisited;

    public Pixel(PixelType type, int x, int y) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.isVisited = DFSType.EMPTY;
    }

    @Override
    public String toString() {
        if (type == PixelType.EMPTY) {
            return ".";
        } else if (type == PixelType.EXIT) {
            return "*";
        } else if (type == PixelType.TREE) {
            return "X";
        } else if (type == PixelType.HERMIONE) {
            return "M";
        } else {
            return "";
        }
    }
}
