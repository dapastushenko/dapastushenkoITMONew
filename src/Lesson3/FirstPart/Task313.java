/*
Пользователь вводит с клавиатуры натуральное число большее 3, которое сохраняется в переменную n. Если пользователь
ввёл не подходящее число, то программа должна просить пользователя повторить ввод. Создать массив из n случайных целых
чисел из отрезка [0;n] и вывести его на экран. Создать второй массив только из чётных элементов первого массива, если
они там есть, и вывести его на экран.
 */
package Lesson3.FirstPart;

import java.util.ArrayList;
import java.util.Scanner;

public class Task313 {
    public static void main(String[] args) {
        int n = 0;
        Scanner in = new Scanner(System.in);
        while (n < 3) {
            System.out.println("Введите число n больше 3");
            n = in.nextInt();
        }

        ArrayList rndArrayList = new ArrayList();
        ArrayList evenArrayList = new ArrayList();

        for (int i = 0; i <= n - 1; i++) {
            rndArrayList.add((int) (Math.random() * ((n + 1) - 0)));
            if ((int) rndArrayList.get(i) % 2 == 0)
                evenArrayList.add(rndArrayList.get(i));
        }
        System.out.println(rndArrayList.toString());
        System.out.println(evenArrayList.toString());
    }
}
