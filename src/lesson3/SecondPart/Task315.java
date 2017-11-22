/*
Создать двумерный массив из 5 строк по 8 столбцов в каждой из случайных целых чисел из отрезка [-99;99]. Вывести
массив на экран. После на отдельной строке вывести на экран значение максимального элемента этого массива (его индекс
не имеет значения).
 */
package lesson3.SecondPart;

import java.util.Arrays;

public class Task315 {
    public static void main(String[] args) {
        int max = 0;
        int[][] rndarray = new int[5][8];

        for (int i = 0; i <= 4; i++) {
            for (int n = 0; n <= 7; n++) {
                rndarray[i][n] = (int) (Math.random() * ((100 + 10) - 10));
                if (rndarray[i][n] > max) max = rndarray[i][n];
            }
        }
        for (int i = 0; i < rndarray.length; i++) {
            System.out.println(Arrays.toString(rndarray[i]));
        }
        System.out.println(max);
    }
}
