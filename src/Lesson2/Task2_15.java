package Lesson2;

import java.util.Scanner;

public class Task2_15 {
    public static void main(String[] args) {
        int fib = 1;
        int fib1=1;
        int fib2;
        System.out.println(fib);
        System.out.println(fib1);
        for (int i = 1; i <= 9; i++) {
            fib2 = fib + fib1;
            System.out.println(fib2);
            fib=fib1;
            fib1=fib2;
        }

    }
}
