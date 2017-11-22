package lesson2;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 натуральных числа");
        int n = in.nextInt();
        int m = in.nextInt();
        if (Math.abs(n-10)>Math.abs(m-10)) {
            System.out.println(m);
        }
            else{
                System.out.println(n);
            }
    }
}
