package lesson2;

import java.util.Scanner;

public class Task2_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Делители отсутствуют");
        }
        for (int i = 1; i <= Math.abs(n); i++) {
            if (Math.abs(n)%i==0){
                System.out.println(i);
            }
        }

    }
}
