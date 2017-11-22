/*
 * Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, отделяя
 * один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
 * Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 
 */
package lesson3.firstPart;

import java.util.Arrays;

public class Task31 {
    public static void main (String[] args){
        int[] chetnie={2,4,6,8,10,12,14,16,18,20};
        System.out.println(Arrays.toString(chetnie));
    }
}
