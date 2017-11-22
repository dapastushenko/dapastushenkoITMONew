/*
Создайте массив из 4 случайных целых чисел из отрезка [10;99], выведите его на экран в строку. Определить и вывести
на экран сообщение о том, является ли массив строго возрастающей последовательностью.
 */
package lesson3.firstPart;

import java.util.Arrays;

public class Task36 {
    public static void main(String[] args) {
        int[] orig = new int[4];
         for (int i = 0; i <= 3; i++) {
            orig[i]=(int)(Math.random()*(100-10)+10);
        }
     int[] clone=orig.clone();
         Arrays.sort(clone);
         System.out.println(Arrays.toString(orig));
         System.out.println(Arrays.toString(clone));
         if(Arrays.equals(orig,clone))
             System.out.println("Массив является последовательностью");
    }
}
