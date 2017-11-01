/*
Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран. Напоминаем, что первый и второй члены
последовательности равны единицам, а каждый следующий — сумме двух предыдущих.
 */
package Lesson3.FirstPart;

import java.util.Arrays;

public class Task37 {
    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        int[] fib = new int[20];
        fib[0] = n1;
        fib[1] = n2;

        for (int i = 2; i <= 19; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        System.out.println(Arrays.toString(fib));

    }
}
