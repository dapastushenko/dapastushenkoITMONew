package Lesson2;

import java.util.Scanner;

public class Task2_1 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int n=in.nextInt();
                if (n%2==0) {
                    System.out.println("Четное число");
                }
                else if (n % 2 > 0) {
                    System.out.println("Нечетное число");
                }
    }
}
