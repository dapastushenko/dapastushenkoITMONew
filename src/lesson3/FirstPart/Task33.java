/*
Создайте массив из 15 случайных целых чисел из отрезка [0;9].
Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов и выведете это
количество на экран на отдельной строке.
 */
package lesson3.FirstPart;

import java.util.Arrays;

public class Task33 {
    public static void main(String[] Args) {

        int[] rnd = new int[15];
        int count = 0;
        for (int i = 0; i <= 14; i++) {
            rnd[i] = (int) (Math.random() * (10 - 0));
            if ((rnd[i] % 2 == 0) & rnd[i] != 0)
                count++;
        }
        System.out.println(Arrays.toString(rnd));
        System.out.println(count);
    }
}
