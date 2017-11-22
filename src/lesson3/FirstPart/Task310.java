/*
Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. Определите какой
элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. Если два каких-то элемента встречаются
одинаковое количество раз, то не выводите ничего.
 */
package lesson3.FirstPart;

import java.util.Arrays;

public class Task310 {
    public static void main(String[] args) {
        int firstCount = 0;
        int secondCount = 0;
        int[] rndArray = new int[11];

        for (int i = 0; i <= 10; i++) {
            rndArray[i] = (int) (Math.random() * (2 - (-1) + (-1)));
            if (rndArray[i] == (-1)) {
                firstCount++;
            } else {
                secondCount++;
            }
        }
        System.out.println(Arrays.toString(rndArray));
        if (firstCount > secondCount) {
            System.out.println("-1 встречается чаще");
        }
        else{
            System.out.println("1 встречается чаще");
        }
    }

}
