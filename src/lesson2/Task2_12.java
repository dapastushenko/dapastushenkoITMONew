package lesson2;

import java.util.Scanner;

public class Task2_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }
        if (fact != 0) {
            System.out.println(fact);
        }
    }
}
