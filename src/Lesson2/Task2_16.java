package Lesson2;

import java.util.Scanner;

public class Task2_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        int summ = 0;
        while (n != 0) {
            summ = summ + (n % 10);
            n /= 10;
        }
        System.out.println(summ);

    }
}
