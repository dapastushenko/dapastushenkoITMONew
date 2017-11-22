/*
* Создайте массив из всех нечётных чисел от 1 до 99,
* выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку,
* но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
package lesson3.firstPart;

public class Task32 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 0; i <= 99; i++) {
            if (i % 2 != 0)
                n++;
        }
        int[] Nech = new int[n];
        for (int i = 1, q = 0; i <= 99; i++) {
            if (i % 2 != 0) {
                Nech[q] = i;
                q++;
            }
        }
        for (int i = Nech.length-1; i >= 0; i--) {
            System.out.println(Nech[i]);
        }

    }
}
