/*
Создать двумерный массив из 6 строк по 7 столбцов в каждой из случайных целых чисел из отрезка [0;9]. Вывести массив
на экран. Преобразовать массив таким образом, чтобы на первом месте в каждой строке стоял её наибольший элемент. При
этом изменять состав массива нельзя, а можно только переставлять элементы в рамках одной строки. Порядок остальных
элементов строки не важен (т.е. можно соврешить только одну перестановку, а можно отсортировать по убыванию каждую
строку). Вывести преобразованный массив на экран.
 */
package lesson3.SecondPart;

import java.util.Arrays;

public class Task317 {
    public static void main(String[] args) {
        int[][] rndarray = new int[6][7];
        int first = 0;
        int position = 0;
        int max = 0;

        for (int i = 0; i <= 5; i++) {
            for (int n = 0; n <= 6; n++) {
                rndarray[i][n] = (int) (Math.random() * (9 + 0));
                if (rndarray[i][n] > max) {
                    max = rndarray[i][n];
                    position = n;
                }
            }
            first = rndarray[i][0];
            rndarray[i][0] = max;
            rndarray[i][position] = first;
        }

        for (int i = 0; i < rndarray.length; i++) {
            System.out.println(Arrays.toString(rndarray[i]));
        }
    }
}
