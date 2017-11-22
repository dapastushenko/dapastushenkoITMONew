/*
Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */
package lesson3.FirstPart;

import java.util.Arrays;

public class Task34 {
    public static void main(String[] Args) {

        int[] rnd = new int[8];
        int count = 0;
        for (int i = 0; i <= 7; i++) {
            if (i % 2 != 0) {
                rnd[i] = 0;
            } else {
                rnd[i] = (int) (Math.random() * (11 - 1) + 1);
            }

        }
        System.out.println(Arrays.toString(rnd));
    }
}
