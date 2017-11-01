/*
Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из отрезка [-5;5]. Вывести массив
на экран. Определить и вывести на экран индекс строки с наибольшим по модулю произведением элементов. Если таких строк
несколько, то вывести индекс первой встретившейся из них
 */
package Lesson3.SecondPart;

import java.util.Arrays;

public class Task316 {
    public static void main(String[] args) {
        int max = 0;
        int summ = 0;
        int index = 0;
        int[][] rndarray = new int[7][4];

        for (int i = 0; i <= 6; i++) {
            for (int n = 0; n <= 3; n++) {
                rndarray[i][n] = (int) (Math.random() * ((5 + (-5)) - (-5)));
                summ = summ + rndarray[i][n];
            }
            System.out.println(summ);
            if (summ > max) {
                max = summ;
                index = i;
            }
        }
        for (int i = 0; i < rndarray.length; i++) {
            System.out.println(Arrays.toString(rndarray[i]));
        }
        System.out.println(index+1);
    }
}
