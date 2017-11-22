package lesson3.secondPart;

import java.util.Arrays;

public class Task314 {
    public static void main(String[] args) {
        int[][] rndarray = new int[8][5];

        for (int i = 0; i <= 7; i++) {
            for (int n = 0; n <= 4; n++) {
                rndarray[i][n] = (int) (Math.random() * ((100 + 10) - 10));
            }
        }
        for (int i = 0; i < rndarray.length; i++) {
            System.out.println(Arrays.toString(rndarray[i]));
        }
    }
}