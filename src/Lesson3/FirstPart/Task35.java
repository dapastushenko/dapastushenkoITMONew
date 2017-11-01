/*
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, выведите массивы на экран в двух отдельных
строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это значение
оказалось больше (либо сообщите, что их средние арифметические равны).
 */
package Lesson3.FirstPart;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task35 {
    public static void main(String[] args) {
        int[] first = new int[5];
        int[] second = new int[5];

        for (int i = 0; i <= 4; i++) {
            first[i] = (int) (Math.random() * (6 - 0));
            second[i] = (int) (Math.random() * (6 - 0));
        }
        double avrg1 = Arrays.stream(first).summaryStatistics().getAverage();
        double avrg2 = Arrays.stream(second).summaryStatistics().getAverage();
        if (avrg1>avrg2){
            System.out.println("Среднеарифметическое больше для первого массива");
        }
        else if((avrg1<avrg2)){
            System.out.println("Среднеарифметическое больше для второго массива");
        }
        else{
            System.out.println("Среднеарифметические массивов равны");
        }
        System.out.println(avrg1+" "+avrg2);
    }


}
