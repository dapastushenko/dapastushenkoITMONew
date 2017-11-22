/*
Создайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел.
Каждый элемент с i-ым индексом третьего массива должен равняться отношению элемента из первого массива с i-ым индексом
к элементу из второго массива с i-ым индексом. Вывести все три массива на экран (каждый на отдельной строке), затем
вывести количество целых элементов в третьем массиве.
 */
package lesson3.FirstPart;

import java.util.Arrays;

public class Task39 {
    public static void main(String[] args) {

        int[] celArr1 = new int[10];
        int[] celArr2 = new int[10];
        float[] deistv = new float[10];
        int count=0;

        for (int i = 0; i <= 9; i++) {
            celArr1[i] = (int) (Math.random() * (10 - (1)) + 1);
            celArr2[i] = (int) (Math.random() * (10 - (1)) + 1);
            deistv[i] =(float) celArr1[i] / celArr2[i];
            if (deistv[i]%1==0)
                count++;
        }
        System.out.println(Arrays.toString(celArr1));
        System.out.println(Arrays.toString(celArr2));
        System.out.println(Arrays.toString(deistv));
        System.out.println("Целых чисел: "+count);
    }
}
