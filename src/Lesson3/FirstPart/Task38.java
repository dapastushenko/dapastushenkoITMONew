/*
Создайте массив из 12 случайных целых чисел из отрезка [-15;15]. Определите какой элемент является в этом массиве
максимальным и сообщите индекс его последнего вхождения в массив.
 */

package Lesson3.FirstPart;

import java.util.Arrays;

public class Task38 {
    public static void main(String[] args) {
        int[] rnd = new int[30];
        int position=0, max = 0;

        for (int i = 0; i <= 29; i++) {
            rnd[i] = (int) (Math.random() * (16 - (-15)) + (-15));

            if (i == 0) {
                max = rnd[i];
                position = i;
            } else if (i > 0 && max<rnd[i]) {
                max = rnd[i];
                position = i;
            }
        }
        System.out.println(Arrays.toString(rnd));
        System.out.println("Максимально число:" + max + " Позиция:" + position);
    }
}
