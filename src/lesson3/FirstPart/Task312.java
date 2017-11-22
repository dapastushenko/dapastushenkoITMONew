/*
Программа должна создать массив из 12 случайных целых чисел из отрезка [-10;10] таким образом, чтобы отрицательных
и положительных элементов там было поровну и не было нулей. При этом порядок следования элементов должен быть случаен
(т. е. не подходит вариант, когда в массиве постоянно выпадает сначала 6 положительных, а потом 6 отрицательных чисел
или же когда элементы постоянно чередуются через один и пр.). Вывести полученный массив на экран.
 */

package lesson3.FirstPart;

import java.util.Arrays;

public class Task312 {
    public static void main(String[] args) {
        int positive = 0;
        int negative = 0;
        int[] rndarray = new int[12];

        for (int i = 0; i <= 11; i++) {
            rndarray[i] = (int) (Math.random() * (6 - (-10)) + (-10));
            if ((negative >= 6 && rndarray[i] < 0)||(positive >= 6 && rndarray[i] > 0))
                rndarray[i] = rndarray[i] * (-1);
            if (rndarray[i] < 0) {
                negative = negative + 1;
            } else {
                positive = positive + 1;
            }
        }
System.out.println(Arrays.toString(rndarray));
    }
}

