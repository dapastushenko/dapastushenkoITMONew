/*
Пользователь должен указать с клавиатуры чётное положительное число, а программа должна создать массив указанного
размера из случайных целых чисел из [-5;5] и вывести его на экран в строку. После этого программа должна определить и
сообщить пользователю о том, сумма модулей какой половины массива больше: левой или правой, либо сообщить, что эти
суммы модулей равны. Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до
тех пор, пока не будет указано корректное значение.
 */
package Lesson3.FirstPart;

import java.util.Arrays;
import java.util.Scanner;

public class Task311 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int arrayEnd = in.nextInt();
        int abssummleft = 0, abssummright = 0;
        int[] rndarray = new int[arrayEnd];

        if (arrayEnd % 2 == 0 && arrayEnd!=0) {
            for (int i = 0; i <= arrayEnd - 1; i++) {
                rndarray[i] = (int) (Math.random() * (6 - (-5)) + (-5));
            }
            for (int i = 0; i <= (arrayEnd / 2) - 1; i++) {
                abssummleft = abssummleft + Math.abs(rndarray[i]);
            }
            for (int i = arrayEnd - 1; i >= (arrayEnd / 2); i--) {
                abssummright = abssummright + Math.abs(rndarray[i]);
            }
            System.out.println(Arrays.toString(rndarray));
            if (abssummleft > abssummright) {
                System.out.println("Сумма больше в левой половине");
            }
            else {
                System.out.println("Сумма больше в правой половине");
            }
        } else {
            System.out.println("Ошибка, вы ввели нечетное число либо 0");
        }

    }
}
